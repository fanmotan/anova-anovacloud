

package com.anova.anovacloud.server.rest;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import com.anova.anovacloud.server.dao.CaseStatusDao;
import com.anova.anovacloud.server.dao.domain.CaseStatus;
import com.anova.anovacloud.shared.dto.CaseStatusDto;
import com.anova.anovacloud.shared.rest.ResourcesPath;

@Path(ResourcesPath.CASESTATUS)
@Produces(MediaType.APPLICATION_JSON)
public class CaseStatusResource {
    private final CaseStatusDao caseStatusDao;


    @Inject
    CaseStatusResource(CaseStatusDao caseStatusDao) {
        this.caseStatusDao = caseStatusDao;
    }

    @GET
    public Response getCaseStatuss() {
        List<CaseStatusDto> caseStatusDtos = CaseStatus.createDto(caseStatusDao.getAll());
        return Response.ok(caseStatusDtos).build();
    }

   

}
