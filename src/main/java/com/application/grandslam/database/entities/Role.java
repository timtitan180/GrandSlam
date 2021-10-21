package com.application.grandslam.database.entities;



import javax.persistence.*;

@Entity
@Table(name="roles")
class Roles {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="role_id")
    private Integer roleId;

    @Column(name="role")
    private String role;
}

