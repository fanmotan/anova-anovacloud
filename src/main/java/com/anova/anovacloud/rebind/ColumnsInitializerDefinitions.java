

package com.anova.anovacloud.rebind;

import java.util.ArrayList;
import java.util.List;

import com.google.gwt.core.ext.typeinfo.JClassType;
import com.google.gwt.core.ext.typeinfo.JMethod;
import com.anova.anovacloud.client.columninitializer.Column;
import com.anova.anovacloud.client.columninitializer.ColumnsDefinition;

public class ColumnsInitializerDefinitions {
    private ColumnsDefinition columnsInitializer;
    private List<ColumnTuple> columns;

    public List<ColumnTuple> getColumns() {
        return columns;
    }

    public String getDtoCanonicalName() {
        return columnsInitializer.definitionFor().getCanonicalName();
    }

    public static ColumnsInitializerDefinitions createFrom(JClassType type) {
        ColumnsInitializerDefinitions columnsInitializerDefinitions = new ColumnsInitializerDefinitions();

        columnsInitializerDefinitions.columnsInitializer = type.getAnnotation(ColumnsDefinition.class);

        List<ColumnTuple> columns = new ArrayList<>();
        JMethod[] jMethods = type.getMethods();
        for (int i = 0; i < jMethods.length; i++) {
            JMethod method = jMethods[i];

            if (method.isAnnotationPresent(Column.class)) {
                ColumnTuple columnTuple = ColumnTuple.createFrom(method);

                columns.add(columnTuple);
            }
        }

        columnsInitializerDefinitions.columns = columns;

        return columnsInitializerDefinitions;
    }
}
