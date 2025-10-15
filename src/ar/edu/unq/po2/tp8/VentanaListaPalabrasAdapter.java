package ar.edu.unq.po2.tp8;

import ar.edu.unq.po2.tp8.Ventana;
import ar.edu.unq.po2.tp8.ListaDePalabrasOrdenadas;
import javax.swing.DefaultListModel;

@SuppressWarnings({ "serial", "unused" })
public class VentanaListaPalabrasAdapter extends DefaultListModel<String>{
	private ListaDePalabrasOrdenadas adaptee;
	
	public VentanaListaPalabrasAdapter(ListaDePalabrasOrdenadas lista) {
		this.adaptee = lista;
	}
	
	public void addElement(String palabra) {
		adaptee.agregarPalabra(palabra);
		this.clear();
		for(int i = 0; i < adaptee.cantidadDePalabras(); i++) {
			super.addElement(adaptee.getPalabraDePosicion(i));
		}
	}
	
	
}
