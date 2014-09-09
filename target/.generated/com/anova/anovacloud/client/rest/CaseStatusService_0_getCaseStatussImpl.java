package com.anova.anovacloud.client.rest;

import com.gwtplatform.dispatch.rest.client.AbstractRestAction;
import com.gwtplatform.dispatch.rest.shared.HttpMethod;

public class CaseStatusService_0_getCaseStatussImpl extends AbstractRestAction<java.util.List<com.anova.anovacloud.shared.dto.CaseStatusDto>> {
    public CaseStatusService_0_getCaseStatussImpl(
            String defaultDateFormat) {
        super(HttpMethod.GET, "/caseStatuss", defaultDateFormat);
    }

    @Override
    public boolean isSecured() {
        return true;
    }
}
