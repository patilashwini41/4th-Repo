package ExceptnHndl;

public class ExH1 {
	static String s=null;

	public static void main(String[] args) {
		System.out.println("Hi");
try {
		System.out.println(20/0);
	}
catch (ArithmeticException e){
		System.out.println("Handled Arithmetically exception");}
catch (RuntimeException e){
		System.out.println("Handled Arithmetically exception");
	}
catch ( Exception e){
	System.out.println("Handled in Runtime exception");}

//catch (Exception e){
	//System.out.println("Handled exception class");


try {
	s.equals("HI");}
catch(NullPointerException n) {
	System.out.println("Hello strng exc handled");}

	//System.out.println(20/0);
	




	}

}
