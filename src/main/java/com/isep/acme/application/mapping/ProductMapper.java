package com.isep.acme.application.mapping;

import com.isep.acme.application.dto.ProductDTO;
import com.isep.acme.application.dto.ReviewDTO;
import com.isep.acme.domain.Product;
import com.isep.acme.domain.Review;

import java.util.ArrayList;
import java.util.List;

public class ProductMapper {

    public static ProductDTO toDto(Product product){
        return new ProductDTO(product.getSku(), product.getDesignation());
    }

    public static List<ProductDTO> toDtoList(List<Product> products) {
        List<ProductDTO> dtoList = new ArrayList<>();

        for (Product rev: products) {
            dtoList.add(toDto(rev));
        }
        return dtoList;
    }

}
