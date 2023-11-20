package com.isep.acme.application.interfaces;

import com.isep.acme.application.dto.AggregatedRatingDTO;
import com.isep.acme.domain.AggregatedRating;

public interface AggregatedRatingService {

    AggregatedRatingDTO save(String sku);
}
