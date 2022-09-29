package unitTesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class addition {

	@Test
	void test() {

		Calculator c = new Calculator();
		double output = c.addition(5, 5);
		assertEquals(10,output);

	}

}
