
package com.anova.anovacloud.client.application.rating.ui;

import com.anova.anovacloud.shared.dto.RatingDto;
import com.gwtplatform.mvp.client.UiHandlers;

public interface EditRatingUiHandlers extends UiHandlers {
    void createNew();

    void onSave(RatingDto ratingDto);

    void onCancel();
}
