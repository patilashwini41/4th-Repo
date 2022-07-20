package firstpackage;

public class Calculator {
	float x=100;
	float y=70;
	public void Addition() {
		System.out.println("Addition: x+y="+(x+y));
	}
	public void Subtraction() {
		float z=x-y;
		System.out.println("Subtraction: x-y="+z);
	}
public void Multi() {
	float m=x*y;
	System.out.println("Multiplication: x*y="+m);
	
}
public void Division() {
	float d=x/y;
	System.out.println("Division: x/y="+d);
}
	public static void main(String[] args) {
		Calculator cal =new Calculator();
		cal.Addition();
		cal.Subtraction();
		cal.Multi();
		cal.Division();
		
	}

}
