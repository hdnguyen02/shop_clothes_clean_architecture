package com.program.shop_clothes.infrastructure.use_case_impl.image;

import com.program.shop_clothes.domain.Image;
import com.program.shop_clothes.infrastructure.entity.ImageEntity;
import com.program.shop_clothes.infrastructure.entity.ProductEntity;
import com.program.shop_clothes.infrastructure.exception.ResourceNotFoundException;
import com.program.shop_clothes.infrastructure.mapper.ImageMapper;
import com.program.shop_clothes.infrastructure.repository.ImageEntityRepository;
import com.program.shop_clothes.infrastructure.repository.ProductEntityRepository;
import com.program.shop_clothes.infrastructure.service.DropboxService;
import com.program.shop_clothes.use_case.image.CreateImageUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;
import java.util.ArrayList;
import java.util.List;



@Component
@RequiredArgsConstructor
public class CreateImageUseCaseImpl implements CreateImageUseCase {

    private final ImageEntityRepository imageEntityRepository;
    private final ProductEntityRepository productEntityRepository;
    private final DropboxService dropboxService;

    @Override
    public List<Image> execute(MultipartFile[] files, String idProduct) {

        ProductEntity productEntity = productEntityRepository.findById(idProduct)
                .orElseThrow(() -> new ResourceNotFoundException("Not found product!"));

        List<Image> images = new ArrayList<>();

        for (MultipartFile file : files) {
            try {

                dropboxService.uploadFile(file, "/images-products/" + file.getOriginalFilename());
                String url = dropboxService.createSharedLink("/images-products/" + file.getOriginalFilename());

                ImageEntity imageEntity = new ImageEntity();
                imageEntity.setUrl(url);
                imageEntity.setProduct(productEntity);

                ImageEntity imageStored = imageEntityRepository.save(imageEntity);
                images.add(ImageMapper.INSTANCE.entityToDomain(imageStored));

            } catch (Exception e) {
                throw new RuntimeException(e);
            }

        }


        return images;
    }

}
