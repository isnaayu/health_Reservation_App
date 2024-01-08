package com.enigma.healthReservation.dto.request;

import jakarta.persistence.Column;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class PatientRequest {
    private String id;
    @NotEmpty(message = "First Name is Required")
    private String firstName;
    private String lastName;
    @NotEmpty(message = "Email is Required")
    private String email;
    private String phone;
}
