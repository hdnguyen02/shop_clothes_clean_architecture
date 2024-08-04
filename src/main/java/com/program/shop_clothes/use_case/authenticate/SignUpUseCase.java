package com.program.shop_clothes.use_case.authenticate;

import com.program.shop_clothes.domain.User;

public interface SignUpUseCase {
    User execute(String username,String firstName, String lastName, String email, String phone, String gender);
}
