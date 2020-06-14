package com.malik.ithar.ecommercedemoapp.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity(name = "user_roles")
public class UserRole {

    @Id
    @GeneratedValue
    @Column(name ="user_role_id")
    private Long userRoleId;

    private Long userId;

    private Role role;

    @ManyToOne
    @JoinColumn(name="id", nullable=false)
    private User user;

}
