package com.program.shop_clothes.use_case.an_import;

import com.program.shop_clothes.domain.Import;

import java.util.Map;

public interface CreateImportUseCase {

    // mapImport { idProductSize, quantity }
    Import execute(Map<String, Integer> mapImportDetails, String message);

}
