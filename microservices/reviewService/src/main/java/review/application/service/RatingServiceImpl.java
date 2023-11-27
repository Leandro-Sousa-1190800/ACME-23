package review.application.service;

import review.application.interfaces.service.RatingService;
import review.domain.Rating;
import review.application.interfaces.repository.RatingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class RatingServiceImpl implements RatingService {

    @Autowired
    RatingRepository repository;

    public Optional<Rating> findByRate(Double rate){
        return repository.findByRate(rate);
    }

}
