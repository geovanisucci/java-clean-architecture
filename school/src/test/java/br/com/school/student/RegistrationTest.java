package br.com.school.student;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import student.Registration;

class RegistrationTest {

	@Test
	void shouldNotCreateRegistration() {
		assertThrows(IllegalArgumentException.class, 
				 () -> new Registration("5555"));
	}

}
