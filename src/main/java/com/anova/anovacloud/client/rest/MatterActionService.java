
package com.anova.anovacloud.client.rest;

import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import com.anova.anovacloud.shared.dto.ActionDueDto;
import com.anova.anovacloud.shared.dto.MatterActionDto;
import com.gwtplatform.dispatch.rest.shared.RestAction;

import static com.anova.anovacloud.shared.rest.PathParameter.PATH_ID;
import static com.anova.anovacloud.shared.rest.ResourcesPath.MATTERACTION;
import static com.anova.anovacloud.shared.rest.RestParameter.ID;

@Path(MATTERACTION)
public interface MatterActionService {
    @GET
    RestAction<List<MatterActionDto>> getMatterActions();

    @GET
    @Path(PATH_ID)
    RestAction<MatterActionDto> get(@PathParam(ID) Long id);

    @POST
    RestAction<MatterActionDto> saveOrCreate(MatterActionDto MatterActionDto);

    @DELETE
    @Path(PATH_ID)
    RestAction<Void> delete(@PathParam(ID) Long id);
    
    @GET
    RestAction<List<ActionDueDto>> getDueThreeDaysActions();
   
}
