package ejercicio1;

import java.util.ArrayList;
import java.util.List;
import junit.framework.TestCase;

public class PruebaEjercicio1 extends TestCase {
	
	public void testEjercicio1(){
			
		List<Punto> puntos = new ArrayList<Punto>();
		
		for (int i = 0; i <= 31; i++) puntos.add(new Punto(i*i,i*i));
		
		SolucionEjercicio1 solucionEj1 = P3_Ejercicio1.Ejercicio1(puntos);
		
		assertEquals(solucionEj1.getPunto1().getX(), 0);
		assertEquals(solucionEj1.getPunto1().getY(), 0);
		assertEquals(solucionEj1.getPunto2().getX(), 1);
		assertEquals(solucionEj1.getPunto2().getY(), 1);
	}
}
