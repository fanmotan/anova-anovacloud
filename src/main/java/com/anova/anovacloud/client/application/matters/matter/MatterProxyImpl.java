
package com.anova.anovacloud.client.application.matters.matter;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import com.google.inject.Provider;
import com.google.inject.assistedinject.Assisted;
import com.google.web.bindery.event.shared.EventBus;
import com.google.web.bindery.event.shared.HandlerRegistration;
import com.anova.anovacloud.client.application.matters.matter.navigation.NavigationTab;
import com.anova.anovacloud.client.application.matters.matter.navigation.NavigationTabEvent;
import com.gwtplatform.common.client.StandardProvider;
import com.gwtplatform.mvp.client.proxy.NotifyingAsyncCallback;
import com.gwtplatform.mvp.client.proxy.PlaceImpl;
import com.gwtplatform.mvp.client.proxy.PlaceManager;
import com.gwtplatform.mvp.client.proxy.ProxyImpl;
import com.gwtplatform.mvp.client.proxy.ProxyPlaceImpl;

public class MatterProxyImpl extends ProxyPlaceImpl<MatterPresenter> implements MatterPresenter.MyProxy {
    public static class WrappedProxy extends ProxyImpl<MatterPresenter> {
        @Inject
        public WrappedProxy(Provider<MatterPresenter> presenter) {
            this.presenter = new StandardProvider<>(presenter);
        }
    }

    private List<HandlerRegistration> handlers = new ArrayList<>();

    @Inject
    MatterProxyImpl(@Assisted MatterPresenterProvider matterPresenterProvider,
                 @Assisted String nameToken) {
        matterPresenterProvider.setProxy(this);

        setProxy(new WrappedProxy(matterPresenterProvider));
        setPlace(new PlaceImpl(nameToken));
    }

    @Override
    protected void bind(PlaceManager placeManager, final EventBus eventBus) {
        super.bind(placeManager, eventBus);

        NavigationTabEvent.NavigationTabHandler navigationTabHandler = new NavigationTabEvent.NavigationTabHandler() {
            @Override
            public void onCloseTab(NavigationTab element) {
                closeTab(element, eventBus);
            }

            @Override
            public void onRevealTab(NavigationTab element) {
            }
        };

        handlers.add(eventBus.addHandlerToSource(NavigationTabEvent.getType(), this, navigationTabHandler));
    }

    private void closeTab(final NavigationTab element, EventBus eventBus) {
        getPresenter(new NotifyingAsyncCallback<MatterPresenter>(eventBus) {
            @Override
            protected void success(MatterPresenter result) {
                if (element == result) {
                    unbind();
                }
            }
        });
    }

    private void unbind() {
        for (HandlerRegistration handler : handlers) {
            handler.removeHandler();
        }
    }
}
