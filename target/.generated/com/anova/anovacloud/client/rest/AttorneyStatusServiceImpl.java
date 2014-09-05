package com.anova.anovacloud.client.rest;

import javax.inject.Inject;

import com.gwtplatform.dispatch.rest.client.DefaultDateFormat;
import com.gwtplatform.dispatch.rest.shared.HttpMethod;
import com.gwtplatform.dispatch.rest.shared.RestAction;
import com.anova.anovacloud.client.rest.AttorneyStatusService;
import com.anova.anovacloud.client.rest.AttorneyStatusService_0_getAttorneyStatussImpl;

public class AttorneyStatusServiceImpl implements AttorneyStatusService {
    private final String defaultDateFormat;

    @Inject
    public AttorneyStatusServiceImpl(
            @DefaultDateFormat String defaultDateFormat) {
        this.defaultDateFormat = defaultDateFormat;
    }

    @Override
    public RestAction<java.util.List<com.anova.anovacloud.shared.dto.AttorneyStatusDto>> getAttorneyStatuss() {
        return new AttorneyStatusService_0_getAttorneyStatussImpl(
                defaultDateFormat);
    }

}


