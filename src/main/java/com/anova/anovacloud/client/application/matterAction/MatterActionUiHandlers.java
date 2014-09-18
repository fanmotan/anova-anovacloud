
package com.anova.anovacloud.client.application.matterAction;

import com.anova.anovacloud.shared.dto.MatterActionDto;
import com.gwtplatform.mvp.client.UiHandlers;

public interface MatterActionUiHandlers extends UiHandlers {
  //  void onDelete(MatterActionDto matterActionDto);
	void onEdit(MatterActionDto matterActionDto);
    void onCreate();
}
