
package com.anova.anovacloud.client.rest;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;

import com.anova.anovacloud.shared.dto.MatterDto;
import com.gwtplatform.dispatch.rest.shared.RestAction;

import static com.anova.anovacloud.shared.rest.PathParameter.PATH_ID;
import static com.anova.anovacloud.shared.rest.ResourcesPath.MATTERS;
import static com.anova.anovacloud.shared.rest.ResourcesPath.COUNT;
import static com.anova.anovacloud.shared.rest.RestParameter.ID;
import static com.anova.anovacloud.shared.rest.RestParameter.LIMIT;
import static com.anova.anovacloud.shared.rest.RestParameter.OFFSET;

@Path(MATTERS)
public interface MattersService {
    @GET
    RestAction<List<MatterDto>> getMatters();

    @GET
    RestAction<List<MatterDto>> getMatters(@QueryParam(OFFSET) int offset, @QueryParam(LIMIT) int limit);

    @GET
    @Path(COUNT)
    RestAction<Integer> getMattersCount();

    @POST
    RestAction<MatterDto> saveOrCreate(MatterDto matterDto);

    @Path(PATH_ID)
    MatterService matter(@PathParam(ID) Long matterId);
}
