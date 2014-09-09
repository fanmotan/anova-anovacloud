
package com.anova.anovacloud.client.rest;

//import javax.ws.rs.DELETE;
import javax.ws.rs.GET;

import com.anova.anovacloud.shared.dto.MatterDto;
import com.gwtplatform.dispatch.rest.shared.RestAction;

public interface MatterService {
    @GET
    RestAction<MatterDto> get();
/*
    @DELETE
    RestAction<Void> delete();
    */
}
