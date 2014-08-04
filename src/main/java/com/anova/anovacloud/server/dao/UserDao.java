

package com.anova.anovacloud.server.dao;

import com.anova.anovacloud.server.dao.domain.User;

public class UserDao extends BaseDao<User> {
    public UserDao() {
        super(User.class);
    }

    public User findByUsername(String username) {
        return ofy().query(User.class).filter("username", username).first().now();
    }
}
