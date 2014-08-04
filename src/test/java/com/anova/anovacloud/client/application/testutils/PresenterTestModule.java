

package com.anova.anovacloud.client.application.testutils;

import org.jukito.JukitoModule;
import org.jukito.TestSingleton;

import com.gwtplatform.dispatch.rest.shared.RestDispatch;
import com.gwtplatform.mvp.client.AutobindDisable;

/**
 * Base module to use while testing presenters. {@link AutomockingModule} is
 * used. Your configuration module must extends this class.
 */
public abstract class PresenterTestModule extends JukitoModule {
    @Override
    protected void configureTest() {
        bindNamedMock(RestDispatch.class, "mock").in(TestSingleton.class);
        bind(RestDispatch.class).to(RelayingRestDispatcher.class);
        bind(RelayingRestDispatcher.class).in(TestSingleton.class);

        configurePresenterTest();

        bind(AutobindDisable.class).toInstance(new AutobindDisable(true));
    }

    protected abstract void configurePresenterTest();
}
