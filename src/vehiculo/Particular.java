package vehiculo;

public class Particular extends Turismo implements Iniciable{
	
	private String propietario;
	private boolean conAireAcondicionado;

	public Particular(String marcaVehiculo, String modeloVehiculo, String numeroBastidor, int numeroPuertas, Asientos tipoAsientos, String propietario, boolean conAireAcondicionado) {
		super(marcaVehiculo, modeloVehiculo, numeroBastidor, numeroPuertas, tipoAsientos);
		this.propietario=propietario;
		this.conAireAcondicionado=conAireAcondicionado;
	}
	
	public String getPropietario() {
		return propietario;
	}
	
	public void setPropietario(String propietario) {
		this.propietario=propietario;
	}
	
	public boolean getConAireAcondicionado() {
		return conAireAcondicionado;
	}
	
	public void setConAireAcondicionado(boolean conAireAcondicionado) {
		this.conAireAcondicionado=conAireAcondicionado;
	}

	@Override
	public void reiniciarContador(double kilometros) {
		System.out.println("--Se procede a reiniciar kilometraje del particular con un total de " + kilometros);
	}

	@Override
	public double calcularPrecioAlquiler(int numDias) {
		return numDias*30;
	}

	@Override
	public int getMaxVelocidad() {
		return 220;
	}

	@Override
	public String toString() {
		return super.toString() + "\n-Propietario: " + propietario +
									"\n-Aire Acondicionado: " + conAireAcondicionado;
	}
}
