package ejercicio1;

public class SolucionEjercicio1 {
	private Punto punto_1;
	private Punto punto_2;
	private int iteraciones;
	
	public SolucionEjercicio1(Punto punto_1, Punto punto_2, int iteraciones) {
		this.punto_1 = punto_1;
		this.punto_2 = punto_2;
		this.iteraciones = iteraciones;
	}

	public Punto getPunto_1() {
		return this.punto_1;
	}

	public Punto getPunto_2() {
		return this.punto_2;
	}

	public int getIteraciones() {
		return this.iteraciones;
	}
}


