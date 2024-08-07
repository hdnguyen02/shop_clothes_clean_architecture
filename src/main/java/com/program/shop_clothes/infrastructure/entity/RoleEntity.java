package com.program.shop_clothes.infrastructure.entity;

import com.program.shop_clothes.infrastructure.entity.base.BaseEntity;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;


@Table(name = "t_roles")
@Entity
@Getter
@Setter
public class RoleEntity extends BaseEntity {

    @Column(length = 100, nullable = false, unique = true)
    private String name;

    @Column(nullable = false)
    private String description;


    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "t_users_roles", joinColumns = @JoinColumn(name = "id_role"), inverseJoinColumns = @JoinColumn(name = "username_user"))
    private List<UserEntity> users;

}
