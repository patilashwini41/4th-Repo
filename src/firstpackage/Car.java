package firstpackage;

public class Car {
	//Variables
	String color= "Blue";
	int NoOfWheels= 4;
	
	//methods
	public void CarAccelerate() {
		System.out.println("Car Acceleration and my car has "+NoOfWheels);
		
	}

	public static void main(String[] args) {
		Car var=new Car();
	var.CarAccelerate();
	System.out.println("Hi, My Car's color is "+var.color);

	}

}
