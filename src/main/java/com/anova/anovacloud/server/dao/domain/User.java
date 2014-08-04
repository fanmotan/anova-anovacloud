

package com.anova.anovacloud.server.dao.domain;

import java.util.ArrayList;
import java.util.List;

import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Index;
import com.anova.anovacloud.shared.dto.BaseEntity;
import com.anova.anovacloud.shared.dto.UserDto;

@Index
@Entity
public class User extends BaseEntity {
	private String displayName;
    private String username;
    private String hashPassword;
    private String firstName;
    private String lastName;
    private String role;
    private String email;
    private String mailAddress;
    private String phone;
    private String fax;

    public User() {
        firstName = "";
        lastName = "";
        displayName = "";
        role = "";
        email = "";
        mailAddress ="";
        phone ="";
        fax = "";
    }
    public User(String displayName, String username, String hashPassword, String firstName, String lastName,
    			String role, String email, String mailAddress, String phone, String fax) {
        this.displayName = displayName;
        this.username = username;    
        this.hashPassword = hashPassword;
        this.firstName = firstName;
        this.lastName = lastName;
        this.role = role;
        this.email = email;
        this.mailAddress = mailAddress;
        this.phone = phone;
        this.fax = fax;
    }
    
    @Override
    public void setId(Long id) {
        this.id = id;
    }

    public String getDisplayName() {
        return displayName;
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
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getMailAddress() {
        return mailAddress;
    }

    public void setMailAddress(String mailAddress) {
        this.mailAddress = mailAddress;
    }
    
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    
    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    @Override
    public String toString() {
        String s = "{ User ";
        s += "id=" + id + " ";
        s += "displayName=" + displayName + " ";
        s += "username=" + username + " ";
        s += "hashPassword=" + hashPassword + " ";
        s += "firstName=" + firstName + " ";
        s += "lastName=" + lastName + " ";
        s += "role=" + role + " ";
        s += "email=" + email + " ";
        s += "mailAddress=" + mailAddress + " ";
        s += "phone=" + phone + " ";
        s += "fax=" + fax + " ";
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
        userDto.setRole(user.getRole());
        userDto.setEmail(user.getEmail());
        userDto.setMailAddress(user.getMailAddress());
        userDto.setPhone(user.getPhone());
        userDto.setFax(user.getFax());

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
        user.setRole(userDto.getRole());
        user.setEmail(userDto.getEmail());
        user.setMailAddress(userDto.getMailAddress());
        user.setPhone(userDto.getPhone());
        user.setFax(userDto.getFax());

        return user;
    }
}
