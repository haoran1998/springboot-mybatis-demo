package com.haoran.model.pojo;

import com.haoran.model.Role;
import com.haoran.model.User;
import com.haoran.model.UserRole;

public class UserRolePojo extends UserRole {
    private User user;
    private Role role;
    public UserRolePojo() {
    }

    public UserRolePojo(Role role, User user) {
        super();
        this.role = role;
        this.user = user;
    }

    public UserRolePojo(Integer id, Integer userid, Integer roleid,Role role, User user) {
        super(id,userid,roleid);
        this.role = role;
        this.user = user;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
