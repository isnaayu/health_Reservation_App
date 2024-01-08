package com.enigma.healthReservation.service;

import com.enigma.healthReservation.dto.request.DoctorRequest;
import com.enigma.healthReservation.dto.request.DoctorScheduleRequest;
import com.enigma.healthReservation.dto.response.DoctorResponse;
import com.enigma.healthReservation.dto.response.DoctorScheduleResponse;

import java.util.List;

public interface DoctorScheduleService {
    DoctorScheduleResponse createSchedule(DoctorScheduleRequest doctorScheduleRequest);
    List<DoctorScheduleResponse> getAll();
}
