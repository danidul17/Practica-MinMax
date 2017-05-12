package MinMax;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MinMaxCiclomatica {
	
	private MinMax mima;

	@Before  //se aplica antes de cada test (creacion minmax)
	public void setUp(){ 
		MinMax mima = new MinMax();	
	}
	@After //se aplica despues de cada test(eliminacion minmax)
	public void tearDown(){ 
		mima=null;
	}
	
	@Test
	public void camino1() {
		int Datos[]=null;
		assertEquals(null, mima.minMax(Datos));
	}
	@Test
	public void camino2() {
		//no se puede implementar
		//porque pasa por el primer if pero no termina el bucle
	}
	@Test
	public void camino3() {
		int Datos[]={1,2,3};
		assertEquals(1, mima.minMax(Datos)[0]);
		assertEquals(3, mima.minMax(Datos)[1]);
		
	}
	@Test
	public void camino4(){
		int Datos[]={3,2,1};
		assertEquals(1, mima.minMax(Datos)[0]);
		assertEquals(3, mima.minMax(Datos)[1]);
	}
	@Test
	public void camino5() {
	int Datos[]={1,1,1};
	assertEquals(1, mima.minMax(Datos)[0]);
	assertEquals(1, mima.minMax(Datos)[1]);
	
		
	}

}
