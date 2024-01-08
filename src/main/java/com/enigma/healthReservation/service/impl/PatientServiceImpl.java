package com.enigma.healthReservation.service.impl;

import com.enigma.healthReservation.dto.request.PatientRequest;
import com.enigma.healthReservation.dto.response.PatientResponse;
import com.enigma.healthReservation.entity.Patient;
import com.enigma.healthReservation.repository.PatientRepository;
import com.enigma.healthReservation.service.PatientService;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class PatientServiceImpl implements PatientService {
    @PersistenceContext
    private EntityManager entityManager;

    private final PatientRepository patientRepository;
    @Transactional
    @Override
    public PatientResponse createPatient(PatientRequest patientRequest) {
        Patient patient = Patient.builder()
                .email(patientRequest.getEmail())
                .firstName(patientRequest.getFirstName())
                .lastName(patientRequest.getLastName())
                .phone(patientRequest.getPhone())
                .build();
        patientRepository.save(patient);

        return PatientResponse.builder()
                .id(patient.getId())
                .firstName(patientRequest.getFirstName())
                .lastName(patientRequest.getLastName())
                .emailPatient(patientRequest.getEmail())
                .phonePatient(patientRequest.getPhone())
                .build();
    }

    @Override
    public List<PatientResponse> getAll() {
        return patientRepository.findAll().stream().map((patient ->{
            PatientResponse patientResponse = new PatientResponse();
            patientResponse.setId(patient.getId());
            patientResponse.setFirstName(patient.getFirstName());
            patientResponse.setLastName(patient.getLastName());
            patientResponse.setEmailPatient(patient.getEmail());
            patientResponse.setPhonePatient(patient.getPhone());
            return patientResponse;
        })).collect(Collectors.toList());
    }
}
