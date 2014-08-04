

package com.anova.anovacloud.client.application.matterAction.ui;

import com.google.gwt.core.shared.GWT;
import com.google.gwt.dom.client.Style;
import com.google.gwt.user.cellview.client.CellTable;
import com.google.gwt.user.cellview.client.Column;

public class MatterActionColumnsDefinitionImpl implements MatterActionColumnsDefinition {
    @Override
    public void initializeColumns(CellTable<com.anova.anovacloud.shared.dto.MatterActionDto> table) {
            
    inittoStringColumn(table);
    
    initgetDueDateColumn(table);
    
    initgetActionDueColumn(table);
    
    initgetPtoMailDateColumn(table);
    
    initgetResponseDateColumn(table);
    
    initgetTakenDateColumn(table);
    
    initgetAttyColumn(table);
    
    initgetActionRemarksColumn(table);
        }

        
    private void inittoStringColumn(CellTable<com.anova.anovacloud.shared.dto.MatterActionDto> table) {
        Column<com.anova.anovacloud.shared.dto.MatterActionDto, java.lang.String> column
                = new Column<com.anova.anovacloud.shared.dto.MatterActionDto, java.lang.String>(new com.google.gwt.cell.client.TextCell()) {
                        @Override
                        public java.lang.String getValue(com.anova.anovacloud.shared.dto.MatterActionDto object) {
                            return object.toString();
                        }};

        table.addColumn(column, "Case Number");
    }
    
    private void initgetDueDateColumn(CellTable<com.anova.anovacloud.shared.dto.MatterActionDto> table) {
        Column<com.anova.anovacloud.shared.dto.MatterActionDto, java.util.Date> column
                = new Column<com.anova.anovacloud.shared.dto.MatterActionDto, java.util.Date>(new com.google.gwt.cell.client.DateCell()) {
                        @Override
                        public java.util.Date getValue(com.anova.anovacloud.shared.dto.MatterActionDto object) {
                            return object.getDueDate();
                        }};

        table.addColumn(column, "Due Date");
    }
    
    private void initgetActionDueColumn(CellTable<com.anova.anovacloud.shared.dto.MatterActionDto> table) {
        Column<com.anova.anovacloud.shared.dto.MatterActionDto, java.lang.String> column
                = new Column<com.anova.anovacloud.shared.dto.MatterActionDto, java.lang.String>(new com.google.gwt.cell.client.TextCell()) {
                        @Override
                        public java.lang.String getValue(com.anova.anovacloud.shared.dto.MatterActionDto object) {
                            return object.getActionDue();
                        }};

        table.addColumn(column, "Action Due");
    }
    
    private void initgetPtoMailDateColumn(CellTable<com.anova.anovacloud.shared.dto.MatterActionDto> table) {
        Column<com.anova.anovacloud.shared.dto.MatterActionDto, java.util.Date> column
                = new Column<com.anova.anovacloud.shared.dto.MatterActionDto, java.util.Date>(new com.google.gwt.cell.client.DateCell()) {
                        @Override
                        public java.util.Date getValue(com.anova.anovacloud.shared.dto.MatterActionDto object) {
                            return object.getPtoMailDate();
                        }};

        table.addColumn(column, "PTO Mail Date");
    }
    
    private void initgetResponseDateColumn(CellTable<com.anova.anovacloud.shared.dto.MatterActionDto> table) {
        Column<com.anova.anovacloud.shared.dto.MatterActionDto, java.util.Date> column
                = new Column<com.anova.anovacloud.shared.dto.MatterActionDto, java.util.Date>(new com.google.gwt.cell.client.DateCell()) {
                        @Override
                        public java.util.Date getValue(com.anova.anovacloud.shared.dto.MatterActionDto object) {
                            return object.getResponseDate();
                        }};

        table.addColumn(column, "Response Date");
    }
    
    private void initgetTakenDateColumn(CellTable<com.anova.anovacloud.shared.dto.MatterActionDto> table) {
        Column<com.anova.anovacloud.shared.dto.MatterActionDto, java.util.Date> column
                = new Column<com.anova.anovacloud.shared.dto.MatterActionDto, java.util.Date>(new com.google.gwt.cell.client.DateCell()) {
                        @Override
                        public java.util.Date getValue(com.anova.anovacloud.shared.dto.MatterActionDto object) {
                            return object.getTakenDate();
                        }};

        table.addColumn(column, "Date Taken");
    }
    
    private void initgetAttyColumn(CellTable<com.anova.anovacloud.shared.dto.MatterActionDto> table) {
        Column<com.anova.anovacloud.shared.dto.MatterActionDto, java.lang.String> column
                = new Column<com.anova.anovacloud.shared.dto.MatterActionDto, java.lang.String>(new com.google.gwt.cell.client.TextCell()) {
                        @Override
                        public java.lang.String getValue(com.anova.anovacloud.shared.dto.MatterActionDto object) {
                            return object.getAtty();
                        }};

        table.addColumn(column, "Atty");
    }
    
    private void initgetActionRemarksColumn(CellTable<com.anova.anovacloud.shared.dto.MatterActionDto> table) {
        Column<com.anova.anovacloud.shared.dto.MatterActionDto, java.lang.String> column
                = new Column<com.anova.anovacloud.shared.dto.MatterActionDto, java.lang.String>(new com.google.gwt.cell.client.TextCell()) {
                        @Override
                        public java.lang.String getValue(com.anova.anovacloud.shared.dto.MatterActionDto object) {
                            return object.getActionRemarks();
                        }};

        table.addColumn(column, "Action Remarks");
    }
    
        
    public java.lang.String toString() {
        return null;
    }
    
    public java.util.Date getDueDate() {
        return null;
    }
    
    public java.lang.String getActionDue() {
        return null;
    }
    
    public java.util.Date getPtoMailDate() {
        return null;
    }
    
    public java.util.Date getResponseDate() {
        return null;
    }
    
    public java.util.Date getTakenDate() {
        return null;
    }
    
    public java.lang.String getAtty() {
        return null;
    }
    
    public java.lang.String getActionRemarks() {
        return null;
    }
    }
