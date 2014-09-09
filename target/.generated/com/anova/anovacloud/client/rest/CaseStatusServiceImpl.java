package com.anova.anovacloud.client.rest;

import javax.inject.Inject;

import com.gwtplatform.dispatch.rest.client.DefaultDateFormat;
import com.gwtplatform.dispatch.rest.shared.HttpMethod;
import com.gwtplatform.dispatch.rest.shared.RestAction;
import com.anova.anovacloud.client.rest.CaseStatusService;
import com.anova.anovacloud.client.rest.CaseStatusService_0_getCaseStatussImpl;

public class CaseStatusServiceImpl implements CaseStatusService {
    private final String defaultDateFormat;

    @Inject
    public CaseStatusServiceImpl(
            @DefaultDateFormat String defaultDateFormat) {
        this.defaultDateFormat = defaultDateFormat;
    }

    @Override
    public RestAction<java.util.List<com.anova.anovacloud.shared.dto.CaseStatusDto>> getCaseStatuss() {
        return new CaseStatusService_0_getCaseStatussImpl(
                defaultDateFormat);
    }

}


