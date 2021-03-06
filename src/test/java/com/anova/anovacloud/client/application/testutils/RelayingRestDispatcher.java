
package com.anova.anovacloud.client.application.testutils;

import java.util.HashMap;
import java.util.Map;

import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.inject.TypeLiteral;
import com.gwtplatform.dispatch.client.CompletedDispatchRequest;
import com.gwtplatform.dispatch.rest.shared.RestAction;
import com.gwtplatform.dispatch.rest.shared.RestDispatch;
import com.gwtplatform.dispatch.shared.DispatchRequest;

/**
 * Class used to replace a real implementation of the @{link RestDispatch}. When executing
 * a request for an action, a predefined result will be sent back immediately.
 * <p/>
 * To assign a result to an action, simply do:
 * <code>dispatcher.when({@link RestAction}).willReturn(<b>result</b>);</code>
 */
public class RelayingRestDispatcher implements RestDispatch {
    private Map<TypeLiteral<? extends RestAction<?>>, Object> registry =
            new HashMap<TypeLiteral<? extends RestAction<?>>, Object>();

    private TypeLiteral<? extends RestAction<?>> currentAction = null;

    /**
     * This method must be used at least once before being able to use relaying
     * dispatcher. It will create an entry inside the registry and wait that the
     * use assign a result to it.
     *
     * @param <A>    The {@link com.gwtplatform.dispatch.rest.shared.RestAction} type.
     * @param action The class definition of the {@link com.gwtplatform.dispatch.rest.shared.RestAction}.
     * @return {@link RelayingRestDispatcher} instance.
     */
    public <A extends RestAction<?>> RelayingRestDispatcher given(TypeLiteral<A> action) {
        registry.put(action, null);

        currentAction = action;

        return this;
    }

    /**
     * Once you've called at least one time {@link #given(Class)}, then calling
     * this function will assign a <b>result</b> to the last {@link com.gwtplatform.dispatch.rest.shared.RestAction} you
     * assigned.
     *
     * @param <R>    The result type.
     * @param result the result to add inside the registry.
     */
    public <R> void willReturn(R result) {
        registry.put(currentAction, result);
    }

    @SuppressWarnings("unchecked")
    @Override
    public <A extends RestAction<R>, R> DispatchRequest execute(A action, AsyncCallback<R> callback) {
        assert action instanceof ActionImpl;

        callback.onSuccess((R) registry.get(((ActionImpl) action).getTypeLiteral()));

        return new CompletedDispatchRequest();
    }
}
