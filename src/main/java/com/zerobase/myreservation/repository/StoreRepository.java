package com.zerobase.myreservation.repository;

import com.zerobase.myreservation.entity.Store;
import com.zerobase.myreservation.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StoreRepository extends JpaRepository<Store, Long> {
    List<Store> findByManager(User manager);
}
