

package com.anova.anovacloud.client.application.matters;

import com.anova.anovacloud.shared.dto.MatterDto;
import com.gwtplatform.mvp.client.UiHandlers;

public interface MattersUiHandlers extends UiHandlers {
    void onEdit(MatterDto matterDto);

    void onDelete(MatterDto matterDto);

    void onCreate();

    void fetchData(int offset, int limit);
}
