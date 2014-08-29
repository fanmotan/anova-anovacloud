

package com.anova.anovacloud.client.application.attorney;

import com.anova.anovacloud.shared.dto.AttorneyDto;
import com.gwtplatform.mvp.client.UiHandlers;

public interface AttorneyDetailUiHandlers extends UiHandlers {
    void onSave(AttorneyDto attorneyDto);
}
