package com.isep.acme.model;

public class ProductMapper {

    public static ProductDTO toDto(Product product){
        return new ProductDTO(product.getSku(),product.getDesignation());
    }

}
