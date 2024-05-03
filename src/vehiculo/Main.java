package vehiculo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Taxi taxi1=new Taxi("Ford", "Mustang", "1FA6P5NH1K5100689", 4, Asientos.RECLINABLES, 25.5, 10);
		Taxi taxi2=new Taxi("Ford", "Mustang", "1BBBP8TH1K5112345", 5, Asientos.CUERO, 10000.56, 25.5);
		Particular particular1=new Particular("Volkswagen", "Golf", "JM1BJ0RP5HM381104", 5, Asientos.CUERO, "Juan Pérez", true);
		Particular particular2=new Particular("Chevrolet", "Corvette", "WBA3B9C57DF58911", 5, Asientos.CALEFACCIÓN, "Marcos Fernández", false);
		Autobus autobus1=new Autobus("Volvo", "9700", "2JKTP8TS105112366", 3, 30);
		
		System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+ DATOS DEL PRIMER TAXI +-+-+-+-+-+-+-+-+-+-+-+-+-+-");
		System.out.println(taxi1.toString());
		
		System.out.println("\n-+-+-+-+-+-+-+-+-+-+-+-+-+-+ DATOS DEL SEGUNDO TAXI +-+-+-+-+-+-+-+-+-+-+-+-+-+-");
		System.out.println(taxi2.toString());
		
		System.out.println("\n-+-+-+-+-+-+-+-+-+-+-+-+-+-+ DATOS DEL PRIMER PARTICULAR +-+-+-+-+-+-+-+-+-+-+-+-+-+-");
		System.out.println(particular1.toString());
		
		System.out.println("\n-+-+-+-+-+-+-+-+-+-+-+-+-+-+ DATOS DEL SEGUNDO PARTICULAR +-+-+-+-+-+-+-+-+-+-+-+-+-+-");
		System.out.println(particular2.toString());
		
		System.out.println("\n-+-+-+-+-+-+-+-+-+-+-+-+-+-+ DATOS DEL AUTOBUS +-+-+-+-+-+-+-+-+-+-+-+-+-+-");
		System.out.println(autobus1.toString());
		
		System.out.println("\nTotal de vehículos funcionando " + Vehiculo.getContCantVehFuncionando() + "\n");
		
		taxi1.reiniciarContador(25000);
		System.out.println("\nEl coste del nuevo trayecto es: " + taxi1.calcularCosteTrayecto() + "\n");
		
		System.out.println("\n-+-+-+-+-+-+-+-+-+-+-+-+-+-+ DATOS DEL PRIMER TAXI ACTUALIZADOS +-+-+-+-+-+-+-+-+-+-+-+-+-+-");
		System.out.println(taxi1.toString() + "\n");
		
		particular1.reiniciarContador(10000);
		
		particular2.setPropietario("Rosa Luque");
		System.out.println("\n-+-+-+-+-+-+-+-+-+-+-+-+-+-+ DATOS DEL SEGUNDO PARTICULAR ACTUALIZADOS +-+-+-+-+-+-+-+-+-+-+-+-+-+-");
		System.out.println(particular2.toString());
		
	}
}
