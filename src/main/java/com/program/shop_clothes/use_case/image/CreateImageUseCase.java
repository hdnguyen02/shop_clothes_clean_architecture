package com.program.shop_clothes.use_case.image;

import com.program.shop_clothes.domain.Image;
import org.springframework.web.multipart.MultipartFile;

public interface CreateImageUseCase {

    Image execute(MultipartFile image);

}
