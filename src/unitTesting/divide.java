package unitTesting;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

class divide {

	@Test
	void test() {
		Calculator c = new Calculator();
		double output = c.division(5, 5);
		assertEquals(1,output);

	}

}
