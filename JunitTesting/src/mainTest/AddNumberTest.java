package mainTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AddNumberTest {

	@Test
	void test() {
		//fail("Not yet implemented");
		int a = 2;
		int b = 2;
		TestClass t = new TestClass();
		int r = t.addNumber(a, b);
		assertEquals(4, r);
	}

}
