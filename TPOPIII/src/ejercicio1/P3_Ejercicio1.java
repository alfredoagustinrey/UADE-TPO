package ejercicio1;

import java.util.List;
import java.util.Collections;

public class P3_Ejercicio1 {
	
	public static SolucionEjercicio1 Ejercicio1(List<Punto> puntos) {
		
		// No hay 2 puntos para comparar.
		if (puntos.size() < 2) {
			
			// Supongo que con una distancia de los puntos
			// (0,0) y (100000, 100000) es como si fuera "infinito".
			Punto x = new Punto(0,0);
			Punto y = new Punto(100000,100000);
			
			return new SolucionEjercicio1(x,y,1);
		}
		
		// Ordenamos la lista por los puntos de coordenada x.
		Collections.sort(puntos);
		
		// Se devuelven los 2 puntos de la lista.
		if (puntos.size() == 2) return solucionTrivial(puntos);
		
		// Se aplica DyC.
		int medio = puntos.size() / 2;
		
		List<Punto> lista_izquierda = puntos.subList(0, medio);
		List<Punto> lista_derecha	= puntos.subList(medio + 1, puntos.size());
		
		SolucionEjercicio1 solucion_izquierdo 	= Ejercicio1(lista_izquierda);
		SolucionEjercicio1 solucion_derecho		= Ejercicio1(lista_derecha);
		
		double distancia_izquierda	= solucion_izquierdo.getDistancia();
		double distancia_derecha	= solucion_derecho.getDistancia();
		
		double menor_distancia = (distancia_izquierda > distancia_derecha) ? distancia_derecha : distancia_izquierda;
		
		SolucionEjercicio1 solucion_central = MenorDistanciaEnPuntosCentrales(lista_izquierda, lista_derecha, ((double) medio) + menor_distancia));
		
		return (menor_distancia;
	}
	
	private static SolucionEjercicio1 solucionTrivial(List<Punto> puntos){
		
		Punto punto1 = new Punto(puntos.get(0).getX(), puntos.get(0).getY());
		Punto punto2 = new Punto(puntos.get(1).getX(), puntos.get(1).getY());
		
		return new SolucionEjercicio1(punto1, punto2, 1);
	}
	
	private static SolucionEjercicio1 MenorDistanciaEnPuntosCentrales(List<Punto> izquierdos, List<Punto> derechos , double rango) {
		
		// Genero un valor alto para que pueda ser reemplazado por alguno minimo,
		// en el caso que no cambie saldra con "infinito" y no se tomara en cuenta por
		// la comparación en la salida.
		
		Punto x = new Punto(0,0);
		Punto y = new Punto(100000,100000);
		
		SalucionEjercicio1 solucion_minima = new SolucionEjercicio1(x,y,1);
		
		
		
		
		return null;
	}
}
