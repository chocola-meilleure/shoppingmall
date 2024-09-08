package com.shop.fruit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.shop.fruit.repository")
@EntityScan("com.shop.fruit.entity")
public class FruitApplication {

	public static void main(String[] args) {
		SpringApplication.run(FruitApplication.class, args);
	}

}