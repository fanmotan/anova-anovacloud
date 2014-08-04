

package com.anova.anovacloud.client.application.matters.matter;

import javax.inject.Inject;

import com.google.gwt.event.shared.GwtEvent;
import com.google.web.bindery.event.shared.EventBus;
import com.anova.anovacloud.client.application.ApplicationPresenter;
import com.anova.anovacloud.client.application.matters.matter.navigation.NavigationTabPresenter;
import com.gwtplatform.mvp.client.Presenter;
import com.gwtplatform.mvp.client.View;
import com.gwtplatform.mvp.client.annotations.ContentSlot;
import com.gwtplatform.mvp.client.annotations.ProxyStandard;
import com.gwtplatform.mvp.client.proxy.Proxy;
import com.gwtplatform.mvp.client.proxy.RevealContentHandler;

public class RootMatterPresenter extends Presenter<RootMatterPresenter.MyView, RootMatterPresenter.MyProxy> {
    public interface MyView extends View {
    }

    @ProxyStandard
    public interface MyProxy extends Proxy<RootMatterPresenter> {
    }

    @ContentSlot
    public static final GwtEvent.Type<RevealContentHandler<?>> SLOT_SetMatterContent = new GwtEvent
            .Type<>();

    public static final Object SLOT_TAB_BAR = new Object();

    private final NavigationTabPresenter navigationTabPresenter;

    @Inject
    RootMatterPresenter(EventBus eventBus,
                     MyView view,
                     MyProxy proxy,
                     NavigationTabPresenter navigationTabPresenter) {
        super(eventBus, view, proxy, ApplicationPresenter.SLOT_MAIN_CONTENT);

        this.navigationTabPresenter = navigationTabPresenter;
    }

    @Override
    protected void onBind() {
        super.onBind();

        setInSlot(SLOT_TAB_BAR, navigationTabPresenter);
    }
}
