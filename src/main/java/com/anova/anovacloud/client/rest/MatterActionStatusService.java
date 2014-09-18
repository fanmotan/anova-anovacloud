
package com.anova.anovacloud.client.rest;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import com.anova.anovacloud.shared.dto.MatterActionStatusDto;
import com.gwtplatform.dispatch.rest.shared.RestAction;

import static com.anova.anovacloud.shared.rest.ResourcesPath.MATTERACTIONSTATUS;

@Path(MATTERACTIONSTATUS)
public interface MatterActionStatusService {
   
    @GET
    RestAction<List<MatterActionStatusDto>> getMatterActionStatuss();
    
    
}
