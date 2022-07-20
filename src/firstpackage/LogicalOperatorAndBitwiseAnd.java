package firstpackage;
import java.util.Scanner;
public class LogicalOperatorAndBitwiseAnd {

	public static void main(String[] args) {

		String name="Ashi"; 
		String srnm="Jadhav";
		System.out.println("Please enter the Class name ");
		Scanner sc=new Scanner(System.in);
		
		String clsnm= sc.next();
		
		if(clsnm=="velocity")
		{
		if(name =="Ashi" && srnm =="Jadhav")
		{
			System.out.println("studies in Velocity");
		}else 
			System.out.println("does not study in Velocity");
		}else
			System.out.println("Student from other corporate classes");

	}

}
