package ejercicio1;

import java.util.List;
import java.util.Collections;

public class P3_Ejercicio1 {
	
	public static SolucionEjercicio1 Ejercicio1(List<Punto> puntos) {
		
		SolucionEjercicio1 solucion = null;
		
		// No hay 2 puntos para comparar.
		if (puntos.size() < 2) return getPuntoInfinito();
		
		// Ordenamos la lista por los puntos de coordenada x.
		Collections.sort(puntos);
		
		// Se devuelven los 2 puntos de la lista.
		if (puntos.size() == 2) return solucionTrivial(puntos);
		
		// Se aplica Divide y Conquista.
		int medio = puntos.size() / 2;
		
		List<Punto> lista_izquierda = puntos.subList(0, medio);
		List<Punto> lista_derecha	= puntos.subList(medio + 1, puntos.size());
		
		SolucionEjercicio1 solucion_izquierda 	= Ejercicio1(lista_izquierda);
		SolucionEjercicio1 solucion_derecha		= Ejercicio1(lista_derecha);
		
		double distancia_izquierda	= solucion_izquierda.getDistancia();
		double distancia_derecha	= solucion_derecha.getDistancia();
		
		// Menor distancia entre los puntos de cada lado.
		double menor_distancia_parte = (distancia_izquierda > distancia_derecha) ? distancia_derecha : distancia_izquierda;
		
		SolucionEjercicio1 solucion_central = MenorDistanciaEnPuntosCentrales(lista_izquierda, lista_derecha, ((double) medio) + menor_distancia_parte);
		double distancia_central = solucion_central.getDistancia();
		
		// Solo falta ver cual de las 3 soluciones es la menor.
		// Izquierda
		// Derecha o
		// Central
		
		// Centro es el menor de las dos partes, no tengo que seguir preguntando.
		
		if (distancia_central < menor_distancia_parte) solucion = solucion_central;
		else solucion = (distancia_izquierda < distancia_derecha) ? solucion_izquierda : solucion_derecha;
		
		return solucion;
	}
	
	private static SolucionEjercicio1 solucionTrivial(List<Punto> puntos) {
		
		Punto punto1 = new Punto(puntos.get(0).getX(), puntos.get(0).getY());
		Punto punto2 = new Punto(puntos.get(1).getX(), puntos.get(1).getY());
		
		return new SolucionEjercicio1(punto1, punto2, 1);
	}
	
	private static SolucionEjercicio1 MenorDistanciaEnPuntosCentrales(List<Punto> izquierdos, List<Punto> derechos , double rango) {
		// Genero un valor alto para que pueda ser reemplazado por alguno minimo,
		// en el caso que no cambie saldra con "infinito" y no se tomara en cuenta por
		// la comparación en la salida.
		
		SolucionEjercicio1 menor_distancia_central = getPuntoInfinito();
		
		for (Punto izquierdo : izquierdos) {
			for (Punto derecho : derechos) {
				if (SolucionEjercicio1.getDistancia(izquierdo, derecho) < menor_distancia_central.getDistancia()) {
					menor_distancia_central = new SolucionEjercicio1(izquierdo, derecho, 1);
				}
			}
		}
		
		return menor_distancia_central;
	}
	
	private static SolucionEjercicio1 getPuntoInfinito() {
		// Supongo que con una distancia de los puntos
		// (0,0) y (100000, 100000) es como si fuera "infinito".
		Punto x = new Punto(0,0);
		Punto y = new Punto(100000,100000);
		
		return new SolucionEjercicio1(x,y,1);
	}
}
