package com.program.shop_clothes.infrastructure.controller.impl;


import com.program.shop_clothes.domain.Import;
import com.program.shop_clothes.infrastructure.controller.ImportController;
import com.program.shop_clothes.infrastructure.presenter.CommonResponse;
import com.program.shop_clothes.infrastructure.request.ImportRequest;
import com.program.shop_clothes.use_case.an_import.CreateImportUseCase;
import com.program.shop_clothes.use_case.an_import.GetAllImportUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ImportControllerImpl implements ImportController {

    private final CreateImportUseCase createImportUseCase;
    private final GetAllImportUseCase getAllImportUseCase;


    @Override
    public ResponseEntity<CommonResponse> createImport(@RequestBody ImportRequest importRequest) {

        Import anImport = createImportUseCase.execute(importRequest.getMapImportDetails(),
                    importRequest.getMessage());

        CommonResponse commonResponse = CommonResponse.builder()
                .status(HttpStatus.CREATED.value())
                .message("Created success")
                .data(anImport)
                .build();

        return ResponseEntity.ok(commonResponse);

    }

    @Override
    public ResponseEntity<CommonResponse> getImports() {

        List<Import> imports = getAllImportUseCase.execute();

        CommonResponse commonResponse = CommonResponse.builder()
                .status(HttpStatus.OK.value())
                .message("Created success")
                .data(imports)
                .build();

        return ResponseEntity.ok(commonResponse);
    }
}
