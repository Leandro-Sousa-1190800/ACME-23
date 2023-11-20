package com.isep.acme.application.dto;

import com.isep.acme.domain.Product;

public class AggregatedRatingDTO {

    private Long aggregatedId;
    private double average;
    private ProductDTO product;

    public AggregatedRatingDTO(double average, ProductDTO product) {
        this.average = average;
        this.product = product;
    }

    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        this.average = average;
    }

    public ProductDTO getProduct() {
        return product;
    }

    public void setProduct(ProductDTO product) {
        this.product = product;
    }
}
