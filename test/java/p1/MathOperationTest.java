package p1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MathOperationTest {

	@Test
	void testDoAdd() {
		MathOperation obj = new MathOperation();
		int actual = obj.doAdd(10, 20);
		
		assertEquals(30, actual);
	}
	
	

}
