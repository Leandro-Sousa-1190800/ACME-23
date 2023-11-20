package com.isep.acme.application.mapping;

import com.isep.acme.application.dto.AggregatedRatingDTO;
import com.isep.acme.application.dto.ProductDTO;
import com.isep.acme.domain.AggregatedRating;
import com.isep.acme.domain.Product;

import java.util.ArrayList;
import java.util.List;

public class AggregatedRatingMapper {

    public static AggregatedRatingDTO toDto(AggregatedRating aggregatedRating){
        return new AggregatedRatingDTO(aggregatedRating.getAverage(), ProductMapper.toDto(aggregatedRating.getProduct()));
    }

    public static List<AggregatedRatingDTO> toDtoList(List<AggregatedRating> aggregatedRatings) {
        List<AggregatedRatingDTO> dtoList = new ArrayList<>();

        for (AggregatedRating rev: aggregatedRatings) {
            dtoList.add(toDto(rev));
        }
        return dtoList;
    }

}
