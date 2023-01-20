package com.cuba.cuba.product;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class ProductServices {
    private final ProductRepo productRepo;
    public String insertOne(Product product){
        return  null ;
    }

    public Product findbyId(String id){
        return null;
    }

    public List<Product> findAll(String id){
        return null;
    }

    public  void delete (){

    }
}
