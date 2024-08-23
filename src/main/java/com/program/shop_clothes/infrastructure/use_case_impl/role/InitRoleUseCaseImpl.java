package com.program.shop_clothes.infrastructure.use_case_impl.role;


import com.program.shop_clothes.infrastructure.entity.RoleEntity;
import com.program.shop_clothes.infrastructure.repository.RoleEntityRepository;
import com.program.shop_clothes.use_case.role.InitRoleUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class InitRoleUseCaseImpl implements InitRoleUseCase {

    private final RoleEntityRepository roleEntityRepository;

    @Override
    public void execute() {

        int sizeRoles = roleEntityRepository.findAll().size();
        if (sizeRoles != 0) return;

        RoleEntity roleEntityCustomer = new RoleEntity();
        roleEntityCustomer.setName("CUSTOMER");
        roleEntityCustomer.setDescription("Role customer");

        RoleEntity roleEntityAdmin = new RoleEntity();
        roleEntityAdmin.setName("ADMIN");
        roleEntityAdmin.setDescription("Role admin");

        roleEntityRepository.save(roleEntityCustomer);
        roleEntityRepository.save(roleEntityAdmin);

    }
}
