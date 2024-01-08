package com.enigma.healthReservation.dto.request;

import com.enigma.healthReservation.constant.EAvailability;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class DoctorRequest {
    @NotEmpty(message = "First Name is Required")
    private String firstName;
    private String lastName;
    @NotEmpty(message = "Specialization is Required")
    private String specialization;
    private EAvailability availability;
}
