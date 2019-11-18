package Ejercicio_CountPositive;

import static org.junit.Assert.*;

import org.junit.Test;

public class countPositiveTest {

	@Test
	public void ZeroElement(){
		int x[] = {1,9,8,6,4,-9,-3,-2,0};
		assertEquals("Numero de enteros positivos", 6, countPositive.countPositive(x));
	}

}
// Si tenemos en cuenta el 0 como positivo, estaría bien, pero como no es eso lo que se quiere, habría un fallo
// el cuál puede ser arreglado poniendo en el código ==> if(x[i]) >0)