package com.program.shop_clothes.domain;


import lombok.*;

import java.time.LocalDate;
import java.util.List;


@Getter
@Setter
public class User {

    private String username;
    private String firstName;
    private String lastName;
    private String password;
    private String email;
    private String phone;
    private String gender;
    private List<Role> roles;
    private List<CartItem> cartItems;
    private List<Order> orders;
    private boolean isEnabled;

}
