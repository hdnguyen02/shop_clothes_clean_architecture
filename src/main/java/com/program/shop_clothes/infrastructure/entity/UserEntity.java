package com.program.shop_clothes.infrastructure.entity;

import jakarta.persistence.*;
import lombok.*;
import java.util.List;


@Table(name = "t_users")
@Entity
@Getter
@Setter
@NoArgsConstructor
public class UserEntity {

    @Id
    private String username;

    @Column(length = 50, nullable = false)
    private String firstName;

    @Column(length = 50, nullable = false)
    private String lastName;

    @Column(nullable = false)
    private String password;

    @Column(length = 50, nullable = false)
    private String email;

    @Column(length = 15, nullable = false)
    private String phone;

    @Column(nullable = false)
    private String gender;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "t_users_roles", joinColumns = @JoinColumn(name = "username_user"), inverseJoinColumns = @JoinColumn(name = "id_role"))
    private List<RoleEntity> roles;

    @OneToMany(mappedBy = "user")
    private List<CartItemEntity> cartItems;

    @OneToMany(mappedBy = "user")
    private List<OrderEntity> anOrders;


    @Column(nullable = false)
    private boolean isEnabled;


}
