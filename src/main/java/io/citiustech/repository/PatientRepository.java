package io.citiustech.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.citiustech.entity.Patient;

public interface PatientRepository extends JpaRepository<Patient, Integer> {

}
