package aggregatedRating;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import com.isep.acme.property.FileStorageProperties;

@SpringBootApplication
@EnableConfigurationProperties({
        FileStorageProperties.class
})
public class AggregatedRatingServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(AggregatedRatingServiceApplication.class, args);
    }

}
