package com.cuba.cuba.product;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
@AllArgsConstructor
@Builder
public class Product {
    @Id
    private String id;
    private String name;
    private String description;

}
