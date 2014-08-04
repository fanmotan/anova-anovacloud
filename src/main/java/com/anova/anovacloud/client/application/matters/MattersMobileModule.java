
package com.anova.anovacloud.client.application.matters;

import com.anova.anovacloud.client.application.matters.matter.MatterMobileView;
import com.anova.anovacloud.client.application.matters.matter.MatterPresenter;
import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;

public class MattersMobileModule extends AbstractPresenterModule {
    @Override
    protected void configure() {
        install(new MattersModule());

        bindPresenter(MattersPresenter.class, MattersPresenter.MyView.class, MattersMobileView.class,
                MattersPresenter.MyProxy.class);

        bind(MatterPresenter.MyView.class).to(MatterMobileView.class);
    }
}
