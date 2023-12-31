package com.isep.acme.application.interfaces;

import java.util.List;

import com.isep.acme.application.dto.CreateReviewDTO;
import com.isep.acme.application.dto.ReviewDTO;
import com.isep.acme.application.dto.VoteReviewDTO;
import com.isep.acme.domain.*;

public interface ReviewService {

    Iterable<Review> getAll();

    List<ReviewDTO> getReviewsOfProduct(String sku, String status);

    ReviewDTO create(CreateReviewDTO createReviewDTO, String sku);

    boolean addVoteToReview(Long reviewID, VoteReviewDTO voteReviewDTO);

    Double getWeightedAverage(Product product);

    Boolean DeleteReview(Long reviewId);

    List<ReviewDTO> findPendingReview();

    ReviewDTO moderateReview(Long reviewID, String approved);

    List<ReviewDTO> findReviewsByUser(Long userID);
}
