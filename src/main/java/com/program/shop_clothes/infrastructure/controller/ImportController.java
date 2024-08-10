package com.program.shop_clothes.infrastructure.controller;


import com.program.shop_clothes.infrastructure.presenter.CommonResponse;
import com.program.shop_clothes.infrastructure.request.ImportRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("api/v1")
public interface ImportController {

    @PostMapping("/imports")
    ResponseEntity<CommonResponse> createImport(ImportRequest importRequest);

    @GetMapping("/imports")
    ResponseEntity<CommonResponse> getImports();

}
