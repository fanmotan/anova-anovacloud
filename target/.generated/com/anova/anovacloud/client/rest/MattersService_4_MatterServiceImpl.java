package com.anova.anovacloud.client.rest;

import com.gwtplatform.dispatch.rest.client.DefaultDateFormat;
import com.gwtplatform.dispatch.rest.shared.HttpMethod;
import com.gwtplatform.dispatch.rest.shared.RestAction;
import com.anova.anovacloud.client.rest.MatterService;
import com.anova.anovacloud.client.rest.MattersService_4_MatterService_0_getImpl;

public class MattersService_4_MatterServiceImpl implements MatterService {
    private final java.lang.Long matterId;
    private final String defaultDateFormat;

    public MattersService_4_MatterServiceImpl(
            @DefaultDateFormat String defaultDateFormat,
            java.lang.Long matterId) {
        this.defaultDateFormat = defaultDateFormat;
        this.matterId = matterId;
    }

    @Override
    public RestAction<com.anova.anovacloud.shared.dto.MatterDto> get() {
        return new MattersService_4_MatterService_0_getImpl(
                defaultDateFormat,
                matterId);
    }

}


