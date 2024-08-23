package com.program.shop_clothes;

import com.program.shop_clothes.infrastructure.service.InitDB;
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
	CommandLineRunner commandLineRunner(InitDB initDB) {
		return arg -> {
			initDB.execute();
		};
	}

}
