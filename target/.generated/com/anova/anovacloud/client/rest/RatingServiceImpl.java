package com.anova.anovacloud.client.rest;

import javax.inject.Inject;

import com.gwtplatform.dispatch.rest.client.DefaultDateFormat;
import com.gwtplatform.dispatch.rest.shared.HttpMethod;
import com.gwtplatform.dispatch.rest.shared.RestAction;
import com.anova.anovacloud.client.rest.RatingService;
import com.anova.anovacloud.client.rest.RatingService_3_deleteImpl;
import com.anova.anovacloud.client.rest.RatingService_1_getImpl;
import com.anova.anovacloud.client.rest.RatingService_0_getRatingsImpl;
import com.anova.anovacloud.client.rest.RatingService_2_saveOrCreateImpl;

public class RatingServiceImpl implements RatingService {
    private final String defaultDateFormat;

    @Inject
    public RatingServiceImpl(
            @DefaultDateFormat String defaultDateFormat) {
        this.defaultDateFormat = defaultDateFormat;
    }

    @Override
    public RestAction<java.lang.Void> delete(
            java.lang.Long id) {
        return new RatingService_3_deleteImpl(
                defaultDateFormat,
                id);
    }

    @Override
    public RestAction<com.anova.anovacloud.shared.dto.RatingDto> get(
            java.lang.Long id) {
        return new RatingService_1_getImpl(
                defaultDateFormat,
                id);
    }

    @Override
    public RestAction<java.util.List<com.anova.anovacloud.shared.dto.RatingDto>> getRatings() {
        return new RatingService_0_getRatingsImpl(
                defaultDateFormat);
    }

    @Override
    public RestAction<com.anova.anovacloud.shared.dto.RatingDto> saveOrCreate(
            com.anova.anovacloud.shared.dto.RatingDto RatingDto) {
        return new RatingService_2_saveOrCreateImpl(
                defaultDateFormat,
                RatingDto);
    }

}


