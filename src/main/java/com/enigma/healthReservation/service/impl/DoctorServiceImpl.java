package com.enigma.healthReservation.service.impl;

import com.enigma.healthReservation.constant.EAvailability;
import com.enigma.healthReservation.dto.request.DoctorRequest;
import com.enigma.healthReservation.dto.response.DoctorResponse;
import com.enigma.healthReservation.entity.Doctor;
import com.enigma.healthReservation.repository.DoctorRepository;
import com.enigma.healthReservation.service.DoctorService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class DoctorServiceImpl implements DoctorService {
    private final DoctorRepository doctorRepository;
    @Override
    public DoctorResponse createDoctor(DoctorRequest doctorRequest) {
        EAvailability availability = EAvailability.AVAILABLE;

        // Directly compare enum values
        if (EAvailability.NO_AVAILABLE.equals(doctorRequest.getAvailability())) {
            availability = EAvailability.NO_AVAILABLE;
        }

        Doctor doctor = Doctor.builder()
                .firstName(doctorRequest.getFirstName())
                .lastName(doctorRequest.getLastName())
                .Specialization(doctorRequest.getSpecialization())
                .availability(availability)
                .build();
        doctorRepository.save(doctor);

        return DoctorResponse.builder()
                .id(doctor.getId())
                .firstNameDoctor(doctor.getFirstName())
                .lastNameDoctor(doctor.getLastName())
                .SpecializationDoctor(doctor.getSpecialization())
                .availability(doctor.getAvailability())
                .build();
    }

    @Override
    public List<DoctorResponse> getAll() {
        return doctorRepository.findAll().stream().map((doctor ->{
            DoctorResponse doctorResponse = new DoctorResponse();
            doctorResponse.setId(doctor.getId());
            doctorResponse.setFirstNameDoctor(doctor.getFirstName());
            doctorResponse.setLastNameDoctor(doctor.getLastName());
            doctorResponse.setSpecializationDoctor(doctor.getSpecialization());
            doctorResponse.setAvailability(doctor.getAvailability());
            return doctorResponse;
        })).collect(Collectors.toList());
    }
}
