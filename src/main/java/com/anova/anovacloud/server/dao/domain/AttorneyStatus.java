

package com.anova.anovacloud.server.dao.domain;

import java.util.ArrayList;
import java.util.List;
import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Index;
import com.anova.anovacloud.shared.dto.BaseEntity;
import com.anova.anovacloud.shared.dto.AttorneyStatusDto;

@Index
@Entity
public class AttorneyStatus extends BaseEntity {
    private String statusName;
 

	public AttorneyStatus() {
        this.statusName = "";
    }

    public AttorneyStatus(String statusName) {
        this.statusName = statusName;
    }

    public static List<AttorneyStatusDto> createDto(List<AttorneyStatus> attorneyStatuss) {
        if (attorneyStatuss == null) {
            return null;
        }

        List<AttorneyStatusDto> attorneyStatussDto = new ArrayList<>();
        for (AttorneyStatus attorneyStatus : attorneyStatuss) {
            attorneyStatussDto.add(createDto(attorneyStatus));
        }

        return attorneyStatussDto;
    }

    public static AttorneyStatusDto createDto(AttorneyStatus attorneyStatus) {
        if (attorneyStatus == null) {
            return null;
        }

        AttorneyStatusDto attorneyStatusDto = new AttorneyStatusDto();
      
        attorneyStatusDto.setId(attorneyStatus.getId());
        attorneyStatusDto.setStatusName(attorneyStatus.getStatusName());

        return attorneyStatusDto;
    }

    public static List<AttorneyStatus> create(List<AttorneyStatusDto> attorneyStatusDtos) {
        if (attorneyStatusDtos == null) {
            return null;
        }

        List<AttorneyStatus> attorneyStatuss = new ArrayList<>();
        for (AttorneyStatusDto attorneyStatusDto : attorneyStatusDtos) {
            attorneyStatuss.add(create(attorneyStatusDto));
        }

        return attorneyStatuss;
    }

    public static AttorneyStatus create(AttorneyStatusDto attorneyStatusDto) {
        if (attorneyStatusDto == null) {
            return null;
        }

        AttorneyStatus attorneyStatus = new AttorneyStatus();
        attorneyStatus.setId(attorneyStatusDto.getId());
        attorneyStatus.setStatusName(attorneyStatusDto.getStatusName());

        return attorneyStatus;
    }

	public String getStatusName() {
		return statusName;
	}

	public void setStatusName(String statusName) {
		this.statusName = statusName;
	}
   
}
