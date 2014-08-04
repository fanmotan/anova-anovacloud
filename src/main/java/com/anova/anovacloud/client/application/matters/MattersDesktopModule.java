

package com.anova.anovacloud.client.application.matters;

import com.anova.anovacloud.client.application.matters.matter.MatterPresenter;
import com.anova.anovacloud.client.application.matters.matter.MatterView;
import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;

public class MattersDesktopModule extends AbstractPresenterModule {
    @Override
    protected void configure() {
        install(new MattersModule());

        bindPresenter(MattersPresenter.class, MattersPresenter.MyView.class, MattersView.class,
                MattersPresenter.MyProxy.class);

        bind(MatterPresenter.MyView.class).to(MatterView.class);
    }
}
