package com.zerobase.myreservation.controller;

import com.zerobase.myreservation.service.ArrivalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/arrival")
public class ArrivalController {
    @Autowired
    private ArrivalService arrivalService;

    @PostMapping("/{reservationId}")
    public ResponseEntity<Boolean> checkArrival(@PathVariable Long reservationId) {
        boolean isValid = arrivalService.checkArrival(reservationId);
        return ResponseEntity.ok(isValid);
    }
}
