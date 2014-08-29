
package com.anova.anovacloud.client.application.report;

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
import com.anova.anovacloud.shared.dto.ActionDueDto;
import com.gwtplatform.dispatch.rest.shared.RestDispatch;
import com.gwtplatform.mvp.client.Presenter;
import com.gwtplatform.mvp.client.View;
import com.gwtplatform.mvp.client.annotations.NameToken;
import com.gwtplatform.mvp.client.annotations.ProxyCodeSplit;
import com.gwtplatform.mvp.client.proxy.ProxyPlace;

public class ReportPresenter extends Presenter<ReportPresenter.MyView, ReportPresenter.MyProxy> {
    interface MyView extends View {
        void displayReport(List<ActionDueDto> actionDues);
    }

    @ProxyCodeSplit
    @NameToken(NameTokens.REPORT)
    interface MyProxy extends ProxyPlace<ReportPresenter> {
    }

    private final RestDispatch dispatcher;
    private final MatterActionService matterActionService;

    @Inject
    ReportPresenter(EventBus eventBus,
                    MyView view,
                    MyProxy proxy,
                    MatterActionService matterActionService,
                    RestDispatch dispatcher) {
        super(eventBus, view, proxy, ApplicationPresenter.SLOT_MAIN_CONTENT);

        this.dispatcher = dispatcher;
        this.matterActionService = matterActionService;
    }

    @Override
    protected void onReveal() {
        ActionBarVisibilityEvent.fire(this, true);
        ChangeActionBarEvent.fire(this, new ArrayList<ActionType>(), true);

        dispatcher.execute(matterActionService.getDueThreeDaysActions(),
        		new AbstractAsyncCallback<List<ActionDueDto>>() {
                    @Override
                    public void onSuccess(List<ActionDueDto> actionDues) {
                        getView().displayReport(actionDues);
                    }
                });
    }
}
