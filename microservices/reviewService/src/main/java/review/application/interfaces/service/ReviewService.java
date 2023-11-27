package review.application.interfaces.service;

import review.application.dto.CreateReviewDTO;
import review.application.dto.ReviewDTO;
import review.application.dto.VoteReviewDTO;
import review.domain.Review;

import java.util.List;

public interface ReviewService {

    Iterable<Review> getAll();

    List<ReviewDTO> getReviewsOfProduct(String sku, String status);

    ReviewDTO create(CreateReviewDTO createReviewDTO, String sku);

    boolean addVoteToReview(Long reviewID, VoteReviewDTO voteReviewDTO);

    Double getWeightedAverage(int productId);

    Boolean DeleteReview(Long reviewId);

    List<ReviewDTO> findPendingReview();

    ReviewDTO moderateReview(Long reviewID, String approved);

    List<ReviewDTO> findReviewsByUser(Long userID);
}
