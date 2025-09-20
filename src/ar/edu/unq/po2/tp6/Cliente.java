package ar.edu.unq.po2.tp6;

public class Cliente {
	String nombre;
	String apellido;
	int edad;
	double sueldoMensual;
	double monto;
	
	public Cliente(String nombre, String apellido, int edad, double sueldoMensual, double monto) {
		this.nombre = nombre;
		this.edad = edad;
		this.apellido = apellido;
		this.sueldoMensual = sueldoMensual;
		this.monto = monto;
	}
	
	public double getMonto() {
		return this.monto;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public String getApellido() {
		return this.apellido;
	}
	
	public int getEdad() {
		return this.edad;
	}
	
	public double getSueldoMensual() {
		return this.sueldoMensual;
	}
	
	public SolicitudDeCredito crearSolicitudPersonal(double monto, int plazoEnMeses) {
		return new SolicitudDeCreditoPersonal(this, monto, plazoEnMeses);
	}
	
	public SolicitudDeCredito crearSolicitudHipotecaria(double monto, int plazoEnMeses, PropiedadInmobiliaria propiedad) {
		return new SolicitudDeCreditoHipotecario(this, monto, plazoEnMeses, propiedad);
	}
	
	public double ingresosAnuales() {
		return sueldoMensual * 12;
	}

	public void ingresarDinero(double montoSolicitado) {
		this.monto = monto + montoSolicitado;
	}

}
