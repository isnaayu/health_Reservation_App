package com.enigma.healthReservation.service.impl;

import com.enigma.healthReservation.dto.request.DoctorRequest;
import com.enigma.healthReservation.dto.request.DoctorScheduleRequest;
import com.enigma.healthReservation.dto.response.DoctorResponse;
import com.enigma.healthReservation.dto.response.DoctorScheduleResponse;
import com.enigma.healthReservation.repository.DoctorRepository;
import com.enigma.healthReservation.repository.DoctorScheduleRepository;
import com.enigma.healthReservation.service.DoctorScheduleService;
import com.enigma.healthReservation.service.DoctorService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DoctorScheduleServiceImpl implements DoctorScheduleService {
    private final DoctorScheduleRepository doctorScheduleRepository;
    private final DoctorService doctorService;

    @Override
    public DoctorScheduleResponse createSchedule(DoctorScheduleRequest doctorScheduleRequest) {
//        if (){
//            return null;
//        }
        return null;
    }

    @Override
    public List<DoctorScheduleResponse> getAll() {
        return null;
    }
}
