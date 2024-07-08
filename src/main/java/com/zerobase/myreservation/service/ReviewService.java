package com.zerobase.myreservation.service;

import com.zerobase.myreservation.entity.Review;
import com.zerobase.myreservation.entity.Store;
import com.zerobase.myreservation.repository.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class ReviewService {
    @Autowired
    private ReviewRepository reviewRepository;

    public Review writeReview(Review review) {
        review.setCreatedTime(LocalDateTime.now());
        return reviewRepository.save(review);
    }

    public Review updateReview(Review review) {
        review.setUpdatedTime(LocalDateTime.now());
        return reviewRepository.save(review);
    }

    public void deleteReview(Long reviewId) {
        reviewRepository.deleteById(reviewId);
    }

    public List<Review> findReviewByStore(Store store) {
        return reviewRepository.findByStore(store);
    }
}
