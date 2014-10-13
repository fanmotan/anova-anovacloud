package com.anova.anovacloud.client.application.dueThreeDay;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import com.google.web.bindery.event.shared.EventBus;
import com.anova.anovacloud.client.application.ApplicationPresenter;
import com.anova.anovacloud.client.application.event.ActionBarVisibilityEvent;
import com.anova.anovacloud.client.application.event.ChangeActionBarEvent;
import com.anova.anovacloud.client.application.event.ChangeActionBarEvent.ActionType;
import com.anova.anovacloud.client.place.NameTokens;
import com.anova.anovacloud.client.rest.MatterActionService;
import com.anova.anovacloud.client.util.AbstractAsyncCallback;
import com.anova.anovacloud.shared.dto.MatterActionDto;
import com.gwtplatform.dispatch.rest.shared.RestDispatch;
import com.gwtplatform.mvp.client.Presenter;
import com.gwtplatform.mvp.client.View;
import com.gwtplatform.mvp.client.annotations.NameToken;
import com.gwtplatform.mvp.client.annotations.ProxyCodeSplit;
import com.gwtplatform.mvp.client.proxy.ProxyPlace;

public class DueThreeDayPresenter extends Presenter<DueThreeDayPresenter.MyView, DueThreeDayPresenter.MyProxy> {
    interface MyView extends View {
        void displayReport(List<MatterActionDto> actionDues);
    }

    @ProxyCodeSplit
    @NameToken(NameTokens.DUETHREEDAY)
    interface MyProxy extends ProxyPlace<DueThreeDayPresenter> {
    }

    private final RestDispatch dispatcher;
    private final MatterActionService actionService;

    @Inject
    DueThreeDayPresenter(EventBus eventBus,
                    MyView view,
                    MyProxy proxy,
                    MatterActionService actionService,
                    RestDispatch dispatcher) {
        super(eventBus, view, proxy, ApplicationPresenter.SLOT_MAIN_CONTENT);

        this.dispatcher = dispatcher;
        this.actionService = actionService;
    }

    @Override
    protected void onReveal() {
        ActionBarVisibilityEvent.fire(this, true);
        ChangeActionBarEvent.fire(this, new ArrayList<ActionType>(), true);

        dispatcher.execute(actionService.getMatterActions(),
        		new AbstractAsyncCallback<List<MatterActionDto>>() {
                    @Override
                    public void onSuccess(List<MatterActionDto> actionDues) {
                        getView().displayReport(actionDues);
                    }
                });
    }
}
