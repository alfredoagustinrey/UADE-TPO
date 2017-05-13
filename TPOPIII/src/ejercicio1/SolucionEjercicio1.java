package ejercicio1;

public class SolucionEjercicio1 {
	
	private Punto punto1;
	private Punto punto2;
	private int iteraciones;
	
	public SolucionEjercicio1(Punto punto1, Punto punto2, int iteraciones) {
		this.punto1 		= punto1;
		this.punto2 		= punto2;
		this.iteraciones 	= iteraciones;
	}

	public Punto getPunto1() {
		return this.punto1;
	}

	public Punto getPunto2() {
		return this.punto2;
	}

	public int getIteraciones() {
		return this.iteraciones;
	}
	
	public double getDistancia() {	
		
		double dx = Math.pow(this.punto1.getX() - this.punto2.getX(), 2);
		double dy = Math.pow(this.punto2.getY() - this.punto2.getY(), 2);

		return Math.sqrt(dx + dy);
	}
	
	public static double getDistancia(Punto punto1, Punto punto2) {
		
		double dx = Math.pow(punto1.getX() - punto2.getX(), 2);
		double dy = Math.pow(punto2.getY() - punto2.getY(), 2);

		return Math.sqrt(dx + dy);
	}
}


