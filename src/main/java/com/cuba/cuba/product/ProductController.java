package com.cuba.cuba.product;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/products")
@RequiredArgsConstructor
public class ProductController {
    private final ProductServices productServices;

    @PostMapping
    public ResponseEntity<String> save(
            @RequestBody Product product
    ){
        return ResponseEntity.ok(productServices.save(product));
    }

    @GetMapping
    public ResponseEntity<List<Product>> findAll(){
        return ResponseEntity.ok(productServices.findAll ());
    }

    @GetMapping("/{productId}")
    public ResponseEntity<Product> findById( @PathVariable("productId") String productId){
        return ResponseEntity.ok(productServices.findById(productId));
    }

    @DeleteMapping("/{productId}")
    public ResponseEntity<Void > delete( @PathVariable("productId") String productId){
        productServices.delete(productId);
        return ResponseEntity.accepted().build();
}
}
