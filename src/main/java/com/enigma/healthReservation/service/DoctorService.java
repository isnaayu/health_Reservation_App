package com.enigma.healthReservation.service;

import com.enigma.healthReservation.dto.request.DoctorRequest;
import com.enigma.healthReservation.dto.response.DoctorResponse;

import java.util.List;

public interface DoctorService {
    DoctorResponse createDoctor(DoctorRequest doctorRequest);
    List<DoctorResponse> getAll();

    DoctorResponse getById(String id);
}
