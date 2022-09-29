package unitTesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class subtraction {

	@Test
	void test() {
		Calculator c = new Calculator();
		double output = c.subtraction(5, 5);
		assertEquals(0.0,output);

	}

}
