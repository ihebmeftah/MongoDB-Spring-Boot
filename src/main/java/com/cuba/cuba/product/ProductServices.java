package com.cuba.cuba.product;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class ProductServices {
    private final ProductRepo productRepo;
    public String save(Product product){
        return  productRepo.save(product).getId() ;
    }

    public Product findById(String id){
        return productRepo.findById(id).orElse(null);
    }

    public List<Product> findAll(String id){
        return productRepo.findAll();
    }

    public  void delete (String id){
    productRepo.deleteById(id);
    }
}
