

package com.anova.anovacloud.client.application.attorney;

import java.util.Arrays;
import java.util.List;

import javax.inject.Inject;

import com.google.web.bindery.event.shared.EventBus;
import com.anova.anovacloud.client.application.ApplicationPresenter;
import com.anova.anovacloud.client.application.event.ActionBarEvent;
import com.anova.anovacloud.client.application.event.ActionBarVisibilityEvent;
import com.anova.anovacloud.client.application.event.ChangeActionBarEvent;
import com.anova.anovacloud.client.application.event.ChangeActionBarEvent.ActionType;
import com.anova.anovacloud.client.application.attorney.AttorneyPresenter.MyProxy;
import com.anova.anovacloud.client.application.attorney.AttorneyPresenter.MyView;
import com.anova.anovacloud.client.application.attorney.event.AttorneyAddedEvent;
import com.anova.anovacloud.client.application.attorney.ui.EditAttorneyPresenter;
import com.anova.anovacloud.client.place.NameTokens;
import com.anova.anovacloud.client.rest.AttorneyService;
import com.anova.anovacloud.client.util.AbstractAsyncCallback;
import com.anova.anovacloud.client.util.ErrorHandlerAsyncCallback;
import com.anova.anovacloud.shared.dto.AttorneyDto;
import com.gwtplatform.dispatch.rest.shared.RestDispatch;
import com.gwtplatform.mvp.client.HasUiHandlers;
import com.gwtplatform.mvp.client.Presenter;
import com.gwtplatform.mvp.client.View;
import com.gwtplatform.mvp.client.annotations.NameToken;
import com.gwtplatform.mvp.client.annotations.ProxyCodeSplit;
import com.gwtplatform.mvp.client.annotations.ProxyEvent;
import com.gwtplatform.mvp.client.proxy.PlaceManager;
import com.gwtplatform.mvp.client.proxy.ProxyPlace;
import com.gwtplatform.mvp.shared.proxy.PlaceRequest;
import com.gwtplatform.mvp.shared.proxy.PlaceRequest.Builder;

public class AttorneyPresenter extends Presenter<MyView, MyProxy>
        implements AttorneyUiHandlers, ActionBarEvent.ActionBarHandler {

    interface MyView extends View, HasUiHandlers<AttorneyUiHandlers> {
        void addAttorney(AttorneyDto attorneyDto);

        void displayAttorneys(List<AttorneyDto> attorneyDtos);

        void removeAttorney(AttorneyDto attorneyDto);

        void replaceAttorney(AttorneyDto oldAttorney, AttorneyDto newAttorney);
    }

    @ProxyCodeSplit
    @NameToken(NameTokens.ATTORNEY)
    interface MyProxy extends ProxyPlace<AttorneyPresenter> {
    }

    private final RestDispatch dispatcher;
    private final PlaceManager placeManager;
    private final AttorneyService attorneyService;
    private final EditAttorneyPresenter editAttorneyPresenter;

    private AttorneyDto editingAttorney;

    @Inject
    AttorneyPresenter(EventBus eventBus,
                          MyView view,
                          MyProxy proxy,
                          RestDispatch dispatcher,
                          AttorneyService attorneyService,
                          PlaceManager placeManager,
                          EditAttorneyPresenter editAttorneyPresenter) {
        super(eventBus, view, proxy, ApplicationPresenter.SLOT_MAIN_CONTENT);

        this.dispatcher = dispatcher;
        this.placeManager = placeManager;
        this.attorneyService = attorneyService;
        this.editAttorneyPresenter = editAttorneyPresenter;

        getView().setUiHandlers(this);
    }

    @Override
    public void onActionEvent(ActionBarEvent event) {
        if (event.getActionType() == ActionType.ADD && event.isTheSameToken(NameTokens.getAttorney())) {
            placeManager.revealPlace(new Builder().nameToken(NameTokens.getDetailAttorney()).build());
        }
    }

    @Override
    public void onDetail(AttorneyDto attorneyDto) {
        PlaceRequest placeRequest = new Builder().nameToken(NameTokens.getDetailAttorney())
                                                 .with("id", String.valueOf(attorneyDto.getId()))
                                                 .build();

        placeManager.revealPlace(placeRequest);
    }

    @Override
    public void onEdit(AttorneyDto attorneyDto) {
        editingAttorney = attorneyDto;
        editAttorneyPresenter.edit(attorneyDto);
    }

    @Override
    public void onCreate() {
        editingAttorney = null;
        editAttorneyPresenter.createNew();
    }

    @Override
    public void onDelete(final AttorneyDto attorneyDto) {
        dispatcher.execute(attorneyService.delete(attorneyDto.getId()),
                new ErrorHandlerAsyncCallback<Void>(this) {
                    @Override
                    public void onSuccess(Void nothing) {
                        getView().removeAttorney(attorneyDto);
                    }
                });
    }

    @Override
    protected void onReveal() {
        ActionBarVisibilityEvent.fire(this, true);
        ChangeActionBarEvent.fire(this, Arrays.asList(ActionType.ADD), true);

        dispatcher.execute(attorneyService.getAttorneys(), new AbstractAsyncCallback<List<AttorneyDto>>() {
            @Override
            public void onSuccess(List<AttorneyDto> attorneys) {
                getView().displayAttorneys(attorneys);
            }
        });
    }

    @Override
    protected void onBind() {
        addRegisteredHandler(ActionBarEvent.getType(), this);
    }

    @ProxyEvent
    void onAttorneyAdded(AttorneyAddedEvent event) {
        if (editingAttorney != null) {
            getView().replaceAttorney(editingAttorney, event.getAttorney());
        } else {
            getView().addAttorney(event.getAttorney());
        }

        editingAttorney = event.getAttorney();
    }
}
