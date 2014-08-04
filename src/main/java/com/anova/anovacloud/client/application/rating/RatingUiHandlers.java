
package com.anova.anovacloud.client.application.rating;

import com.anova.anovacloud.shared.dto.RatingDto;
import com.gwtplatform.mvp.client.UiHandlers;

public interface RatingUiHandlers extends UiHandlers {
    void onDelete(RatingDto ratingDto);

    void onCreate();
}
