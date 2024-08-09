package com.program.shop_clothes.use_case.image;

import com.program.shop_clothes.domain.Image;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface CreateImageUseCase {

    List<Image> execute(MultipartFile [] files, String idProduct);

}
