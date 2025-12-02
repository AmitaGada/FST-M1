package Activity;

public class Activity1 { 
	public static void main(String[] args) {
		Car skoda = new Car();
		skoda.make = 2014;
		skoda.color = "Black";
		skoda.transmission = "Manual";
		
		skoda.displayCharacteristics();
		skoda.accelarate();
		skoda.brake();
	}

}
