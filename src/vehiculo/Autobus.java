package vehiculo;

public class Autobus extends Vehiculo{
	
	private int numero;
	private int numParadas;
	private static int contadorCantAutobus=0;
	
	public Autobus(String marcaVehiculo, String modeloVehiculo, String numeroBastidor, int numeroPuertas, int numParadas) {
		super(marcaVehiculo, modeloVehiculo, numeroBastidor, numeroPuertas);
		contadorCantAutobus++;
		this.numParadas=numParadas;
		numero=contadorCantAutobus;
	}

	public int getNumero() {
		return numero;
	}

	public int getNumParadas() {
		return numParadas;
	}

	public void setNumParadas(int numParadas) {
		this.numParadas = numParadas;
	}

	@Override
	public String toString() {
		return super.toString() + "\n-Número del autobús: " + numero + 
									"\n-Número de paradas: " + numParadas;
	}

}
