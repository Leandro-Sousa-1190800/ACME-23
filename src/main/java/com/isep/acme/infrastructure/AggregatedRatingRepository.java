package com.isep.acme.infrastructure;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.isep.acme.domain.AggregatedRating;
import com.isep.acme.domain.Product;
import java.util.Optional;

public interface AggregatedRatingRepository extends CrudRepository<AggregatedRating, Long> {

    @Query("SELECT a FROM AggregatedRating a WHERE a.product=:product")
    Optional<AggregatedRating> findByProductId(Product product);

}
