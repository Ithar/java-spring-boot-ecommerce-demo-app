package com.malik.ithar.ecommercedemoapp.model;

import javax.persistence.*;

@Entity(name = "user_roles")
public class UserRole {

    @Id
    @GeneratedValue
    @Column(name ="user_role_id")
    private Long userRoleId;

    @ManyToOne
    @JoinColumn(name="user_id")
    private User user;

    @Enumerated(EnumType.STRING)
    private Role role;

    public Long getUserRoleId() {
        return userRoleId;
    }

    public void setUserRoleId(Long userRoleId) {
        this.userRoleId = userRoleId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
