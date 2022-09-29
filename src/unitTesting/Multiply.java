package unitTesting;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

class Multiply {

	@Test
	void test() {
		Calculator c = new Calculator();
		double output = c.multiply(5, 5);
		assertEquals(25,output);

	}

}
