

package com.anova.anovacloud.client.application.rating.renderer;

import com.google.gwt.cell.client.ActionCell.Delegate;
import com.anova.anovacloud.shared.dto.RatingDto;

public interface RatingCellFactory {
    RatingCell create(Delegate<RatingDto> delegate);
}
