package com.enigma.healthReservation.entity;

import com.enigma.healthReservation.constant.ApprovalStatus;
import jakarta.persistence.*;
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
    @ManyToOne
    @JoinColumn(name = "doctor_id")
    private Doctor doctor;
    @ManyToOne
    @JoinColumn(name = "patient_id")
    private Patient patient;
    @ManyToOne
    @JoinColumn(name = "schedule_id")
    private DoctorSchedule schedule;
    @Column(name = "reservation_date")
    private LocalDateTime reservationDate;
    private ApprovalStatus status;
}
