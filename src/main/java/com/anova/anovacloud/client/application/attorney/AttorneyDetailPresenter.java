
package com.anova.anovacloud.client.application.attorney;

import java.util.Arrays;
import java.util.List;

import javax.inject.Inject;

import com.google.common.base.Strings;
import com.google.web.bindery.event.shared.EventBus;
import com.anova.anovacloud.client.application.ApplicationPresenter;
import com.anova.anovacloud.client.application.event.ActionBarEvent;
import com.anova.anovacloud.client.application.event.ChangeActionBarEvent;
import com.anova.anovacloud.client.application.event.ChangeActionBarEvent.ActionType;
import com.anova.anovacloud.client.application.event.DisplayMessageEvent;
import com.anova.anovacloud.client.application.event.GoBackEvent;
import com.anova.anovacloud.client.application.attorney.AttorneyDetailPresenter.MyProxy;
import com.anova.anovacloud.client.application.attorney.AttorneyDetailPresenter.MyView;
import com.anova.anovacloud.client.application.widget.message.Message;
import com.anova.anovacloud.client.application.widget.message.MessageStyle;
import com.anova.anovacloud.client.place.NameTokens;
import com.anova.anovacloud.client.resources.EditAttorneyMessages;
import com.anova.anovacloud.client.rest.AttorneyService;
import com.anova.anovacloud.client.rest.AttorneyStatusService;
import com.anova.anovacloud.client.util.AbstractAsyncCallback;
import com.anova.anovacloud.client.util.ErrorHandlerAsyncCallback;
import com.anova.anovacloud.shared.dto.AttorneyDto;
import com.anova.anovacloud.shared.dto.AttorneyStatusDto;
import com.gwtplatform.dispatch.rest.shared.RestDispatch;
import com.gwtplatform.mvp.client.HasUiHandlers;
import com.gwtplatform.mvp.client.Presenter;
import com.gwtplatform.mvp.client.View;
import com.gwtplatform.mvp.client.annotations.NameToken;
import com.gwtplatform.mvp.client.annotations.ProxyCodeSplit;
import com.gwtplatform.mvp.client.proxy.PlaceManager;
import com.gwtplatform.mvp.client.proxy.ProxyPlace;
import com.gwtplatform.mvp.shared.proxy.PlaceRequest;
import com.gwtplatform.mvp.shared.proxy.PlaceRequest.Builder;

public class AttorneyDetailPresenter extends Presenter<MyView, MyProxy>
        implements GoBackEvent.GoBackHandler, ActionBarEvent.ActionBarHandler, AttorneyDetailUiHandlers {

    interface MyView extends View, HasUiHandlers<AttorneyDetailUiHandlers> {
        void edit(AttorneyDto attorneyDto);
        void setAllowedAttorneyStatuss(List<AttorneyStatusDto> attorneyStatusDtos);
        void getAttorney();
    }

    @ProxyCodeSplit
    @NameToken(NameTokens.DETAIL_ATTORNEY)
    interface MyProxy extends ProxyPlace<AttorneyDetailPresenter> {
    }

    private final RestDispatch dispatcher;
    private final AttorneyService attorneyService;
    private final AttorneyStatusService attorneyStatusService;
    private final PlaceManager placeManager;
    private final EditAttorneyMessages messages;

    private AttorneyDto currentAttorney;
    private Boolean createNew;

    @Inject
    AttorneyDetailPresenter(EventBus eventBus,
                                MyView view,
                                MyProxy proxy,
                                RestDispatch dispatcher,
                                AttorneyService attorneyService,
                                AttorneyStatusService attorneyStatusService,
                                PlaceManager placeManager,
                                EditAttorneyMessages messages) {
        super(eventBus, view, proxy, ApplicationPresenter.SLOT_MAIN_CONTENT);

        this.dispatcher = dispatcher;
        this.attorneyService = attorneyService;
        this.attorneyStatusService = attorneyStatusService;
        this.placeManager = placeManager;
        this.messages = messages;

        getView().setUiHandlers(this);
    }

    @Override
    public void prepareFromRequest(PlaceRequest request) {
        String param = request.getParameter("id", null);
        createNew = Strings.isNullOrEmpty(param);

        if (!createNew) {
            Long id = Long.parseLong(param);
            dispatcher.execute(attorneyService.get(id), new AbstractAsyncCallback<AttorneyDto>() {
                @Override
                public void onSuccess(AttorneyDto attorney) {
                    currentAttorney = attorney;
                    getView().edit(currentAttorney);
                }
            });
        } else {
            currentAttorney = new AttorneyDto();
            getView().edit(currentAttorney);
        }
    }

    @Override
    public void onGoBack(GoBackEvent event) {
        placeManager.revealPlace(new Builder().nameToken(NameTokens.getAttorney()).build());
    }

    @Override
    public void onActionEvent(ActionBarEvent event) {
        if (event.isTheSameToken(NameTokens.getDetailAttorney())) {
            switch (event.getActionType()) {
                case UPDATE:
                    getView().getAttorney();
                    break;
                case DONE:
                    getView().getAttorney();
                    break;
             //   case DELETE:
              //      deleteAttorney();
             //       break;
            }
        }
    }

    @Override
    public void onSave(AttorneyDto attorneyDto) {
        dispatcher.execute(attorneyService.saveOrCreate(attorneyDto),
                new ErrorHandlerAsyncCallback<AttorneyDto>(this) {
                    @Override
                    public void onSuccess(AttorneyDto savedAttorneyDto) {
                        DisplayMessageEvent.fire(AttorneyDetailPresenter.this,
                                new Message(messages.attorneySaved(), MessageStyle.SUCCESS));
                        placeManager.revealPlace(new Builder().nameToken(NameTokens.getAttorney()).build());
                    }
                });
    }

    @Override
    protected void onBind() {
        addRegisteredHandler(GoBackEvent.getType(), this);
        addRegisteredHandler(ActionBarEvent.getType(), this);
    }

    @Override
    protected void onReveal() {
        List<ActionType> actions;
        if (createNew) {
            actions = Arrays.asList(ActionType.DONE);
            ChangeActionBarEvent.fire(this, actions, false);
        } else {
            actions = Arrays.asList(ActionType.DELETE, ActionType.UPDATE);
            ChangeActionBarEvent.fire(this, actions, false);
        }
    }
/*
    private void deleteAttorney() {
        Boolean confirm = Window.confirm("Are you sure you want to delete " + currentAttorney.getDisplayName() + "?");
        if (confirm) {
            dispatcher.execute(attorneyService.delete(currentAttorney.getId()),
                    new ErrorHandlerAsyncCallback<Void>(this) {
                        @Override
                        public void onSuccess(Void nothing) {
                            placeManager.revealPlace(new Builder().nameToken(NameTokens.getAttorney()).build());
                        }
                    });
        }
    }
    */
    
    private void onGetAttorneyStatussSuccess(List<AttorneyStatusDto> attorneyStatusDtos) {
        getView().setAllowedAttorneyStatuss(attorneyStatusDtos);
        getView().edit(new AttorneyDto());
    }
    
}
