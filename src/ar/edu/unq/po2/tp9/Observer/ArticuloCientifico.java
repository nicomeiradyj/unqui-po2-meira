package ar.edu.unq.po2.tp9.Observer;

import java.util.List;

public class ArticuloCientifico {
	String titulo;
	List<String> autores;
	List<String> filiaciones;
	String tipoArticulo;
	String lugarPublicacion;
	List<String> palabrasClaves;
	
	public ArticuloCientifico(String titulo, List<String> autores, List<String> filiaciones, String tipoArticulo, String lugarPublicacion, List<String> palabrasClaves) {
		this.titulo = titulo;
		this.autores = autores;
		this.filiaciones = filiaciones;
		this.tipoArticulo = tipoArticulo;
		this.lugarPublicacion = lugarPublicacion;
		this.palabrasClaves = palabrasClaves;
	}
	
	public String getTitulo() {
        return titulo;
    }

    public List<String> getAutores() {
        return autores;
    }

    public List<String> getFiliaciones() {
        return filiaciones;
    }

    public String getTipoArticulo() {
        return tipoArticulo;
    }

    public String getLugarPublicacion() {
        return lugarPublicacion;
    }

    public List<String> getPalabrasClaves() {
        return palabrasClaves;
    }
}
	

