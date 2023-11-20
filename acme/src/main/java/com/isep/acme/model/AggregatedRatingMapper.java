package com.isep.acme.model;

public class AggregatedRatingMapper {

    public static AggregatedRatingDTO toDto(AggregatedRating aggregatedRating){
        return new AggregatedRatingDTO(aggregatedRating.getAggregatedId(),aggregatedRating.getAggregatedId(),ProductMapper.toDto(aggregatedRating.getProduct()));
    }

}
