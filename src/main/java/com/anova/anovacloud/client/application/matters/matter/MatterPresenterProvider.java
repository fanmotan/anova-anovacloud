
package com.anova.anovacloud.client.application.matters.matter;

import javax.inject.Inject;

import com.google.inject.Provider;
import com.anova.anovacloud.shared.dto.MatterDto;

public class MatterPresenterProvider implements Provider<MatterPresenter> {
    private final MatterPresenterFactory matterPresenterFactory;

    private MatterPresenter.MyProxy proxy;
    private MatterPresenter matterPresenter;
    private MatterDto matterDto;

    @Inject
    MatterPresenterProvider(MatterPresenterFactory matterPresenterFactory) {
        this.matterPresenterFactory = matterPresenterFactory;
    }

    @Override
    public MatterPresenter get() {
        assert proxy != null : "You must call setProxy first";

        if (matterPresenter == null) {
            matterPresenter = matterPresenterFactory.create(proxy, matterDto);
        }

        return matterPresenter;
    }

    public void setProxy(MatterPresenter.MyProxy proxy) {
        this.proxy = proxy;
    }

    public void setMatter(MatterDto matterDto) {
        this.matterDto = matterDto;
    }
}
