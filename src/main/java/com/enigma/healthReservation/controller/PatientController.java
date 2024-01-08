package com.enigma.healthReservation.controller;

import com.enigma.healthReservation.constant.AppPath;
import com.enigma.healthReservation.dto.request.PatientRequest;
import com.enigma.healthReservation.dto.response.CommonResponse;
import com.enigma.healthReservation.dto.response.PatientResponse;
import com.enigma.healthReservation.service.PatientService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(AppPath.PATIENT)
public class PatientController {
    private final PatientService patientService;
    @PostMapping
    public ResponseEntity<?> createPatient(@RequestBody PatientRequest patientRequest){
        PatientResponse patientResponse = patientService.createPatient(patientRequest);
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(CommonResponse.builder()
                        .data(patientResponse)
                        .message("Successfully Created Patient")
                        .statusCode(HttpStatus.CREATED.value())
                        .build());
    }
    @GetMapping
    public ResponseEntity<?> getAllPatients(){
        List<PatientResponse> patientResponse = patientService.getAll();
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(CommonResponse.builder()
                        .data(patientResponse)
                        .message("Successfully retrieved all patients")
                        .statusCode(HttpStatus.CREATED.value())
                        .build());
    }
}
