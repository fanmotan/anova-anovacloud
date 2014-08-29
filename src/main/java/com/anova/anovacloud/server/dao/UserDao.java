

package com.anova.anovacloud.server.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.anova.anovacloud.server.dao.domain.User;
import com.anova.anovacloud.server.dao.domain.UserRole;
import com.anova.anovacloud.shared.dto.UserRoleDto;

public class UserDao extends BaseDao<User> {
    public UserDao() {
        super(User.class);
    }

    public User findByUsername(String username) {
        return ofy().query(User.class).filter("username", username).first().now();
    }
    
    public List <UserRoleDto> getUserRoles()
	{
    	UserRoleDao userRoleDao = new UserRoleDao();
	
    	 List<UserRoleDto> userRoleDtos = UserRole.createDto(userRoleDao.getAll());
    	 return userRoleDtos;
	}
}
