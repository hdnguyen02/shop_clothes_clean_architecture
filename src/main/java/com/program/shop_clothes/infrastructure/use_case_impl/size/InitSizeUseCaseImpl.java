package com.program.shop_clothes.infrastructure.use_case_impl.size;

import com.program.shop_clothes.infrastructure.entity.SizeEntity;
import com.program.shop_clothes.infrastructure.repository.SizeEntityRepository;
import com.program.shop_clothes.use_case.size.InitSizeUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;


@Component
@RequiredArgsConstructor
public class InitSizeUseCaseImpl implements InitSizeUseCase {


    private final SizeEntityRepository sizeEntityRepository;

    @Override
    public void execute() {

        int quantitySizes = sizeEntityRepository.findAll().size();
        if (quantitySizes != 0) return;


        SizeEntity sizeS = new SizeEntity();
        sizeS.setName("S");

        SizeEntity sizeM = new SizeEntity();
        sizeM.setName("M");

        SizeEntity sizeL = new SizeEntity();
        sizeL.setName("L");

        SizeEntity sizeXL = new SizeEntity();
        sizeXL.setName("XL");


        sizeEntityRepository.save(sizeS);
        sizeEntityRepository.save(sizeM);
        sizeEntityRepository.save(sizeL);
        sizeEntityRepository.save(sizeXL);

    }
}
