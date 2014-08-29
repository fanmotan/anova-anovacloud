

package com.anova.anovacloud.client.application.attorney;

import com.anova.anovacloud.client.application.attorney.ui.EditAttorneyPresenter;
import com.anova.anovacloud.client.application.attorney.ui.EditAttorneyUiHandlers;
import com.anova.anovacloud.client.application.attorney.ui.EditAttorneyView;
import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;

public class AttorneyModule extends AbstractPresenterModule {
    @Override
    protected void configure() {
        bindPresenter(AttorneyPresenter.class, AttorneyPresenter.MyView.class, AttorneyView.class,
                AttorneyPresenter.MyProxy.class);
        
        bindPresenter(AttorneyDetailPresenter.class, AttorneyDetailPresenter.MyView.class,
                AttorneyDetailView.class, AttorneyDetailPresenter.MyProxy.class);

        bindSingletonPresenterWidget(EditAttorneyPresenter.class, EditAttorneyPresenter.MyView.class,
                EditAttorneyView.class);
        
        bind(AttorneyDetailUiHandlers.class).to(AttorneyDetailPresenter.class);
        bind(AttorneyUiHandlers.class).to(AttorneyPresenter.class);
        bind(EditAttorneyUiHandlers.class).to(EditAttorneyPresenter.class);
    }
}
