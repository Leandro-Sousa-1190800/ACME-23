package com.isep.acme.application.services;

import com.isep.acme.application.dto.AggregatedRatingDTO;
import com.isep.acme.application.interfaces.AggregatedRatingService;
import com.isep.acme.application.interfaces.ProductService;
import com.isep.acme.application.interfaces.ReviewService;
import com.isep.acme.application.mapping.AggregatedRatingMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.isep.acme.domain.AggregatedRating;
import com.isep.acme.domain.Product;
import com.isep.acme.infrastructure.AggregatedRatingRepository;
import com.isep.acme.infrastructure.ProductRepository;

import java.util.Optional;

@Service
public class AggregatedRatingServiceImpl implements AggregatedRatingService {

    @Autowired
    AggregatedRatingRepository arRepository;

    @Autowired
    private ProductRepository pRepository;

    @Autowired
    ReviewService rService;

    @Autowired
    ProductService productService;

    @Override
    public AggregatedRatingDTO save(String sku ) {

        Optional<Product> product = pRepository.findBySku( sku );

        if (product.isEmpty()){
            return null;
        }

        Double average = rService.getWeightedAverage(product.get());


        Optional<AggregatedRating> r = arRepository.findByProductId(product.get());
        AggregatedRating aggregateF;

        if(r.isPresent()) {
            r.get().setAverage( average );
            aggregateF = arRepository.save(r.get());
        }
        else {
            AggregatedRating f = new AggregatedRating(average, product.get());
            aggregateF = arRepository.save(f);
        }

        return AggregatedRatingMapper.toDto(aggregateF);
    }


}
