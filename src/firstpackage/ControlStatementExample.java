package firstpackage;

public class ControlStatementExample {
	public void m1() {
	boolean b=true;
	if(b==true) 
		System.out.println("TRue must executed");
	else 
		System.out.println("False Statement should be printed");}
	
	public void m2() {
		int carprc=600000;
		if(carprc>=500000 && carprc<=800000) 
			System.out.println("Car can buy is i10");
	else if(carprc==700000 || carprc>=900000)
		System.out.println("Car can buy is i20");
	else if(carprc==1000000)
		System.out.println("Car can buy is Creta");
		}

	public static void main(String[] args) {
		ControlStatementExample cs=new ControlStatementExample();
		cs.m1();
		cs.m2();
	
		

	}}


