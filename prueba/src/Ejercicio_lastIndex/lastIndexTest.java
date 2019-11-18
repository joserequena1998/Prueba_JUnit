package Ejercicio_lastIndex;

import static org.junit.Assert.*;

import org.junit.Test;

public class lastIndexTest {

	@Test
	public void TestFindlastIndex(){
		int x[] = {3,2,1,4,5,6,8};
		int y = 1;
		assertEquals("Posicion del numero introducido", 2, lastIndex.findLast(x, y));
	}
}
// Si lo que se busca es el primer elemento del array, el programa no funciona.
// El cambio seria poner i >= 0.