package com.program.shop_clothes;

import com.program.shop_clothes.use_case.category.InitCategoryUseCase;
import com.program.shop_clothes.use_case.size.InitSizeUseCase;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class ShopClothesApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShopClothesApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(InitSizeUseCase initSizeUseCase, InitCategoryUseCase initCategoryUseCase) {
		return arg -> {
			initSizeUseCase.execute();
			initCategoryUseCase.execute();
		};
	}

}
