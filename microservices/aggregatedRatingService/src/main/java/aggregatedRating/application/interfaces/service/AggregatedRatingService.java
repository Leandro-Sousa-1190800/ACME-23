package aggregatedRating.application.interfaces.service;

import aggregatedRating.application.dto.AggregatedRatingDTO;

public interface AggregatedRatingService {

    AggregatedRatingDTO save(String sku);
}
