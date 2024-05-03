package vehiculo;

public abstract class Turismo extends Vehiculo {
	
	Asientos tiposAsientos;
	
	public Turismo(String marcaVehiculo, String modeloVehiculo, String numeroBastidor, int numeroPuertas, Asientos tipoAsientos) {
		super(marcaVehiculo, modeloVehiculo, numeroBastidor, numeroPuertas);
		this.tiposAsientos=tipoAsientos;
	}
	
	public Asientos getTiposAsientos() {
		return tiposAsientos;
	}
	
	public abstract double calcularPrecioAlquiler(int numDias);
	
	public abstract int getMaxVelocidad();

	@Override
	public String toString() {
		return super.toString() + "\n-Tipos de asientos: " + tiposAsientos;
	}
}
