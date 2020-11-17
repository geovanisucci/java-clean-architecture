package school;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import br.com.school.Registration;

class RegistrationTest {

	@Test
	void shouldNotCreateRegistration() {
		assertThrows(IllegalArgumentException.class, 
				 () -> new Registration("5555"));
	}

}
