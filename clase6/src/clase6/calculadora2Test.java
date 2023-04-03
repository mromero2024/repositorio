package clase6;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class calculadora2Test {

	@Test
	void testMultiplicacion() {
		calculadora2 calc = new calculadora2(80,3);
		double resultado = calc.multiplicacion();
		assertEquals(resultado, 240);
		
	}

}
