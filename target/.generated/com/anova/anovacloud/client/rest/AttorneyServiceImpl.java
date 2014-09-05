package com.anova.anovacloud.client.rest;

import javax.inject.Inject;

import com.gwtplatform.dispatch.rest.client.DefaultDateFormat;
import com.gwtplatform.dispatch.rest.shared.HttpMethod;
import com.gwtplatform.dispatch.rest.shared.RestAction;
import com.anova.anovacloud.client.rest.AttorneyService;
import com.anova.anovacloud.client.rest.AttorneyService_1_getImpl;
import com.anova.anovacloud.client.rest.AttorneyService_0_getAttorneysImpl;
import com.anova.anovacloud.client.rest.AttorneyService_2_saveOrCreateImpl;

public class AttorneyServiceImpl implements AttorneyService {
    private final String defaultDateFormat;

    @Inject
    public AttorneyServiceImpl(
            @DefaultDateFormat String defaultDateFormat) {
        this.defaultDateFormat = defaultDateFormat;
    }

    @Override
    public RestAction<com.anova.anovacloud.shared.dto.AttorneyDto> get(
            java.lang.Long id) {
        return new AttorneyService_1_getImpl(
                defaultDateFormat,
                id);
    }

    @Override
    public RestAction<java.util.List<com.anova.anovacloud.shared.dto.AttorneyDto>> getAttorneys() {
        return new AttorneyService_0_getAttorneysImpl(
                defaultDateFormat);
    }

    @Override
    public RestAction<com.anova.anovacloud.shared.dto.AttorneyDto> saveOrCreate(
            com.anova.anovacloud.shared.dto.AttorneyDto attorneyDto) {
        return new AttorneyService_2_saveOrCreateImpl(
                defaultDateFormat,
                attorneyDto);
    }

}


