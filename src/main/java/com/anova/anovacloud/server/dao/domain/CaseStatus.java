

package com.anova.anovacloud.server.dao.domain;

import java.util.ArrayList;
import java.util.List;
import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Index;
import com.anova.anovacloud.shared.dto.BaseEntity;
import com.anova.anovacloud.shared.dto.CaseStatusDto;

@Index
@Entity
public class CaseStatus extends BaseEntity {
    private String statusName;
 

	public CaseStatus() {
        this.statusName = "";
    }

    public CaseStatus(String statusName) {
        this.statusName = statusName;
    }

    public static List<CaseStatusDto> createDto(List<CaseStatus> caseStatuss) {
        if (caseStatuss == null) {
            return null;
        }

        List<CaseStatusDto> caseStatussDto = new ArrayList<>();
        for (CaseStatus caseStatus : caseStatuss) {
            caseStatussDto.add(createDto(caseStatus));
        }

        return caseStatussDto;
    }

    public static CaseStatusDto createDto(CaseStatus caseStatus) {
        if (caseStatus == null) {
            return null;
        }

        CaseStatusDto caseStatusDto = new CaseStatusDto();
      
        caseStatusDto.setId(caseStatus.getId());
        caseStatusDto.setStatusName(caseStatus.getStatusName());

        return caseStatusDto;
    }

    public static List<CaseStatus> create(List<CaseStatusDto> caseStatusDtos) {
        if (caseStatusDtos == null) {
            return null;
        }

        List<CaseStatus> caseStatuss = new ArrayList<>();
        for (CaseStatusDto caseStatusDto : caseStatusDtos) {
            caseStatuss.add(create(caseStatusDto));
        }

        return caseStatuss;
    }

    public static CaseStatus create(CaseStatusDto caseStatusDto) {
        if (caseStatusDto == null) {
            return null;
        }

        CaseStatus caseStatus = new CaseStatus();
        caseStatus.setId(caseStatusDto.getId());
        caseStatus.setStatusName(caseStatusDto.getStatusName());

        return caseStatus;
    }

	public String getStatusName() {
		return statusName;
	}

	public void setStatusName(String statusName) {
		this.statusName = statusName;
	}
   
}
