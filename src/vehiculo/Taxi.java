package vehiculo;

public class Taxi extends Turismo implements Calculable, Iniciable{

	private final double IMPORTE_INICIO=2;
	private double kmRecorridos;
	private double importeKm;
	
	public Taxi(String marcaVehiculo, String modeloVehiculo, String numeroBastidor, int numeroPuertas, Asientos tipoAsientos, double kmRecorridos, double importeKm) {
		super(marcaVehiculo, modeloVehiculo, numeroBastidor, numeroPuertas, tipoAsientos);
		this.kmRecorridos=kmRecorridos;
		this.importeKm=importeKm;
	}
	
	public double getKmRecorridos() {
		return kmRecorridos;
	}
	
	public void setKmRecorridos(double kmRecorridos) {
		this.kmRecorridos=kmRecorridos;
	}
	
	public double getImporteKm() {
		return kmRecorridos;
	}
	
	public void setImporteKm(double importeKm) {
		this.importeKm=importeKm;
	}

	@Override
	public void reiniciarContador(double kilometros) {
		kmRecorridos=kilometros;
		System.out.println("--Se procede a reiniciar kilometraje del taxi con un total de " + kmRecorridos);
	}

	@Override
	public double calcularCosteTrayecto() {
		return (IMPORTE_INICIO+(kmRecorridos*importeKm));
	}

	@Override
	public double calcularPrecioAlquiler(int numDias) {
		return numDias*50;
	}

	@Override
	public int getMaxVelocidad() {
		return 200;
	}

	@Override
	public String toString() {
		return super.toString() + "\n-Importe inicio: " + IMPORTE_INICIO + 
									"\n-KM Recorridos: " + kmRecorridos + 
									"\n-Importe Km: " + importeKm +
									"\n-Coste del trayecto: " + calcularCosteTrayecto();
	}
	
	
	
}
