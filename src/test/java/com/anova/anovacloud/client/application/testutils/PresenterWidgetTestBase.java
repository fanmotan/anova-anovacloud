

package com.anova.anovacloud.client.application.testutils;

import com.google.inject.Inject;
import com.google.inject.name.Named;
import com.google.web.bindery.event.shared.EventBus;
import com.gwtplatform.dispatch.rest.shared.RestDispatch;

/**
 * Basic configuration for PresenterWidgetTest, you test must extends this
 * class, or don't forget to inject everything inside your presenter's test.
 */
public abstract class PresenterWidgetTestBase {
    @Inject
    public EventBus eventBus;
    @Inject
    public RelayingRestDispatcher dispatcher;
    @Inject
    @Named("mock")
    public RestDispatch mockDispatcher;
}
