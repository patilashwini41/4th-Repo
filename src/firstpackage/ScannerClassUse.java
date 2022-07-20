package firstpackage;
import java.util.Scanner;
public class ScannerClassUse {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter your percentage");
		float perct= sc.nextFloat();
		if(perct>=35) {
			if(perct>79 && perct<=100)
				System.out.println("You are passed first class with Distinction");
			else
				System.out.println("You are passed but didn't get Distinction");
		}else
			System.out.println("You are failed");
		

	}

}
