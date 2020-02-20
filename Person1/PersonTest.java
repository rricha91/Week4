import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PersonTest {

	private Person p1;
	
	@BeforeEach
	void setUp() throws Exception {
		p1 = new Person();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() {
		p1.HaveBirthday();
		
		/*
		 * Passing units through it and checks if the two are equal.
		 * If not equal, code broke.
		 */
		assertEquals(2,p1.getAge());
	}

}
