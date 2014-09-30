

package com.anova.anovacloud.server.dao.domain;

import java.util.ArrayList;
import java.util.List;

import com.googlecode.objectify.Ref;
import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Load;
import com.googlecode.objectify.annotation.Index;
import com.anova.anovacloud.shared.dto.BaseEntity;
import com.anova.anovacloud.server.dao.objectify.Deref;
import com.anova.anovacloud.shared.dto.UserDto;


@Index
@Entity
public class User extends BaseEntity {
	private String displayName;
    private String username;
    private String hashPassword;
    private String firstName;
    private String lastName;
    private String email;
    @Load
    private Ref<UserRole> userRole;
    
   
	public User() {
    	 firstName = "";
         lastName = "";
         displayName = "";
         email = "";
         username="";
         hashPassword="";
       
    }
	
    public User(String username, String hashPassword, String firstName, String lastName,
    			String email, UserRole userRole) {
        this.username = username;    
        this.hashPassword = hashPassword;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.setUserRole(userRole);
    }
    
    public UserRole getUserRole() {
		return Deref.deref(userRole);
	}
	public void setUserRole(UserRole userRole) {
		if (userRole != null) {
            this.userRole = Ref.create(userRole);
        } else {
            this.userRole = null;
        }
	}
   
    
    @Override
    public void setId(Long id) {
        this.id = id;
    }

    public String getDisplayName() {
    	this.displayName = this.lastName + ", "+this.firstName;
        return this.displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getHashPassword() {
        return hashPassword;
    }

    public void setHashPassword(String hashPassword) {
        this.hashPassword = hashPassword;
    }
    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    

    @Override
    public String toString() {
        String s = "{ User ";
        s +=  displayName;
        s += "}";
        return s;
    }
    
    public static List<UserDto> createDto(List<User> users) {
        if (users == null) {
            return null;
        }

        List<UserDto> userDto = new ArrayList<>();
        for (User user : users) {
            userDto.add(createDto(user));
        }

        return userDto;
    }
    public static UserDto createDto(User user) {
        if (user == null) {
            return null;
        }
        UserDto userDto = new UserDto();
        userDto.setFirstName(user.getFirstName());
        userDto.setId(user.getId());
        userDto.setLastName(user.getLastName());
        userDto.setUsername(user.getUsername());
        userDto.setDisplayName(user.getDisplayName());
        userDto.setHashPassword(user.getHashPassword());
        userDto.setEmail(user.getEmail());
        userDto.setUserRole(UserRole.createDto(user.getUserRole()));
        

        return userDto;
    }

    public static User create(UserDto userDto) {
        if (userDto == null) {
            return null;
        }

        User user = new User();
        user.setFirstName(userDto.getFirstName());
        user.setHashPassword(userDto.getHashPassword());
        user.setId(userDto.getId());
        user.setLastName(userDto.getLastName());
        user.setUsername(userDto.getUsername());
        user.setDisplayName(userDto.getDisplayName());
        user.setEmail(userDto.getEmail());
        user.setUserRole(UserRole.create(userDto.getUserRole()));
        
        return user;
    }
    
    public static List<User> create(List<UserDto> userDtos) {
        if (userDtos == null) {
            return null;
        }

        List<User> users = new ArrayList<>();
        for (UserDto userDto : userDtos) {
            users.add(create(userDto));
        }

        return users;
    }
}
