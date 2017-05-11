package ejercicio1;

public class Punto implements Comparable<Punto> {
	
	private int x;
	private int y;
	
	public int getX() {
		return x;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public int getY() {
		return this.y;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public Punto(int x,int y){
		this.x = x;
		this.y = y;
	}
	
	@Override
    public int compareTo(Punto p) {
        if (x < p.x) {
            return -1;
        }
        if (x > p.x) {
            return 1;
        }
        return 0;
    }
}
