
package com.anova.anovacloud.client.columninitializer;

import com.google.gwt.user.cellview.client.CellTable;

public interface ColumnInitializer<T> {
    void initializeColumns(CellTable<T> table);
}
