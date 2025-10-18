package ar.edu.unq.po2.tp9.Observer;

import java.util.ArrayList;
import java.util.List; // Necesaria para verificar autores, palabras clave, etc.

@SuppressWarnings("unused")
public class Investigador implements Suscriptor{

	private List<CriterioSuscripcion> criteriosSuscripcion;
	@SuppressWarnings("unused")
	private String nombre;
	private ArticuloCientifico ultimoArticuloNotificado = null; // Guarda el último artículo de interés, para el Test
	
	public Investigador(String nombre, List<CriterioSuscripcion> criteriosSuscripcion) {
		this.nombre = nombre;
		this.criteriosSuscripcion = criteriosSuscripcion;
	}
	
	public boolean leInteresa(ArticuloCientifico nuevoArticulo) {
		if(criteriosSuscripcion.isEmpty()){
			return false;
		}
		for(CriterioSuscripcion criterio : criteriosSuscripcion) {
			if(criterio.cumple(nuevoArticulo)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public void actualizar(ArticuloCientifico nuevoArticulo) {
		if(this.leInteresa(nuevoArticulo)) {
			System.out.println("Notificacion de Articulo: " + nuevoArticulo.getTitulo());
		}
	}
	
	public ArticuloCientifico getUltimoArticuloNotificado() {
        return ultimoArticuloNotificado;
    }

    public void resetNotificacion() {
        this.ultimoArticuloNotificado = null;
    }
	
	
}
