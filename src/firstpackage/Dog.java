package firstpackage;

public class Dog {
	
// Variable Declaration
	String DName= "brad";
	int age= 12;
	
	// methods
	public void DogID() {
		System.out.println("My Dog's name is "+DName+" & "+"His age is "+age  );
	}
	
	
	public static void main(String[] args) {
		// Object Creation
				Dog var= new Dog();
			
		
		//Method Calling
	   var.DogID();
	   
	}
}