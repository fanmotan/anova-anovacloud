

package com.anova.anovacloud.client.application.attorney;

import com.anova.anovacloud.shared.dto.AttorneyDto;
import com.gwtplatform.mvp.client.UiHandlers;

public interface AttorneyUiHandlers extends UiHandlers {
    void onDetail(AttorneyDto attorneyDto);

    void onEdit(AttorneyDto attorneyDto);

    void onDelete(AttorneyDto attorneyDto);

    void onCreate();
}
