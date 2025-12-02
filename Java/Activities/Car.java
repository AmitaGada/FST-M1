package Activity;

public class Car {
	//Class Variables
	String color;
	String transmission;
	int make;
	int tyres;
	int doors;
	
	//Constructors
	Car () {
		tyres = 4;
		doors = 4;
	}
	
	//Methods
	public void displayCharacteristics() {
		System.out.println("Color of the Car: " + color );
		System.out.println("Make of the Car: " + make );
		System.out.println("Transmission of the Car: " + transmission );
		System.out.println("Number of Tyres of the Car: " + tyres );
		System.out.println("Number of Doors of the Car: " + doors );
	}
		
	public void accelarate() {
		System.out.println("Car is moving fast after accelarating");
	}
	public void brake() {
		System.out.println("Car has stopped after applying brakes");
	}

}
