package firstpackage;

public class InterClassCalling2 {

	public static void main(String[] args) {
		
		InterClassCalling ic=new InterClassCalling();
		InterClassCalling.method1();
		
		System.out.println(ic.x);

	}
//public static 
}
