package com.enigma.healthReservation.service;

import com.enigma.healthReservation.dto.request.PatientRequest;
import com.enigma.healthReservation.dto.response.PatientResponse;

import java.util.List;

public interface PatientService {
    PatientResponse createPatient(PatientRequest patientRequest);
    List<PatientResponse> getAll();
}
