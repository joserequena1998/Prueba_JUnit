package Ejercicio_CountoddOrPos;

import static org.junit.Assert.*;

import org.junit.Test;

public class CountoddOrPosTest {

	@Test
	public void TestCount() {
		int x[] = {1,-9,2,3,4,-7,8,9,-1,0};
		assertEquals("Numero de numeros impares o positivos", 6, CountoddOrPos.oddOrPos(x));
	}
	
	@Test
	public void TestCount2() {
		int x[] = {1,-9,0};
		assertEquals("Numero de numeros impares o positivos", 1, CountoddOrPos.oddOrPos(x));
	}
}
//Este programa no tiene ningún fallo.

