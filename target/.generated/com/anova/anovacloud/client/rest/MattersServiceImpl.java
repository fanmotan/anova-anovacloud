package com.anova.anovacloud.client.rest;

import javax.inject.Inject;

import com.gwtplatform.dispatch.rest.client.DefaultDateFormat;
import com.gwtplatform.dispatch.rest.shared.HttpMethod;
import com.gwtplatform.dispatch.rest.shared.RestAction;
import com.anova.anovacloud.client.rest.MattersService;
import com.anova.anovacloud.client.rest.MattersService_4_MatterServiceImpl;
import com.anova.anovacloud.client.rest.MattersService_0_getMattersImpl;
import com.anova.anovacloud.client.rest.MattersService_1_getMattersImpl;
import com.anova.anovacloud.client.rest.MattersService_2_getMattersCountImpl;
import com.anova.anovacloud.client.rest.MattersService_3_saveOrCreateImpl;

public class MattersServiceImpl implements MattersService {
    private final String defaultDateFormat;

    @Inject
    public MattersServiceImpl(
            @DefaultDateFormat String defaultDateFormat) {
        this.defaultDateFormat = defaultDateFormat;
    }

    @Override
    public RestAction<java.util.List<com.anova.anovacloud.shared.dto.MatterDto>> getMatters() {
        return new MattersService_0_getMattersImpl(
                defaultDateFormat);
    }

    @Override
    public RestAction<java.util.List<com.anova.anovacloud.shared.dto.MatterDto>> getMatters(
            int offset, 
            int limit) {
        return new MattersService_1_getMattersImpl(
                defaultDateFormat,
                offset,
                limit);
    }

    @Override
    public RestAction<java.lang.Integer> getMattersCount() {
        return new MattersService_2_getMattersCountImpl(
                defaultDateFormat);
    }

    @Override
    public RestAction<com.anova.anovacloud.shared.dto.MatterDto> saveOrCreate(
            com.anova.anovacloud.shared.dto.MatterDto matterDto) {
        return new MattersService_3_saveOrCreateImpl(
                defaultDateFormat,
                matterDto);
    }

    @Override
    public MatterService matter(
            java.lang.Long matterId) {
        return new MattersService_4_MatterServiceImpl(
                defaultDateFormat,
                matterId);
    }

}


