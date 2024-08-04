package com.program.shop_clothes.domain;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@AllArgsConstructor
@Data
@Builder
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
    private List<Invoice> invoices;
    private LocalDate timestamp;

}
