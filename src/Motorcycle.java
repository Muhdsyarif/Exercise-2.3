import java.util.Scanner;
public class Motorcycle {
	
	Scanner s = new Scanner(System.in);

	void printMotorcycle() {
		System.out.println("Enter Brand, Type, Colour, :");
		System.out.print("Brand: ");
		String b = s.nextLine();
		System.out.print("Type: ");
		String t = s.nextLine();
		System.out.print("Colour: ");
		String c = s.nextLine();
		System.out.println(" ");
		
		System.out.println("Motorcycle brand: " + b);
		System.out.println("Motorcycle type: " + t);
		System.out.println("Motorcycle colour: " + c + "\n");
	}
	
	void calPrice() {
		System.out.println("Enter price and quantity:");
		System.out.print("Enter price: ");
		double p = s.nextInt();
		System.out.print("Enter quantity: ");
		int q = s.nextInt();
		double t = p*q;
		System.out.println("Total Price: " + "RM" + t);	
		System.out.println(" ");
	}
	
	void printService() {
		System.out.print("Do you want to add any service[1.yes/2.no]?" + "\n");
		int YesNo = s.nextInt();
		
		switch(YesNo) {
		
		case 1:
			System.out.println("You just add motorcycle servis, Rm150 will be charged for the servis!!");
			break;
			
		case 2:
			System.out.println("No motorcycle servis.");
		break;
		}		
		System.out.println(" ");
	}
	
	void printInfo() {	
		System.out.println("Motorcycle information:");
		System.out.println("Click 1 for engine info.");
		System.out.println("Click 2 for features and safety info.");
		System.out.println("Click 3 for other info.");
		System.out.println(" ");
		
		System.out.print("No: ");
		int info = s.nextInt();
		
		switch(info) {
		
		case 1:
			System.out.println("Engine information:");
			System.out.println("1. Engine use is 4 stroke with 4-cylinder.");
			System.out.println("2. Electronic starting system.");
			System.out.println("3. With 150 cubic capacity.");
			break;
			
		case 2:
			System.out.println("Features and safety information:");
			System.out.println("1. Transmission with 6-speed and multiple wet clutch.");
			System.out.println("2. Using hydraulic disc brakes with ABS.");
			break;
			
		case 3:
			System.out.println("Other information:");
			System.out.println("1. With 3.7 gal fuel capacity.");
			System.out.println("2. Seat height is 30.7 inch.");
			System.out.println("3. 1 year warranty.");	
			break;
		}	
	}
	
	

	
	
}
