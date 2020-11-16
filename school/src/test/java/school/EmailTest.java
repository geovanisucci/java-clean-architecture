package school;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EmailTest {

	@Test
	void shouldNotCreateInvalidEmail() {
		
		assertThrows(IllegalArgumentException.class, 
				 () -> new Email(null));
		
		assertThrows(IllegalArgumentException.class, 
				 () -> new Email(""));
		
		assertThrows(IllegalArgumentException.class, 
				 () -> new Email("invalid!"));
	}

}
