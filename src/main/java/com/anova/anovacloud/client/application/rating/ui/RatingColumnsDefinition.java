

package com.anova.anovacloud.client.application.rating.ui;

import com.google.gwt.cell.client.NumberCell;
import com.google.gwt.cell.client.TextCell;
import com.anova.anovacloud.client.columninitializer.Column;
import com.anova.anovacloud.client.columninitializer.ColumnInitializer;
import com.anova.anovacloud.client.columninitializer.ColumnsDefinition;
import com.anova.anovacloud.shared.dto.RatingDto;

@ColumnsDefinition(definitionFor = RatingDto.class)
public interface RatingColumnsDefinition extends ColumnInitializer<RatingDto> {
    @Column(cellType = NumberCell.class, cellReturnType = Number.class, headerName = "ID")
    public String getId();

    @Column(cellType = TextCell.class, cellReturnType = String.class, headerName = "Matter")
    public String toString();

    @Column(cellType = NumberCell.class, cellReturnType = Number.class, headerName = "Rating")
    public String getRating();
}
