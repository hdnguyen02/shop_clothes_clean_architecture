package com.program.shop_clothes.use_case.authenticate;

import com.program.shop_clothes.domain.User;

public interface SignInUseCase {
    User execute(String username, String password);
}
