

package com.anova.anovacloud.client.application.attorney.ui;

import com.anova.anovacloud.shared.dto.AttorneyDto;
import com.gwtplatform.mvp.client.UiHandlers;

public interface EditAttorneyUiHandlers extends UiHandlers {
    void createNew();

    void edit(AttorneyDto attorneyDto);

    void onSave(AttorneyDto attorneyDto);

    void onCancel();
}
