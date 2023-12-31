package com.isep.acme.infrastructure;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.isep.acme.domain.Rating;

import java.util.Optional;

public interface RatingRepository extends CrudRepository<Rating, Long> {

    @Query("SELECT r FROM Rating r WHERE r.rate=:rate")
    Optional<Rating> findByRate(Double rate);

}
