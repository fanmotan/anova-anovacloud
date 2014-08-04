
package com.anova.anovacloud.client.application.matters;

import java.util.Arrays;
import java.util.List;

import javax.inject.Inject;

import com.google.gwt.view.client.HasData;
import com.google.gwt.view.client.Range;
import com.google.web.bindery.event.shared.EventBus;
import com.anova.anovacloud.client.application.ApplicationPresenter;
import com.anova.anovacloud.client.application.matters.MattersPresenter.MyProxy;
import com.anova.anovacloud.client.application.matters.MattersPresenter.MyView;
import com.anova.anovacloud.client.application.matters.matter.MatterPresenter;
import com.anova.anovacloud.client.application.matters.matter.MatterProxyFactory;
import com.anova.anovacloud.client.application.matters.event.MatterAddedEvent;
import com.anova.anovacloud.client.application.event.ActionBarEvent;
import com.anova.anovacloud.client.application.event.ActionBarVisibilityEvent;
import com.anova.anovacloud.client.application.event.ChangeActionBarEvent;
import com.anova.anovacloud.client.application.event.ChangeActionBarEvent.ActionType;
import com.anova.anovacloud.client.place.NameTokens;
import com.anova.anovacloud.client.rest.MattersService;
import com.anova.anovacloud.client.util.AbstractAsyncCallback;
import com.anova.anovacloud.client.util.ErrorHandlerAsyncCallback;
import com.anova.anovacloud.shared.dto.MatterDto;
import com.gwtplatform.dispatch.rest.shared.RestDispatch;
import com.gwtplatform.mvp.client.HasUiHandlers;
import com.gwtplatform.mvp.client.Presenter;
import com.gwtplatform.mvp.client.View;
import com.gwtplatform.mvp.client.annotations.NameToken;
import com.gwtplatform.mvp.client.annotations.ProxyCodeSplit;
import com.gwtplatform.mvp.client.annotations.ProxyEvent;
import com.gwtplatform.mvp.client.proxy.PlaceManager;
import com.gwtplatform.mvp.client.proxy.ProxyPlace;
import com.gwtplatform.mvp.shared.proxy.PlaceRequest.Builder;

public class MattersPresenter extends Presenter<MyView, MyProxy>
        implements MattersUiHandlers, MatterAddedEvent.MatterAddedHandler, ActionBarEvent.ActionBarHandler {

    public interface MyView extends View, HasUiHandlers<MattersUiHandlers> {
        void initDataProvider();

        void setMattersCount(Integer result);

        void displayMatters(int offset, List<MatterDto> matters);

        HasData<MatterDto> getMatterDisplay();
    }

    @ProxyCodeSplit
    @NameToken(NameTokens.MATTERS)
    public interface MyProxy extends ProxyPlace<MattersPresenter> {
    }

    private final RestDispatch dispatcher;
    private final MattersService mattersService;
    private final PlaceManager placeManager;
    private final MatterProxyFactory matterProxyFactory;

    @Inject
    MattersPresenter(EventBus eventBus,
                  MyView view,
                  MyProxy proxy,
                  RestDispatch dispatcher,
                  MattersService mattersService,
                  PlaceManager placeManager,
                  MatterProxyFactory matterProxyFactory) {
        super(eventBus, view, proxy, ApplicationPresenter.SLOT_MAIN_CONTENT);

        this.dispatcher = dispatcher;
        this.mattersService = mattersService;
        this.placeManager = placeManager;
        this.matterProxyFactory = matterProxyFactory;

        getView().setUiHandlers(this);
    }

    @Override
    public void onActionEvent(ActionBarEvent event) {
        if (event.getActionType() == ActionType.ADD && event.isTheSameToken(NameTokens.getMatters())) {
            placeManager.revealPlace(new Builder().nameToken(NameTokens.NEW_MATTER).build());
        }
    }

    @Override
    public void onEdit(MatterDto matterDto) {
        MatterPresenter.MyProxy proxy = matterProxyFactory.create(matterDto,
                matterDto.getCustomer().getName() + matterDto.getMatterNum()+matterDto.getMatterSerialNum());

        placeManager.revealPlace(new Builder().nameToken(proxy.getNameToken()).build());
    }

    @Override
    public void onCreate() {
        placeManager.revealPlace(new Builder().nameToken(NameTokens.NEW_MATTER).build());
    }

    @Override
    public void fetchData(final int offset, int limit) {
        dispatcher.execute(mattersService.getMatters(offset, limit), new AbstractAsyncCallback<List<MatterDto>>() {
            @Override
            public void onSuccess(List<MatterDto> matters) {
                getView().displayMatters(offset, matters);
            }
        });
    }

    @Override
    public void onDelete(MatterDto matterDto) {
        dispatcher.execute(mattersService.matter(matterDto.getId()).delete(), new ErrorHandlerAsyncCallback<Void>(this) {
            @Override
            public void onSuccess(Void nothing) {
                fetchDataForDisplay();

                getView().setMattersCount(getView().getMatterDisplay().getRowCount() - 1);
            }
        });
    }

    @ProxyEvent
    @Override
    public void onMatterAdded(MatterAddedEvent event) {
        fetchDataForDisplay();

        if (event.isNew()) {
            getView().setMattersCount(getView().getMatterDisplay().getRowCount() + 1);
        }
    }

    @Override
    protected void onBind() {
        addRegisteredHandler(ActionBarEvent.getType(), this);
        matterProxyFactory.create(new MatterDto(), NameTokens.NEW_MATTER);
    }

    @Override
    protected void onReveal() {
        ActionBarVisibilityEvent.fire(this, true);
        ChangeActionBarEvent.fire(this, Arrays.asList(ActionType.ADD), true);
        getView().initDataProvider();

        dispatcher.execute(mattersService.getMattersCount(), new AbstractAsyncCallback<Integer>() {
            @Override
            public void onSuccess(Integer result) {
                getView().setMattersCount(result);
            }
        });
    }

    private void fetchDataForDisplay() {
        Range range = getView().getMatterDisplay().getVisibleRange();
        fetchData(range.getStart(), range.getLength());
    }
}
