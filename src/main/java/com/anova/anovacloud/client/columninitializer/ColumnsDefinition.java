

package com.anova.anovacloud.client.columninitializer;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import com.google.inject.BindingAnnotation;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@BindingAnnotation
@Target({TYPE})
@Retention(RUNTIME)
public @interface ColumnsDefinition {
    Class<?> definitionFor();
}
