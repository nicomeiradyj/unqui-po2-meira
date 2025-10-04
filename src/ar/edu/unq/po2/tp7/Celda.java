package ar.edu.unq.po2.tp7;

public class Celda {
	private int x;
	private int y;
	private boolean tieneLaja;
	
	public Celda(int x, int y) {
		this.x = x;
		this.y = y;
		this.tieneLaja = false;
	}
	
	public boolean getTieneLaja() {
		return tieneLaja;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public void colocarLaja() {
		tieneLaja = true;
	}
}
