
package com.anova.anovacloud.client.rest;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import com.anova.anovacloud.shared.dto.CaseStatusDto;
import com.gwtplatform.dispatch.rest.shared.RestAction;

import static com.anova.anovacloud.shared.rest.ResourcesPath.CASESTATUS;

@Path(CASESTATUS)
public interface CaseStatusService {
   
    @GET
    RestAction<List<CaseStatusDto>> getCaseStatuss();
    
    
}
