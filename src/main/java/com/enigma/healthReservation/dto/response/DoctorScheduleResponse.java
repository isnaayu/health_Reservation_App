package com.enigma.healthReservation.dto.response;

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
public class DoctorScheduleResponse {
    private Doctor doctorId;
    private LocalDateTime date;
}
