package io.citiustech.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.citiustech.entity.Patient;
import io.citiustech.repository.PatientRepository;

@Service
public class PatientService {
	
	@Autowired
	private PatientRepository patientRepository;

	public Patient save(Patient patient) {
		return patientRepository.save(patient);
	}

	public List<Patient> getPatients() {
		return patientRepository.findAll();
	}
	
	public Patient getPatient(int id) {
		return patientRepository.findById(id).orElse(null);
	}

}
