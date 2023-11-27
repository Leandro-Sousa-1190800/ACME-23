package review.application.interfaces.service;

import review.domain.Rating;

import java.util.Optional;

public interface RatingService {

    Optional<Rating> findByRate(Double rate);
}
