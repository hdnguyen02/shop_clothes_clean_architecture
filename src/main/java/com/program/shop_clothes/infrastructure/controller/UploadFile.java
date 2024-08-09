package com.program.shop_clothes.infrastructure.controller;


import com.program.shop_clothes.infrastructure.service.DropboxService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequiredArgsConstructor
public class UploadFile {


    private final DropboxService dropboxService;


    @PostMapping("/upload-file")
    public boolean uploadFile(@RequestParam MultipartFile multipartFile) {

        try {
            String path = "/images-products/" + multipartFile.getOriginalFilename();
            dropboxService.uploadFile(multipartFile, path);
            System.out.println("Shared link: " + dropboxService.createSharedLink(path));
            return true;
        }
        catch (Exception e) {
            System.out.println("Lỗi upload file: " + e.getMessage());
            return false;
        }

    }


}
