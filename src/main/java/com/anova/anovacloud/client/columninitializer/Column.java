
package com.anova.anovacloud.client.columninitializer;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import com.google.inject.BindingAnnotation;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@BindingAnnotation
@Target({METHOD})
@Retention(RUNTIME)
public @interface Column {
    Class<?> cellType();

    Class<?> cellReturnType();

    String headerName();
}
