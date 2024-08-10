package com.program.shop_clothes.infrastructure.use_case_impl.an_import;

import com.program.shop_clothes.domain.Import;
import com.program.shop_clothes.infrastructure.mapper.ImportMapper;
import com.program.shop_clothes.infrastructure.repository.ImportEntityRepository;
import com.program.shop_clothes.use_case.an_import.GetAllImportUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
@RequiredArgsConstructor
public class GetAllImportUseCaseImpl implements GetAllImportUseCase {

    private final ImportEntityRepository importEntityRepository;

    @Override
    public List<Import> execute() {

        return importEntityRepository.findAll()
                .stream().map(ImportMapper.INSTANCE::entityToDomain)
                .toList();

    }
}
