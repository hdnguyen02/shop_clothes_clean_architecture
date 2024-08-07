package com.program.shop_clothes.use_case.user;

import com.program.shop_clothes.domain.*;

public interface UpdateUserUseCase {

    User execute(String username, String firstName, String lastName, String password, String email, String phone, String gender, boolean isEnabled);

}
