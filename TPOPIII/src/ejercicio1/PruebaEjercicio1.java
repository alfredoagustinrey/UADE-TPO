package ejercicio1;

import java.util.ArrayList;
import java.util.List;

import junit.framework.TestCase;


public class PruebaEjercicio1 extends TestCase {
	public void testEjercicio1(){
		
		List<Punto>  puntos = new ArrayList<>();
		
		//creo 32 puntos aleatorios
		for (int i = 0; i < 32; i++) {
			Punto p = new Punto((int)Math.random(), (int)Math.random());
			puntos.add(p);
		}
		
		SolucionEjercicio1 solucionEj1 = new SolucionEjercicio1();
		//se debe setear la cantidad de instrucciones correctas.
		solucionEj1.cantidadInstrucciones = 0;
		//se debe setear los puntos correctos que se obtienen resolviendo el ejercicio.
		solucionEj1.punto1 = null;
		solucionEj1.punto2 = null;
		
		assertEquals(P3_Ejercicio1.Ejercicio1(puntos), solucionEj1);
	}
}
