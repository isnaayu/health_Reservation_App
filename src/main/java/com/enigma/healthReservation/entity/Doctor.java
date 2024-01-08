package com.enigma.healthReservation.entity;

import com.enigma.healthReservation.constant.EAvailability;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "m_doctor")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    @Column(name = "first_name", nullable = false)
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "specialization", nullable = false)
    private String Specialization;
    @Enumerated(EnumType.STRING)
    private EAvailability availability;
}
