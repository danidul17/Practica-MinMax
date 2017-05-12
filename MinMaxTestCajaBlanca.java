package MinMax;

import static org.junit.Assert.*;
import org.junit.Test;


public class MinMaxTestCajaBlanca {

	
	
	
	
	@Test
	public void statementCoverage(){
		MinMax mima= new MinMax();
		int Datos[]={6,1,8,9,3,2};
		assertEquals(1, mima.minMax(Datos)[0]);
		assertEquals(9, mima.minMax(Datos)[1]);
				
	}
	@Test
	public void decisionCoverage() {
		MinMax mima= new MinMax();
		int Datos[]={6,1,8,2};
		assertEquals(1, mima.minMax(Datos)[0]);
		assertEquals(8, mima.minMax(Datos)[1]);
		
		int Datos2[]=null;
		assertEquals(null, mima.minMax(Datos2));	
	
	}
	@Test
	public void conditionCoverage() {
		MinMax mima= new MinMax();
		int Datos[]={2,3,5,1};
		assertEquals(1, mima.minMax(Datos)[0]);
		assertEquals(5, mima.minMax(Datos)[1]);
		
		int Datos1[]={};
		assertEquals(null, mima.minMax(Datos1));
		
		int Datos2[]=null;
		assertEquals(null, mima.minMax(Datos2));
		
	}
	@Test
	public void decisionConditionCoverage(){
		MinMax mima= new MinMax();
		int Datos[]={4,3,1,2};
		assertEquals(1,mima.minMax(Datos)[0]);
		assertEquals(4, mima.minMax(Datos)[1]);
		
		int Datos1[]=null;
		assertEquals(null, mima.minMax(Datos1));
		
		int Datos2[]={};
		assertEquals(null, mima.minMax(Datos2));
		
		int Datos3[]={1,5};
		assertEquals(1, mima.minMax(Datos3)[0]);
		assertEquals(5, mima.minMax(Datos3)[1]);
		
	}
	
	
	
}
