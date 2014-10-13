

package com.anova.anovacloud.client.application;

import com.anova.anovacloud.client.application.matters.MattersMobileModule;
import com.anova.anovacloud.client.application.login.LoginMobileModule;
import com.anova.anovacloud.client.application.attorney.AttorneyMobileModule;
import com.anova.anovacloud.client.application.customer.CustomerMobileModule;
import com.anova.anovacloud.client.application.matterAction.MatterActionMobileModule;
import com.anova.anovacloud.client.application.dueToday.ReportMobileModule;
import com.anova.anovacloud.client.application.dueOneWeek.DueOneWeekMobileModule;
import com.anova.anovacloud.client.application.dueOneMonth.DueOneMonthMobileModule;
import com.anova.anovacloud.client.application.dueThreeDay.DueThreeDayMobileModule;
import com.anova.anovacloud.client.application.widget.WidgetModule;
import com.anova.anovacloud.client.application.widget.message.MessagesModule;
import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;
import com.anova.anovacloud.client.application.user.UserMobileModule;

public class ApplicationTabletModule extends AbstractPresenterModule {
    @Override
    protected void configure() {
        install(new UnauthorizedModule());
        install(new LoginMobileModule());
        install(new CustomerMobileModule());
        install(new MattersMobileModule());
        install(new MatterActionMobileModule());
        install(new WidgetModule());
        install(new ReportMobileModule());
        install(new UserMobileModule());
        install(new AttorneyMobileModule());
        install(new DueOneMonthMobileModule());
        install(new DueOneWeekMobileModule());
        install(new DueThreeDayMobileModule());

        // TODO should we make a messaging module for mobile
        install(new MessagesModule());

        bindPresenter(ApplicationPresenter.class, ApplicationPresenter.MyView.class, ApplicationMobileView.class,
                ApplicationPresenter.MyProxy.class);
    }
}
