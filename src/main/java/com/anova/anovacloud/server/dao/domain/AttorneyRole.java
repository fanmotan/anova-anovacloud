

package com.anova.anovacloud.server.dao.domain;

import java.util.ArrayList;
import java.util.List;
import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Index;
import com.anova.anovacloud.shared.dto.BaseEntity;
import com.anova.anovacloud.shared.dto.AttorneyRoleDto;

@Index
@Entity
public class AttorneyRole extends BaseEntity {
    private String roleName;
 

	public AttorneyRole() {
        this.roleName = "";
    }

    public AttorneyRole(String roleName) {
        this.roleName = roleName;
    }

    public static List<AttorneyRoleDto> createDto(List<AttorneyRole> attorneyRoles) {
        if (attorneyRoles == null) {
            return null;
        }

        List<AttorneyRoleDto> attorneyRolesDto = new ArrayList<>();
        for (AttorneyRole attorneyRole : attorneyRoles) {
            attorneyRolesDto.add(createDto(attorneyRole));
        }

        return attorneyRolesDto;
    }

    public static AttorneyRoleDto createDto(AttorneyRole attorneyRole) {
        if (attorneyRole == null) {
            return null;
        }

        AttorneyRoleDto attorneyRoleDto = new AttorneyRoleDto();
      
        attorneyRoleDto.setId(attorneyRole.getId());
        attorneyRoleDto.setRoleName(attorneyRole.getRoleName());

        return attorneyRoleDto;
    }

    public static List<AttorneyRole> create(List<AttorneyRoleDto> attorneyRoleDtos) {
        if (attorneyRoleDtos == null) {
            return null;
        }

        List<AttorneyRole> attorneyRoles = new ArrayList<>();
        for (AttorneyRoleDto attorneyRoleDto : attorneyRoleDtos) {
            attorneyRoles.add(create(attorneyRoleDto));
        }

        return attorneyRoles;
    }

    public static AttorneyRole create(AttorneyRoleDto attorneyRoleDto) {
        if (attorneyRoleDto == null) {
            return null;
        }

        AttorneyRole attorneyRole = new AttorneyRole();
        attorneyRole.setId(attorneyRoleDto.getId());
        attorneyRole.setRoleName(attorneyRoleDto.getRoleName());

        return attorneyRole;
    }

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
   
}
