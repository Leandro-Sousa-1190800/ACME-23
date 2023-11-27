package review.application.interfaces.repository;

import review.domain.Review;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface ReviewRepository extends CrudRepository<Review, Long> {

    //Optional<Review> findById(Long productId);

    @Query("SELECT r FROM Review r WHERE r.product=:product ORDER BY r.publishingDate DESC")
    Optional<List<Review>> findByProductId(int product);


    @Query("SELECT r FROM Review r WHERE r.approvalStatus='pending'")
    Optional<List<Review>> findPendingReviews();

    @Query("SELECT r FROM Review r WHERE r.approvalStatus='active'")
    Optional<List<Review>> findActiveReviews();

    @Query("SELECT r FROM Review r WHERE r.product=:product AND r.approvalStatus=:status ORDER BY r.publishingDate DESC")
    Optional<List<Review>> findByProductIdStatus(int product, String status);

    @Query("SELECT r FROM Review r WHERE r.user=:user ORDER BY r.publishingDate DESC")
    Optional<List<Review>> findByUserId(Long user);
}
