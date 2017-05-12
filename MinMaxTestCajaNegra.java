package MinMax;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class MinMaxTestCajaNegra {
	
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
		public void DatosNulos() {
			int[] Datos=null;
			assertEquals(null,mima.minMax(Datos));
	}
		@Test
		public void DatosPositivos() {
			int Datos[]={1,2,3,4};
			assertEquals(1,mima.minMax(Datos)[0]);
			assertEquals(4, mima.minMax(Datos)[1]);
	}
		
		@Test
		public void DatosNegativos() {
			int Datos[]= {-1,-2,-3,-4};
			assertEquals(-4, mima.minMax(Datos)[0]);
			assertEquals(-1, mima.minMax(Datos)[1]);
			
		}
		@Test
		public void DatosConCeros() {
			int Datos[]={0,0};
			assertEquals(0, mima.minMax(Datos)[0]);
			assertEquals(0, mima.minMax(Datos)[1]);
			
		}
		@Test
		public void DatosConOpuestos() {
			int Datos[]={1,-1};
			assertEquals(-1,mima.minMax(Datos)[0]);
			assertEquals(1,mima.minMax(Datos)[1]);
			
			
		}
		@Test
		public void DatosConNumerosIguales() {
			int Datos[]={3,3};
			assertEquals(3, mima.minMax(Datos)[0]);
			assertEquals(3, mima.minMax(Datos)[1]);
			
		}
		@Test
		public void DatosRepetidos() {
			int Datos[]={1,1,2,2,3,3};
			assertEquals(1,mima.minMax(Datos)[0]);
			assertEquals(3,mima.minMax(Datos)[1]);
			
		}
		@Test
		public void DatosConUnSoloNumero() {
			int Datos[]={2};
			assertEquals(2, mima.minMax(Datos)[0]);
			assertEquals(2, mima.minMax(Datos)[1]);
			
			
		}
		
	
		
}
