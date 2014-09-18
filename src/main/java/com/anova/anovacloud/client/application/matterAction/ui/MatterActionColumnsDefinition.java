

package com.anova.anovacloud.client.application.matterAction.ui;

import java.util.Date;

import com.google.gwt.cell.client.DateCell;
import com.google.gwt.cell.client.TextCell;
import com.anova.anovacloud.client.columninitializer.Column;
import com.anova.anovacloud.client.columninitializer.ColumnInitializer;
import com.anova.anovacloud.client.columninitializer.ColumnsDefinition;
import com.anova.anovacloud.shared.dto.MatterActionDto;

@ColumnsDefinition(definitionFor = MatterActionDto.class)
public interface MatterActionColumnsDefinition extends ColumnInitializer<MatterActionDto> {
	/*
    @Column(cellType = NumberCell.class, cellReturnType = Number.class, headerName = "ID")
    public String getId();
    */

    @Column(cellType = TextCell.class, cellReturnType = String.class, headerName = "Case Number")
    public String toString();

    @Column(cellType = DateCell.class, cellReturnType = Date.class, headerName = "Due Date")
    public Date getDueDate();
    
    @Column(cellType = TextCell.class, cellReturnType = String.class, headerName = "Action Due")
    public String getActionDue();
    
    @Column(cellType = DateCell.class, cellReturnType = Date.class, headerName = "PTO Mail Date")
    public Date getPtoMailDate();
    
    @Column(cellType = DateCell.class, cellReturnType = Date.class, headerName = "Response Date")
    public Date getResponseDate();
    
    @Column(cellType = DateCell.class, cellReturnType = Date.class, headerName = "Date Taken")
    public Date getTakenDate();
    
    @Column(cellType = TextCell.class, cellReturnType = String.class, headerName = "Atty")
    public String getAtty();
    
    @Column(cellType = TextCell.class, cellReturnType = String.class, headerName = "Action Remarks")
    public String getActionRemarks();
    
    
}
