package vehiculo;

public abstract class Vehiculo {
	
	private String marcaVehiculo;
	private String modeloVehiculo;
	private String numeroBastidor;
	private int numeroPuertas;
	private static int contCantVehFuncionando=0;
	
	public Vehiculo(String marcaVehiculo, String modeloVehiculo, String numeroBastidor, int numeroPuertas) {
		contCantVehFuncionando++;
		this.marcaVehiculo = marcaVehiculo;
		this.modeloVehiculo = modeloVehiculo;
		this.numeroBastidor = numeroBastidor;
		this.numeroPuertas = numeroPuertas;
	}
	
	public String getMarcaVehiculo() {
		return marcaVehiculo;
	}
	public void setMarcaVehiculo(String marcaVehiculo) {
		this.marcaVehiculo = marcaVehiculo;
	}
	public String getModeloVehiculo() {
		return modeloVehiculo;
	}
	public void setModeloVehiculo(String modeloVehiculo) {
		this.modeloVehiculo = modeloVehiculo;
	}
	public String getNumeroBastidor() {
		return numeroBastidor;
	}
	public void setNumeroBastidor(String numeroBastidor) {
		this.numeroBastidor = numeroBastidor;
	}
	public int getNumeroPuertas() {
		return numeroPuertas;
	}
	public void setNumeroPuertas(int numeroPuertas) {
		this.numeroPuertas = numeroPuertas;
	}
	
	public static int getContCantVehFuncionando() {
		return contCantVehFuncionando;
	}

	@Override
	public String toString() {
		return "-Marca: " + marcaVehiculo + 
				"\n-Modelo: " + modeloVehiculo + 
				"\n-Número de Bastidor: " + numeroBastidor +
				"\n-Número de puertas: " + numeroPuertas;
	}

}

