package aggregatedRating.application.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import aggregatedRating.application.dto.AggregatedRatingDTO;
import aggregatedRating.application.interfaces.repository.AggregatedRatingRepository;
import aggregatedRating.application.interfaces.service.AggregatedRatingService;

import java.util.Optional;

@Service
public class AggregatedRatingServiceImpl implements AggregatedRatingService {

    @Autowired
    AggregatedRatingRepository arRepository;

    /*

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private ProductRepository pRepository;

    @Autowired
    ReviewService rService;

    @Autowired
    ProductService productService;
*/
    @Override
    public AggregatedRatingDTO save(String sku ) {
/*
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

        return AggregatedRatingMapper.toDto(aggregateF);*/
        return new AggregatedRatingDTO(2.0,5);
    }


}
