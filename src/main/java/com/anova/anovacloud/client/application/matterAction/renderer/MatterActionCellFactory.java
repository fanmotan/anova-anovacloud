

package com.anova.anovacloud.client.application.matterAction.renderer;

import com.google.gwt.cell.client.ActionCell.Delegate;
import com.anova.anovacloud.shared.dto.MatterActionDto;

public interface MatterActionCellFactory {
    MatterActionCell create(Delegate<MatterActionDto> delegate);
}
