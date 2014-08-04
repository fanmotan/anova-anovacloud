

package com.anova.anovacloud.client.application.rating.ui;

import com.google.gwt.core.shared.GWT;
import com.google.gwt.dom.client.Style;
import com.google.gwt.user.cellview.client.CellTable;
import com.google.gwt.user.cellview.client.Column;

public class RatingColumnsDefinitionImpl implements RatingColumnsDefinition {
    @Override
    public void initializeColumns(CellTable<com.anova.anovacloud.shared.dto.RatingDto> table) {
            
    initgetIdColumn(table);
    
    inittoStringColumn(table);
    
    initgetRatingColumn(table);
        }

        
    private void initgetIdColumn(CellTable<com.anova.anovacloud.shared.dto.RatingDto> table) {
        Column<com.anova.anovacloud.shared.dto.RatingDto, java.lang.Number> column
                = new Column<com.anova.anovacloud.shared.dto.RatingDto, java.lang.Number>(new com.google.gwt.cell.client.NumberCell()) {
                        @Override
                        public java.lang.Number getValue(com.anova.anovacloud.shared.dto.RatingDto object) {
                            return object.getId();
                        }};

        table.addColumn(column, "ID");
    }
    
    private void inittoStringColumn(CellTable<com.anova.anovacloud.shared.dto.RatingDto> table) {
        Column<com.anova.anovacloud.shared.dto.RatingDto, java.lang.String> column
                = new Column<com.anova.anovacloud.shared.dto.RatingDto, java.lang.String>(new com.google.gwt.cell.client.TextCell()) {
                        @Override
                        public java.lang.String getValue(com.anova.anovacloud.shared.dto.RatingDto object) {
                            return object.toString();
                        }};

        table.addColumn(column, "Matter");
    }
    
    private void initgetRatingColumn(CellTable<com.anova.anovacloud.shared.dto.RatingDto> table) {
        Column<com.anova.anovacloud.shared.dto.RatingDto, java.lang.Number> column
                = new Column<com.anova.anovacloud.shared.dto.RatingDto, java.lang.Number>(new com.google.gwt.cell.client.NumberCell()) {
                        @Override
                        public java.lang.Number getValue(com.anova.anovacloud.shared.dto.RatingDto object) {
                            return object.getRating();
                        }};

        table.addColumn(column, "Rating");
    }
    
        
    public java.lang.String getId() {
        return null;
    }
    
    public java.lang.String toString() {
        return null;
    }
    
    public java.lang.String getRating() {
        return null;
    }
    }
