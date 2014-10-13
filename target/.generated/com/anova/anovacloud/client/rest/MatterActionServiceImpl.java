package com.anova.anovacloud.client.rest;

import javax.inject.Inject;

import com.gwtplatform.dispatch.rest.client.DefaultDateFormat;
import com.gwtplatform.dispatch.rest.shared.HttpMethod;
import com.gwtplatform.dispatch.rest.shared.RestAction;
import com.anova.anovacloud.client.rest.MatterActionService;
import com.anova.anovacloud.client.rest.MatterActionService_3_deleteImpl;
import com.anova.anovacloud.client.rest.MatterActionService_1_getImpl;
import com.anova.anovacloud.client.rest.MatterActionService_4_getDueThreeDaysActionsImpl;
import com.anova.anovacloud.client.rest.MatterActionService_0_getMatterActionsImpl;
import com.anova.anovacloud.client.rest.MatterActionService_2_saveOrCreateImpl;

public class MatterActionServiceImpl implements MatterActionService {
    private final String defaultDateFormat;

    @Inject
    public MatterActionServiceImpl(
            @DefaultDateFormat String defaultDateFormat) {
        this.defaultDateFormat = defaultDateFormat;
    }

    @Override
    public RestAction<java.lang.Void> delete(
            java.lang.Long id) {
        return new MatterActionService_3_deleteImpl(
                defaultDateFormat,
                id);
    }

    @Override
    public RestAction<com.anova.anovacloud.shared.dto.MatterActionDto> get(
            java.lang.Long id) {
        return new MatterActionService_1_getImpl(
                defaultDateFormat,
                id);
    }

    @Override
    public RestAction<java.util.List<com.anova.anovacloud.shared.dto.MatterActionDto>> getDueThreeDaysActions() {
        return new MatterActionService_4_getDueThreeDaysActionsImpl(
                defaultDateFormat);
    }

    @Override
    public RestAction<java.util.List<com.anova.anovacloud.shared.dto.MatterActionDto>> getMatterActions() {
        return new MatterActionService_0_getMatterActionsImpl(
                defaultDateFormat);
    }

    @Override
    public RestAction<com.anova.anovacloud.shared.dto.MatterActionDto> saveOrCreate(
            com.anova.anovacloud.shared.dto.MatterActionDto MatterActionDto) {
        return new MatterActionService_2_saveOrCreateImpl(
                defaultDateFormat,
                MatterActionDto);
    }

}


