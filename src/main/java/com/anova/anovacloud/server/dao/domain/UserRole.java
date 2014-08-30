

package com.anova.anovacloud.server.dao.domain;

import java.util.ArrayList;
import java.util.List;
import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Index;
import com.anova.anovacloud.shared.dto.BaseEntity;
import com.anova.anovacloud.shared.dto.UserRoleDto;

@Index
@Entity
public class UserRole extends BaseEntity {
    private String roleName;
 

	public UserRole() {
        this.roleName = "";
    }

    public UserRole(String roleName) {
        this.roleName = roleName;
    }

    public static List<UserRoleDto> createDto(List<UserRole> userRoles) {
        if (userRoles == null) {
            return null;
        }

        List<UserRoleDto> userRolesDto = new ArrayList<>();
        for (UserRole userRole : userRoles) {
            userRolesDto.add(createDto(userRole));
        }

        return userRolesDto;
    }

    public static UserRoleDto createDto(UserRole userRole) {
        if (userRole == null) {
            return null;
        }

        UserRoleDto userRoleDto = new UserRoleDto();
      
        userRoleDto.setId(userRole.getId());
        userRoleDto.setRoleName(userRole.getRoleName());

        return userRoleDto;
    }

    public static List<UserRole> create(List<UserRoleDto> userRoleDtos) {
        if (userRoleDtos == null) {
            return null;
        }

        List<UserRole> userRoles = new ArrayList<>();
        for (UserRoleDto userRoleDto : userRoleDtos) {
            userRoles.add(create(userRoleDto));
        }

        return userRoles;
    }

    public static UserRole create(UserRoleDto userRoleDto) {
        if (userRoleDto == null) {
            return null;
        }

        UserRole userRole = new UserRole();
        userRole.setId(userRoleDto.getId());
        userRole.setRoleName(userRoleDto.getRoleName());

        return userRole;
    }

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
   
}
