import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CadenaOperationTest {

	@Test
	void concatDosCadenasTest1() {
		Assertions.assertThrows(NullPointerException.class, () -> {
			CadenaOperation.concatDosCadena(null, "String");
		});
	}
	@Test
	void concatDosCadenasTest2() {
		assertEquals("Carlos", CadenaOperation.concatDosCadena("Car", "los"));
	}
	
	@Test 
	void concatMultipleTest() {
		assertEquals("abcdefgh", CadenaOperation.<String>concatMultiple("ab","cd","e","fgh"));
	}

}
