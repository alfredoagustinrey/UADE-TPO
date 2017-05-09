package ejercicio1;

import java.util.List;

public class P3_Ejercicio1 { 
	
	public static SolucionEjercicio1 Ejercicio1(List<Punto> puntos){
		SolucionEjercicio1 result = new SolucionEjercicio1();
		
		//no hay 2 puntos para comparar
		if (puntos.size() < 2)
			return null;
		//Se devuelven los 2 puntos de la lista.
		if (puntos.size() == 2){
			return solucionTrivial(puntos);
		}
		
		//Se aplica DyC
		int  medio = puntos.size()/2;
		SolucionEjercicio1 p1= Ejercicio1(puntos.subList(0, medio));
		SolucionEjercicio1 p2= Ejercicio1(puntos.subList(medio + 1, puntos.size()));
			
		//Este for no se si va el profesor lo puso en el ejemplo. 
		for (int i = 0; i < puntos.size(); i++) {
			//Asi cuentan cantidad de instrucciones
			result.cantidadInstrucciones++;
		}
		
		return result;
	}
	
	private static SolucionEjercicio1 solucionTrivial(List<Punto> puntos){
		SolucionEjercicio1 s=new SolucionEjercicio1();
		s.cantidadInstrucciones = 1;
		s.punto1=puntos.get(0);
		s.punto2=puntos.get(1);
		return  s;
	}
}
