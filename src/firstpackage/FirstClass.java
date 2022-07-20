package firstpackage;

public class FirstClass {
	//state //
	String C= "My name is Ashwini";
	int MockGrp= 3;
	char VelocityInitial= 'V';
	//Behaviour//
	public void MyInfo() {
		System.out.println("I am student of Velocity");
		
	}
	
	

	public static void main(String[] args) {
		
System.out.println("Hi");
FirstClass detail= new FirstClass();
System.out.println(detail.C);
System.out.println("My Mock group is "+detail.MockGrp);

}}
