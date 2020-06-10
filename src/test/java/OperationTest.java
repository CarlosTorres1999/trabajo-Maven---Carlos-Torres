import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class OperationTest {
	ArrayList<Integer> listaNum = new ArrayList<>();
	@BeforeEach
	void setUp() {
		listaNum.add(1);
		listaNum.add(10);
		listaNum.add(4);
		listaNum.add(0);
		listaNum.add(3);
	}
	@Test
	void factorialTest1() {
		assertEquals(1, Operation.factorial(0));
		
	}
	@Test 
	void factorialTest2() {
		assertEquals(24, Operation.factorial(4));
	}
	@Test 
	void sumFibonacciTest() {
		assertEquals(10, Operation.sumatoria(4));
		assertEquals(1,Operation.sumatoria(1) );
	}
	@Test
	void soloParesTest() {
		assertEquals(3, Operation.soloPares(listaNum).size());
		assertEquals(10, Operation.soloPares(listaNum).get(0));
	}
	@Test
	void verificarImaridadTest() {
		assertEquals("Existe Impares", Operation.verificarImparidad(listaNum));
	}
	
	@Test
	void dividirTest1() {
		Assertions.assertThrows(IllegalArgumentException.class, ()-> {
			Operation.dividir(3, 0);
		});
	}
	@Test
	void dividirTest2() {
		assertEquals(2, Operation.dividir(5, 2));
	}
	

}
