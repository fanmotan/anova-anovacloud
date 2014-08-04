
package com.anova.anovacloud.client.application.testutils;

import java.util.ArrayList;
import java.util.List;

import com.google.inject.TypeLiteral;
import com.gwtplatform.dispatch.rest.shared.HttpMethod;
import com.gwtplatform.dispatch.rest.shared.RestAction;
import com.gwtplatform.dispatch.rest.shared.RestParameter;

@SuppressWarnings("GwtInconsistentSerializableClass")
public class ActionImpl<T> implements RestAction<T> {
    private final TypeLiteral<RestAction<T>> typeLiteral;

    public ActionImpl(TypeLiteral<RestAction<T>> typeLiteral) {
        this.typeLiteral = typeLiteral;
    }

    @Override
    public String getPath() {
        return "";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.GET;
    }

    @Override
    public List<RestParameter> getPathParams() {
        return new ArrayList<RestParameter>();
    }

    @Override
    public List<RestParameter> getQueryParams() {
        return new ArrayList<RestParameter>();
    }

    @Override
    public List<RestParameter> getFormParams() {
        return new ArrayList<RestParameter>();
    }

    @Override
    public List<RestParameter> getHeaderParams() {
        return new ArrayList<RestParameter>();
    }

    @Override
    public Object getBodyParam() {
        return new Object();
    }

    @Override
    public Boolean hasFormParams() {
        return false;
    }

    @Override
    public Boolean hasBodyParam() {
        return false;
    }

    public TypeLiteral<RestAction<T>> getTypeLiteral() {
        return typeLiteral;
    }

    @Override
    public boolean isSecured() {
        return false;
    }
}
