package io.citiustech.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.citiustech.entity.Patient;
import io.citiustech.service.PatientService;

@RestController
@RequestMapping(path = "/patient")
public class PatientController {
	
	@Autowired
	private PatientService patientService;
	
	@PostMapping(path = "/savePatient")
	public Patient savePatient(@RequestBody Patient patient) {
		return patientService.save(patient);
	}
	
	@GetMapping(path = "/getPatients")
	public List<Patient> getPatients() {
		return patientService.getPatients();
	}
	
	@GetMapping(path = "/getPatient/{id}")
	public Patient getPatient(@PathVariable int id) {
		return patientService.getPatient(id);
	}
	
	

}
