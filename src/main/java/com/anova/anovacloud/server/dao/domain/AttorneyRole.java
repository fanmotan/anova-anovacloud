

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
    private String roleCode;
    private String roleValue;
 

	public AttorneyRole() {
        this.roleName = "";
    }

    public AttorneyRole(String roleValue, String roleCode, String roleName) {
        this.roleName = roleName;
        this.roleValue = roleValue;
        this.roleCode = roleCode;
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
        attorneyRoleDto.setRoleValue(attorneyRole.getRoleValue());
        attorneyRoleDto.setRoleCode(attorneyRole.getRoleCode());

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
        attorneyRole.setRoleValue(attorneyRoleDto.getRoleValue());
        attorneyRole.setRoleCode(attorneyRoleDto.getRoleCode());

        return attorneyRole;
    }

	public String getRoleCode() {
		return roleCode;
	}

	public void setRoleCode(String roleCode) {
		this.roleCode = roleCode;
	}

	public String getRoleValue() {
		return roleValue;
	}

	public void setRoleValue(String roleValue) {
		this.roleValue = roleValue;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
   
}
