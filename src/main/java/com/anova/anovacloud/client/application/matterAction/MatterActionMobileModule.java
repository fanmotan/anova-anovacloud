package com.anova.anovacloud.client.application.matterAction;

import com.anova.anovacloud.client.application.matterAction.ui.EditMatterActionPresenter;
import com.anova.anovacloud.client.application.matterAction.ui.EditMatterActionUiHandlers;
import com.anova.anovacloud.client.application.matterAction.ui.EditMatterActionView;
import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;

public class MatterActionMobileModule extends AbstractPresenterModule {
    @Override
    protected void configure() {

        bindPresenter(MatterActionPresenter.class, MatterActionPresenter.MyView.class, MatterActionMobileView.class,
                MatterActionPresenter.MyProxy.class);

        bindPresenter(MatterActionDetailPresenter.class, MatterActionDetailPresenter.MyView.class, MatterActionDetailView.class,
                MatterActionDetailPresenter.MyProxy.class);

        bindSingletonPresenterWidget(EditMatterActionPresenter.class, EditMatterActionPresenter.MyView.class, EditMatterActionView.class);

        bind(EditMatterActionUiHandlers.class).to(EditMatterActionPresenter.class);
        bind(MatterActionUiHandlers.class).to(MatterActionPresenter.class);
        bind(MatterActionDetailUiHandlers.class).to(MatterActionDetailPresenter.class);
    }
}
