package com.zerobase.myreservation.repository;

import com.zerobase.myreservation.entity.Review;
import com.zerobase.myreservation.entity.Store;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReviewRepository extends JpaRepository<Review, Long> {
    List<Review> findByStore(Store store);
}
