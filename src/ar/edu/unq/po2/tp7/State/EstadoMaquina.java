package ar.edu.unq.po2.tp7.State;

public interface EstadoMaquina {
	void insertarFicha(MaquinaDeJuegos maquina);
	void presionarInicio(MaquinaDeJuegos maquina);
	void encender(MaquinaDeJuegos maquina);
	void terminarJuego(MaquinaDeJuegos maquina);
}
