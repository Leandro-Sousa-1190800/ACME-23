package aggregatedRating.application.mapping;

import aggregatedRating.application.dto.AggregatedRatingDTO;
import aggregatedRating.domain.AggregatedRating;

import java.util.ArrayList;
import java.util.List;

public class AggregatedRatingMapper {

    public static AggregatedRatingDTO toDto(AggregatedRating aggregatedRating){
        return new AggregatedRatingDTO(aggregatedRating.getAverage(), aggregatedRating.getProduct());
    }

    public static List<AggregatedRatingDTO> toDtoList(List<AggregatedRating> aggregatedRatings) {
        List<AggregatedRatingDTO> dtoList = new ArrayList<>();

        for (AggregatedRating rev: aggregatedRatings) {
            dtoList.add(toDto(rev));
        }
        return dtoList;
    }

}
