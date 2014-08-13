
package com.anova.anovacloud.client.application;

import com.anova.anovacloud.client.application.matters.MattersDesktopModule;
import com.anova.anovacloud.client.application.login.LoginModule;
import com.anova.anovacloud.client.application.customers.CustomersDesktopModule;
import com.anova.anovacloud.client.application.customers.CustomersModule;
import com.anova.anovacloud.client.application.user.UserModule;
import com.anova.anovacloud.client.application.matterAction.MatterActionModule;
import com.anova.anovacloud.client.application.report.ReportModule;
import com.anova.anovacloud.client.application.widget.WidgetModule;
import com.anova.anovacloud.client.application.widget.message.MessagesModule;
import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;

public class ApplicationDesktopModule extends AbstractPresenterModule {
    @Override
    protected void configure() {
        install(new UnauthorizedModule());
        install(new LoginModule());
        install(new CustomersDesktopModule());
        install(new MattersDesktopModule());
        install(new MatterActionModule());
        install(new WidgetModule());
        install(new MessagesModule());
        install(new ReportModule());
        install(new UserModule());

        bindPresenter(ApplicationPresenter.class, ApplicationPresenter.MyView.class, ApplicationView.class,
                ApplicationPresenter.MyProxy.class);
    }
}
