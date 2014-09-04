

package com.anova.anovacloud.server.dao.domain;

import java.util.ArrayList;
import java.util.List;
import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Index;
import com.anova.anovacloud.shared.dto.BaseEntity;
import com.anova.anovacloud.shared.dto.MatterActionStatusDto;

@Index
@Entity
public class MatterActionStatus extends BaseEntity {
    private String statusName;
 

	public MatterActionStatus() {
        this.statusName = "";
    }

    public MatterActionStatus(String statusName) {
        this.statusName = statusName;
    }

    public static List<MatterActionStatusDto> createDto(List<MatterActionStatus> matterActionStatuss) {
        if (matterActionStatuss == null) {
            return null;
        }

        List<MatterActionStatusDto> matterActionStatussDto = new ArrayList<>();
        for (MatterActionStatus matterActionStatus : matterActionStatuss) {
            matterActionStatussDto.add(createDto(matterActionStatus));
        }

        return matterActionStatussDto;
    }

    public static MatterActionStatusDto createDto(MatterActionStatus matterActionStatus) {
        if (matterActionStatus == null) {
            return null;
        }

        MatterActionStatusDto matterActionStatusDto = new MatterActionStatusDto();
      
        matterActionStatusDto.setId(matterActionStatus.getId());
        matterActionStatusDto.setStatusName(matterActionStatus.getStatusName());

        return matterActionStatusDto;
    }

    public static List<MatterActionStatus> create(List<MatterActionStatusDto> matterActionStatusDtos) {
        if (matterActionStatusDtos == null) {
            return null;
        }

        List<MatterActionStatus> matterActionStatuss = new ArrayList<>();
        for (MatterActionStatusDto matterActionStatusDto : matterActionStatusDtos) {
            matterActionStatuss.add(create(matterActionStatusDto));
        }

        return matterActionStatuss;
    }

    public static MatterActionStatus create(MatterActionStatusDto matterActionStatusDto) {
        if (matterActionStatusDto == null) {
            return null;
        }

        MatterActionStatus matterActionStatus = new MatterActionStatus();
        matterActionStatus.setId(matterActionStatusDto.getId());
        matterActionStatus.setStatusName(matterActionStatusDto.getStatusName());

        return matterActionStatus;
    }

	public String getStatusName() {
		return statusName;
	}

	public void setStatusName(String statusName) {
		this.statusName = statusName;
	}
   
}
