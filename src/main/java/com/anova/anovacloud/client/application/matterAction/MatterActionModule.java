
package com.anova.anovacloud.client.application.matterAction;

import com.anova.anovacloud.client.application.matterAction.ui.EditMatterActionPresenter;
import com.anova.anovacloud.client.application.matterAction.ui.EditMatterActionView;
import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;

public class MatterActionModule extends AbstractPresenterModule {
    @Override
    protected void configure() {
        bindPresenter(MatterActionPresenter.class, MatterActionPresenter.MyView.class, MatterActionView.class,
                MatterActionPresenter.MyProxy.class);

        bindPresenter(MatterActionDetailPresenter.class, MatterActionDetailPresenter.MyView.class, MatterActionDetailView.class,
                MatterActionDetailPresenter.MyProxy.class);

        bindSingletonPresenterWidget(EditMatterActionPresenter.class, EditMatterActionPresenter.MyView.class, EditMatterActionView.class);
    }
}
