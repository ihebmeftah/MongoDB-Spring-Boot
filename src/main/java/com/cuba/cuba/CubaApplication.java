package com.cuba.cuba;

import com.cuba.cuba.category.Category;
import com.cuba.cuba.category.CategoryRepo;
import com.cuba.cuba.product.Product;
import com.cuba.cuba.product.ProductRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CubaApplication {

	public static void main(String[] args) {
		SpringApplication.run(CubaApplication.class, args);
	}

	public CommandLineRunner commandLineRunner(ProductRepo productRepo, CategoryRepo categoryRepo) {
		return args -> {
			var category = Category.builder().name("Smart Phone").description("Smart Phone").build();
			var category2 = Category.builder().name("Sammsung").description("Sammsung").build();
			categoryRepo.insert(category);
			categoryRepo.insert(category2);

			var product = Product.builder()
					.name("IPhone")
					.description("Smart Phone created by apple")
					.build();

			productRepo.insert(product);
		};
	}
}
