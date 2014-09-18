package com.anova.anovacloud.client.rest;

import javax.inject.Inject;

import com.gwtplatform.dispatch.rest.client.DefaultDateFormat;
import com.gwtplatform.dispatch.rest.shared.HttpMethod;
import com.gwtplatform.dispatch.rest.shared.RestAction;
import com.anova.anovacloud.client.rest.MatterActionStatusService;
import com.anova.anovacloud.client.rest.MatterActionStatusService_0_getMatterActionStatussImpl;

public class MatterActionStatusServiceImpl implements MatterActionStatusService {
    private final String defaultDateFormat;

    @Inject
    public MatterActionStatusServiceImpl(
            @DefaultDateFormat String defaultDateFormat) {
        this.defaultDateFormat = defaultDateFormat;
    }

    @Override
    public RestAction<java.util.List<com.anova.anovacloud.shared.dto.MatterActionStatusDto>> getMatterActionStatuss() {
        return new MatterActionStatusService_0_getMatterActionStatussImpl(
                defaultDateFormat);
    }

}


