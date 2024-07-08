package com.zerobase.myreservation.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Objects;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDateTime reservationTime;

    @ManyToOne
    private User user;

    @ManyToOne
    private Store store;

    // toString, equals, and hashCode
    @Override
    public String toString() {
        return "Reservation{" +
                "id=" + id +
                ", reservationTime=" + reservationTime +
                ", user=" + user +
                ", store=" + store +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Reservation that = (Reservation) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(reservationTime, that.reservationTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, reservationTime);
    }
}
