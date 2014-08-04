

package com.anova.anovacloud.client.application.matters.matter;

import com.anova.anovacloud.shared.dto.MatterDto;

public interface MatterPresenterFactory {
    MatterPresenter create(MatterPresenter.MyProxy proxy, MatterDto matterDto);
}
