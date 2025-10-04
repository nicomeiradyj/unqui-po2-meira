package ar.edu.unq.po2.tp7;

import java.util.ArrayList;
import java.util.List;

public class Mapa {
	private Celda [] [] celdas;
	
	public Mapa(int ancho, int largo) {
		celdas = new Celda[ancho] [largo];
		for(int x = 0; x < ancho; x++) {
			for(int y=0; y< largo; y++) {
				celdas[x] [y] = new Celda(x,y);
			}
		}
	}
	
	public Celda getCelda(int x, int y) {
		return celdas[x] [y];
	}
	
	public List<Celda> caminoMasCorto(Celda origen, Celda destino) {
        List<Celda> camino = new ArrayList<>();
        int x = origen.getX();
        int y = origen.getY();

        while (x != destino.getX()) {
            x += (destino.getX() > x) ? 1 : -1;
            camino.add(getCelda(x, y));
        }
        while (y != destino.getY()) {
            y += (destino.getY() > y) ? 1 : -1;
            camino.add(getCelda(x, y));
        }

        return camino;
    }

    public List<Celda> zigzag(Celda origen, Celda destino) {
        List<Celda> camino = new ArrayList<>();
        int x = origen.getX();
        int y = origen.getY();

        boolean moverX = true;
        while (x != destino.getX() || y != destino.getY()) {
            if (moverX && x != destino.getX()) {
                x += (destino.getX() > x) ? 1 : -1;
            } else if (!moverX && y != destino.getY()) {
                y += (destino.getY() > y) ? 1 : -1;
            }
            camino.add(getCelda(x, y));
            moverX = !moverX;
        }

        return camino;
    }
}
