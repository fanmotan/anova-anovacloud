

package com.anova.anovacloud.client.application.matters.matter;

import javax.inject.Inject;
import javax.inject.Provider;

import com.google.web.bindery.event.shared.EventBus;
import com.anova.anovacloud.shared.dto.MatterDto;
import com.gwtplatform.mvp.client.proxy.PlaceManager;

public class MatterProxyFactory {
    private final Provider<MatterPresenterProvider> matterPresenterProvider;
    private final PlaceManager placeManager;
    private final EventBus eventBus;
    private final MatterProxyImplFactory matterProxyImplFactory;

    @Inject
    MatterProxyFactory(Provider<MatterPresenterProvider> matterPresenterProvider,
                    PlaceManager placeManager,
                    EventBus eventBus,
                    MatterProxyImplFactory matterProxyImplFactory) {
        this.matterPresenterProvider = matterPresenterProvider;
        this.placeManager = placeManager;
        this.eventBus = eventBus;
        this.matterProxyImplFactory = matterProxyImplFactory;
    }

    public MatterPresenter.MyProxy create(MatterDto matterDto, String nameToken) {
        MatterPresenterProvider matterPresenter = matterPresenterProvider.get();
        matterPresenter.setMatter(matterDto);

        MatterProxyImpl matterProxy = matterProxyImplFactory.create(matterPresenter, nameToken);
        matterProxy.bind(placeManager, eventBus);

        return matterProxy;
    }
}
