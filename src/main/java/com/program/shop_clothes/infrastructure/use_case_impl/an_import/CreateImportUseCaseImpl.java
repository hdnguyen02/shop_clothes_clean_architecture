package com.program.shop_clothes.infrastructure.use_case_impl.an_import;

import com.program.shop_clothes.domain.Import;
import com.program.shop_clothes.infrastructure.entity.ImportDetailEntity;
import com.program.shop_clothes.infrastructure.entity.ImportEntity;
import com.program.shop_clothes.infrastructure.entity.ProductSizeEntity;
import com.program.shop_clothes.infrastructure.exception.ResourceNotFoundException;
import com.program.shop_clothes.infrastructure.mapper.ImportMapper;
import com.program.shop_clothes.infrastructure.repository.ImportEntityRepository;
import com.program.shop_clothes.infrastructure.repository.ProductSizeEntityRepository;
import com.program.shop_clothes.use_case.an_import.CreateImportUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;


@Component
@RequiredArgsConstructor
public class CreateImportUseCaseImpl implements CreateImportUseCase {

    private final ImportEntityRepository importEntityRepository;
    private final ProductSizeEntityRepository productSizeEntityRepository;

    @Override
    @Transactional
    public Import execute(Map<String, Integer> mapImportDetails, String message) {

        // mapImportDetails { idProductSize, quantity }

        List<ImportDetailEntity> importDetailEntities = new ArrayList<>();

        try {
            for (Map.Entry<String, Integer> entry : mapImportDetails.entrySet()) {

                String idProductSize = entry.getKey();
                int quantityProduct = entry.getValue();

                ProductSizeEntity productSizeEntity = productSizeEntityRepository.findById(idProductSize)
                        .orElseThrow(() -> new ResourceNotFoundException("Not found ProductSize with id: " + idProductSize));

                productSizeEntity.setQuantityProduct(productSizeEntity.getQuantityProduct() - quantityProduct);

                productSizeEntityRepository.save(productSizeEntity);

                ImportDetailEntity importDetailEntity = new ImportDetailEntity();
                importDetailEntity.setProductSize(productSizeEntity);
                importDetailEntity.setQuantityProduct(quantityProduct);
                importDetailEntities.add(importDetailEntity);

            }

            ImportEntity importEntity = new ImportEntity();
            importEntity.setImportDetails(importDetailEntities);
            importEntity.setMessage(message);
            importEntity.setCreatedBy("hdnguyen");

            return ImportMapper.INSTANCE.entityToDomain(importEntityRepository.save(importEntity));

        }
        catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }




    }
}
