
package com.anova.anovacloud.client.application.matterAction.ui;

import com.anova.anovacloud.shared.dto.MatterActionDto;
import com.gwtplatform.mvp.client.UiHandlers;

public interface EditMatterActionUiHandlers extends UiHandlers {
    void createNew();

    void onSave(MatterActionDto matterActionDto);

    void onCancel();
}
