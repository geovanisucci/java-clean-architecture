package school;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RegistrationTest {

	@Test
	void shouldNotCreateRegistration() {
		assertThrows(IllegalArgumentException.class, 
				 () -> new Registration("5555"));
	}

}
