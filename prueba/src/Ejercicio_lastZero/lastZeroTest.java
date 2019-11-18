package Ejercicio_lastZero;

import static org.junit.Assert.*;

import org.junit.Test;

public class lastZeroTest {

	@Test
	public void TestFindlastZero(){
		int x[] = {1,5,2,0,3,4,0};
		assertEquals("Posicion del ultimo cero", 6, lastZero.lastZero(x));
	}
}
//Aquí se puede ver como coge que la posicion del ultimo 0 es la 6, pero nos dice que es la posicion 3, por lo que hay
// un fallo.
// Para corregir el fallo se delararía una variable de tipo int, quedando así despues del if
// variable = i y que retornara el valor de la variable.