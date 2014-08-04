

package com.anova.anovacloud.client.application.rating;

import com.anova.anovacloud.shared.dto.RatingDto;
import com.gwtplatform.mvp.client.UiHandlers;

public interface RatingDetailUiHandlers extends UiHandlers {
    void onSave(RatingDto ratingDto);
}
