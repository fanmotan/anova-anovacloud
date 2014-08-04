

package com.anova.anovacloud.rebind;

import com.google.gwt.core.ext.typeinfo.JMethod;
import com.anova.anovacloud.client.columninitializer.Column;

public class ColumnTuple {
    private JMethod method;
    private Column column;

    public JMethod getMethod() {
        return method;
    }

    public Column getColumn() {
        return column;
    }

    public String getCellCanonicalName() {
        return column.cellType().getCanonicalName();
    }

    public String getReturnCellCanonicalName() {
        return column.cellReturnType().getCanonicalName();
    }

    public String getMethodCapitalizedName() {
        return method.getName();
    }

    public static ColumnTuple createFrom(JMethod method) {
        ColumnTuple columnTuple = new ColumnTuple();

        columnTuple.method = method;
        columnTuple.column = method.getAnnotation(Column.class);

        return columnTuple;
    }
}
