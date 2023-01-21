package com.cuba.cuba.category;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface CategoryRepo extends MongoRepository<Category,String> {
    
}
