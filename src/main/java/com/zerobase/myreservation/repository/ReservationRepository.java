package com.zerobase.myreservation.repository;

import com.zerobase.myreservation.entity.Reservation;
import com.zerobase.myreservation.entity.Store;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation, Long> {
    List<Reservation> findByStoreAndReservationTimeBetween(Store store, LocalDateTime start, LocalDateTime end);
}
