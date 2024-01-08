package com.enigma.healthReservation.dto.response;

import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class PatientResponse {
    private String id;
    @NotEmpty(message = "First Name is Required")
    private String firstName;
    private String lastName;
    @NotEmpty(message = "Email is Required")
    private String emailPatient;
    private String phonePatient;
}
