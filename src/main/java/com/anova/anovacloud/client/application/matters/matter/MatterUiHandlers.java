

package com.anova.anovacloud.client.application.matters.matter;

import com.anova.anovacloud.shared.dto.MatterDto;
import com.gwtplatform.mvp.client.UiHandlers;

public interface MatterUiHandlers extends UiHandlers {
    void onSave(MatterDto matterDto);
    void onCancel();
}
