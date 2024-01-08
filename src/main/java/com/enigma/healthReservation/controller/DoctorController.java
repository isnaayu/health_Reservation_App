package com.enigma.healthReservation.controller;

import com.enigma.healthReservation.constant.AppPath;
import com.enigma.healthReservation.dto.request.DoctorRequest;
import com.enigma.healthReservation.dto.response.CommonResponse;
import com.enigma.healthReservation.dto.response.DoctorResponse;
import com.enigma.healthReservation.service.DoctorService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(AppPath.DOCTOR)
public class DoctorController {
    private final DoctorService doctorService;
    @PostMapping
    public ResponseEntity<?> createPatient(@RequestBody DoctorRequest doctorRequest){
        DoctorResponse doctorResponse = doctorService.createDoctor(doctorRequest);
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(CommonResponse.builder()
                        .data(doctorResponse)
                        .message("Successfully Created Doctor")
                        .statusCode(HttpStatus.CREATED.value())
                        .build());
    }
    @GetMapping
    public ResponseEntity<?> getAllPatients(){
        List<DoctorResponse> doctorResponses = doctorService.getAll();
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(CommonResponse.builder()
                        .data(doctorResponses)
                        .message("Successfully retrieved all Doctors")
                        .statusCode(HttpStatus.CREATED.value())
                        .build());
    }
}
