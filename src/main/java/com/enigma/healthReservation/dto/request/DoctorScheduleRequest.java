package com.enigma.healthReservation.dto.request;

import com.enigma.healthReservation.entity.Doctor;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class DoctorScheduleRequest {
    private Doctor doctorId;
    private LocalDateTime date;
}
