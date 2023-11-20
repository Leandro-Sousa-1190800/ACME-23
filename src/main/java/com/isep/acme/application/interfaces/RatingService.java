package com.isep.acme.application.interfaces;

import java.util.Optional;

import com.isep.acme.domain.Rating;

public interface RatingService {

    Optional<Rating> findByRate(Double rate);
}
