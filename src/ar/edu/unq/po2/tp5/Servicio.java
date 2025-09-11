package ar.edu.unq.po2.tp5;

public class Servicio {
	double costoPorUnidadConsumida;
	int cantidadDeUnidadesConsumidas;
	
	public Servicio(double costoPorUnidadConsumida, int cantidadDeUnidadesConsumidas) {
		this.costoPorUnidadConsumida = costoPorUnidadConsumida;
		this.cantidadDeUnidadesConsumidas = cantidadDeUnidadesConsumidas;
	}
	
	public double getPrecioTotalServicio() {
		return costoPorUnidadConsumida * cantidadDeUnidadesConsumidas;
	}
}
