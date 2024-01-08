package com.enigma.healthReservation.dto.response;

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
public class DoctorResponse {
    private String id;
    @NotEmpty(message = "First Name is Required")
    private String firstNameDoctor;
    private String lastNameDoctor;
    @NotEmpty(message = "Specialization is Required")
    private String SpecializationDoctor;
    private EAvailability availability;
}
