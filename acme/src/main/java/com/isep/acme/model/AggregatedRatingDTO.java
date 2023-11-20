package com.isep.acme.model;

public class AggregatedRatingDTO {
    private Long aggregatedId;
    private double average;
    private ProductDTO product;

    public AggregatedRatingDTO() {
    }

    public AggregatedRatingDTO(Long aggregatedId, double average) {
        this.aggregatedId = aggregatedId;
        this.average = average;
    }

    public AggregatedRatingDTO(Long aggregatedId, double average, ProductDTO product) {
        this.aggregatedId = aggregatedId;
        this.average = average;
        this.product = product;
    }
}
