package com.enigma.healthReservation.entity;

import com.enigma.healthReservation.constant.ApprovalStatus;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name = "t_reservation")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Reservation {
    private String id;
    private Doctor doctor;
    private Patient patient;
    private DoctorSchedule schedule;
    @Column(name = "reservation_date")
    private LocalDateTime reservationDate;
    private ApprovalStatus status;
}
