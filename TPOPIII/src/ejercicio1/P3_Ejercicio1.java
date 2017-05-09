package ejercicio1;

import java.util.List;

public class P3_Ejercicio1 {
	
	public static SolucionEjercicio1 Ejercicio1(List<Punto> puntos) {
		
		// No hay 2 puntos para comparar.
		if (puntos.size() < 2) {
			
			// Supongo que con una distancia de 10000 es como infinito.
			Punto x = new Punto(0,0);
			Punto y = new Punto(10000,10000);
			
			return new SolucionEjercicio1(x,y,1);
		}
		
		puntos.sort((Punto p1, Punto p2)->p1.getX()-p2.getX());
		
		// Se devuelven los 2 puntos de la lista.
		if (puntos.size() == 2) return solucionTrivial(puntos);
		
		// Se aplica DyC.
		int  medio = puntos.size()/2;
		
		SolucionEjercicio1 SolucionIzquierdo	= Ejercicio1(puntos.subList(0, medio));
		SolucionEjercicio1 SolucionDerecho		= Ejercicio1(puntos.subList(medio + 1, puntos.size()));
		
		float distancia_izquierda	= getDistance(SolucionIzquierdo);
		float distancia_derecha		= getDistance(SolucionDerecho);
		
		return distancia_izquierda > distancia_derecha ? SolucionDerecho : SolucionIzquierdo;
	}
	
	private static SolucionEjercicio1 solucionTrivial(List<Punto> puntos){
		
		Punto punto_1 = new Punto(puntos.get(0).getX(), puntos.get(0).getY());
		Punto punto_2 = new Punto(puntos.get(1).getX(), puntos.get(1).getY());
		
		return new SolucionEjercicio1(punto_1, punto_2, 1);
	}
	
	// Calculo de la distancia entre dos puntos.
	private static float getDistance(SolucionEjercicio1 Solucion) {
		return (float) Math.sqrt(Math.pow(Solucion.getPunto_1().getX() - Solucion.getPunto_2().getX(), 2) + Math.pow(Solucion.getPunto_1().getY() - Solucion.getPunto_1().getY(), 2));
	}
}
