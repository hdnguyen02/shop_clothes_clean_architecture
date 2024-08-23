package com.program.shop_clothes.infrastructure.service.impl;


import com.program.shop_clothes.infrastructure.service.InitDB;
import com.program.shop_clothes.use_case.category.InitCategoryUseCase;
import com.program.shop_clothes.use_case.role.InitRoleUseCase;
import com.program.shop_clothes.use_case.size.InitSizeUseCase;
import com.program.shop_clothes.use_case.user.InitUserUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class InitDBImpl implements InitDB {

    private final InitRoleUseCase initRoleUseCase;
    private final InitSizeUseCase initSizeUseCase;
    private final InitCategoryUseCase initCategoryUseCase;
    private final InitUserUseCase initUserUseCase;

    @Override
    public void execute() {
        initUserUseCase.execute();
        initRoleUseCase.execute();;
        initSizeUseCase.execute();
        initCategoryUseCase.execute();
    }
}
