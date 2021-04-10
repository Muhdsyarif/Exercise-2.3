import java .util.Scanner;
public class main {

	public static void main(String[] args) {
		
	Motorcycle Superbike = new Motorcycle();   //create first object
		System.out.println("Superbike" + "\n");
		Superbike.printMotorcycle();
		Superbike.calPrice();
		Superbike.printService();
		Superbike.printInfo();
		
	System.out.println("--------------------------------------------------");
		
	Motorcycle Scooter = new Motorcycle();    //create second object
		System.out.println("Scooter" + "\n");
		Scooter.printMotorcycle();
		Scooter.calPrice();
		Scooter.printService();
		Scooter.printInfo();
	}
}
