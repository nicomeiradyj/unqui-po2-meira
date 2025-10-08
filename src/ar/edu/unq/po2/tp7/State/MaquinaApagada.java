package ar.edu.unq.po2.tp7.State;

public class MaquinaApagada implements EstadoMaquina {

	@Override
	public void insertarFicha(MaquinaDeJuegos maquina) {
		System.out.println("La máquina está apagada. Encenderla primero");
	}

	@Override
	public void presionarInicio(MaquinaDeJuegos maquina) {
		System.out.println("La máquina está apagada. Encenderla primero.");
	}

	@Override
	public void encender(MaquinaDeJuegos maquina) {
		System.out.println("Encendiendo maquina. Insertar fichas");
		maquina.setEstado(new MaquinaEsperandoFichas());
	}

	@Override
	public void terminarJuego(MaquinaDeJuegos maquina) {
		System.out.println("La máquina está apagada.");
	}

}
