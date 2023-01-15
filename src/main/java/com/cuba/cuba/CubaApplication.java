package com.cuba.cuba;

import com.cuba.cuba.product.Product;
import com.cuba.cuba.product.ProductRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CubaApplication {

	public static void main(String[] args) {
		SpringApplication.run(CubaApplication.class, args);
	}
@Bean
	public CommandLineRunner commandLineRunner(ProductRepo productRepo){
		return args ->  {
			var product = Product.builder()
					.name("IPhone")
					.description("Smart Phone created by apple")
					.build();

			productRepo.insert(product);
		};
}
}
