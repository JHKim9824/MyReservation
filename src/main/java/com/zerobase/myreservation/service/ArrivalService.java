package com.zerobase.myreservation.service;

import com.zerobase.myreservation.entity.Reservation;
import com.zerobase.myreservation.repository.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ArrivalService {
    @Autowired
    private ReservationRepository reservationRepository;

    public boolean checkArrival(Long reservationId) {
        Optional<Reservation> reservation = reservationRepository.findById(reservationId);
        if(reservation.isPresent()) {
            return true;
        }
        return false;
    }
}
