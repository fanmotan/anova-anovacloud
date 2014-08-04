

package com.anova.anovacloud.client.application.testutils;

import com.google.inject.TypeLiteral;
import com.anova.anovacloud.client.rest.MatterService;
import com.anova.anovacloud.shared.dto.MatterDto;
import com.gwtplatform.dispatch.rest.shared.RestAction;

public class MatterServiceImpl implements MatterService {
    public MatterServiceImpl(Long matterId) {
    }

    @Override
    public RestAction<MatterDto> get() {
        return new ActionImpl<MatterDto>(new TypeLiteral<RestAction<MatterDto>>() {});
    }

    @Override
    public RestAction<Void> delete() {
        return new ActionImpl<Void>(new TypeLiteral<RestAction<Void>>() {});
    }
}
