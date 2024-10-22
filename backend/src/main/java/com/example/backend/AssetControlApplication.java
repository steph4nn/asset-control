package com.example.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.example.backend.repository")
public class AssetControlApplication {

	public static void main(String[] args) {
		SpringApplication.run(AssetControlApplication.class, args);
	}

}
