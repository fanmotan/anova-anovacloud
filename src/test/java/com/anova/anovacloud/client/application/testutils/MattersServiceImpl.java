
package com.anova.anovacloud.client.application.testutils;

import java.util.List;

import javax.ws.rs.QueryParam;

import com.google.inject.TypeLiteral;
import com.anova.anovacloud.client.rest.MatterService;
import com.anova.anovacloud.client.rest.MattersService;
import com.anova.anovacloud.shared.dto.MatterDto;
import com.anova.anovacloud.shared.rest.RestParameter;
import com.gwtplatform.dispatch.rest.shared.RestAction;

public class MattersServiceImpl implements MattersService {
    @Override
    public RestAction<List<MatterDto>> getMatters() {
        return new ActionImpl<List<MatterDto>>(new TypeLiteral<RestAction<List<MatterDto>>>() {});
    }

    @Override
    public RestAction<List<MatterDto>> getMatters(@QueryParam(RestParameter.OFFSET) int offset,
                                            @QueryParam(RestParameter.LIMIT) int limit) {
        return new ActionImpl<List<MatterDto>>(new TypeLiteral<RestAction<List<MatterDto>>>() {});
    }

    @Override
    public RestAction<Integer> getMattersCount() {
        return new ActionImpl<Integer>(new TypeLiteral<RestAction<Integer>>() {});
    }

    @Override
    public RestAction<MatterDto> saveOrCreate(MatterDto matterDto) {
        return new ActionImpl<MatterDto>(new TypeLiteral<RestAction<MatterDto>>() {});
    }

    @Override
    public MatterService matter(Long matterId) {
        return new MatterServiceImpl(matterId);
    }
}
