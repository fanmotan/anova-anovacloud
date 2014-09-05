
package com.anova.anovacloud.client.rest;

import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import com.anova.anovacloud.shared.dto.AttorneyDto;
import com.gwtplatform.dispatch.rest.shared.RestAction;

import static com.anova.anovacloud.shared.rest.PathParameter.PATH_ID;
import static com.anova.anovacloud.shared.rest.ResourcesPath.ATTORNEY;
import static com.anova.anovacloud.shared.rest.RestParameter.ID;

@Path(ATTORNEY)
public interface AttorneyService {
    @GET
    RestAction<List<AttorneyDto>> getAttorneys();

    @GET
    @Path(PATH_ID)
    RestAction<AttorneyDto> get(@PathParam(ID) Long id);

    @POST
    RestAction<AttorneyDto> saveOrCreate(AttorneyDto attorneyDto);
/*
    @DELETE
    @Path(PATH_ID)
    RestAction<Void> delete(@PathParam(ID) Long id);
*/
}
