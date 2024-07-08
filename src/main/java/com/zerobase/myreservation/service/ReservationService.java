package com.zerobase.myreservation.service;

import com.zerobase.myreservation.entity.Reservation;
import com.zerobase.myreservation.entity.Store;
import com.zerobase.myreservation.repository.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class ReservationService {
    @Autowired
    private ReservationRepository reservationRepository;

    public Reservation makeReservation(Reservation reservation) {
        return reservationRepository.save(reservation);
    }

    public List<Reservation> findReservationByStoreAndTime(Store store, LocalDateTime start, LocalDateTime end) {
        return reservationRepository.findByStoreAndReservationTimeBetween(store, start, end);
    }
}
