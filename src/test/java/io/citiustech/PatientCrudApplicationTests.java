package io.citiustech;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import io.citiustech.entity.Patient;
import io.citiustech.repository.PatientRepository;
import io.citiustech.service.PatientService;

@SpringBootTest
class PatientCrudApplicationTests {

	@Autowired
	private PatientService service;

	@MockBean
	private PatientRepository repository;

	@Test
	public void getAllPatientTest() {

		when(repository.findAll()).thenReturn(Stream.of(new Patient(1,"Ram","Jaiswal",54)).collect(Collectors.toList()));
		//assertEquals(1, service.getPatients().size());

	}

}
