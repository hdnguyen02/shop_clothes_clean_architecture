package com.program.shop_clothes.infrastructure.use_case_impl.user;

import com.program.shop_clothes.infrastructure.entity.UserEntity;
import com.program.shop_clothes.infrastructure.repository.UserEntityRepository;
import com.program.shop_clothes.use_case.user.InitUserUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class InitUserUseCaseImpl implements InitUserUseCase {

    private final UserEntityRepository userEntityRepository;

    @Override
    public void execute() {

        UserEntity userEntityCustomer = new UserEntity();
        userEntityCustomer.setUsername("hathanh77");
        userEntityCustomer.setFirstName("Hà");
        userEntityCustomer.setLastName("Thanh");
        userEntityCustomer.setEmail("thanhha77@gmail.com");
        userEntityCustomer.setPhone("0971408119");
        userEntityCustomer.setPassword("123456");
        userEntityCustomer.setGender("Male");

        userEntityRepository.save(userEntityCustomer);

    }
}
