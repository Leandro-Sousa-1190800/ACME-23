package com.isep.acme.application.services;

import com.isep.acme.application.interfaces.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.isep.acme.domain.Rating;
import com.isep.acme.infrastructure.RatingRepository;

import java.util.Optional;

@Service
public class RatingServiceImpl implements RatingService {

    @Autowired
    RatingRepository repository;

    public Optional<Rating> findByRate(Double rate){
        return repository.findByRate(rate);
    }

}
