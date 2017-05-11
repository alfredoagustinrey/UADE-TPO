package ejercicio1;

import java.util.ArrayList;
import java.util.List;
import junit.framework.TestCase;

public class PruebaEjercicio1 extends TestCase {
	
	public void testEjercicio1(){
			
		List<Punto> puntos = new ArrayList<Punto>();
		
		puntos.add(new Punto(1,1));
		puntos.add(new Punto(2,2));
		
		for (int i = 3; i <= 32; i++) puntos.add(new Punto(i*i,i*i));
		
		SolucionEjercicio1 solucionEj1 = P3_Ejercicio1.Ejercicio1(puntos);
		
		assertEquals(solucionEj1.getPunto1().getX(), 1);
		assertEquals(solucionEj1.getPunto1().getY(), 1);
		assertEquals(solucionEj1.getPunto2().getX(), 1);
		assertEquals(solucionEj1.getPunto2().getY(), 1);
	}
}
