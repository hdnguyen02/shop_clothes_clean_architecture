package com.program.shop_clothes.infrastructure.use_case_impl.category;

import com.program.shop_clothes.domain.Product;
import com.program.shop_clothes.infrastructure.entity.CategoryEntity;
import com.program.shop_clothes.infrastructure.repository.CategoryEntityRepository;
import com.program.shop_clothes.use_case.category.InitCategoryUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class InitCategoryUseCaseImpl implements InitCategoryUseCase {

    private final CategoryEntityRepository categoryEntityRepository;

    @Override
    public void execute() {

        int sizeCategories = categoryEntityRepository.findAll().size();
        if (sizeCategories != 0) return;


        CategoryEntity categoryOnePiece = new CategoryEntity();
        categoryOnePiece.setName("One Piece");
        categoryOnePiece.setAlias("one-piece");
        categoryOnePiece.setDescription("Bộ sưu tập one piece");
        categoryOnePiece.setCreatedBy("hdnguyen7702");


        CategoryEntity categoryCoolTouch= new CategoryEntity();
        categoryCoolTouch.setName("Cool touch (Vải làm mát)");
        categoryCoolTouch.setAlias("cool-touch");
        categoryCoolTouch.setDescription("Bộ sưu tập cool touch");
        categoryCoolTouch.setCreatedBy("hdnguyen7702");


        CategoryEntity categoryJHS= new CategoryEntity();
        categoryJHS.setName("JHS");
        categoryJHS.setAlias("japanese-horror-stories");
        categoryJHS.setDescription("Bộ sưu tập JHS");
        categoryJHS.setCreatedBy("hdnguyen7702");


        categoryEntityRepository.save(categoryOnePiece);
        categoryEntityRepository.save(categoryCoolTouch);
        categoryEntityRepository.save(categoryJHS);


    }
}
