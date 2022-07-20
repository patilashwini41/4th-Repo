package controlstatements;
import java.util.Scanner;
public class PracticeProgramLoops {

	public static void main(String[] args) {
		// TO CHECK GIVEN NO. IS PRIME OR NOT
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number ");
		int num=sc.nextInt();
	
		if((num%1)==0) {
		while((num%2)!=0){
			
				System.out.println(+num +" is a Prime number");
				break;
			}
				
			
		}else if(num==2) {
			System.out.println("2 is a prime number");
		
	}else
		System.out.println("Given no. is not a prime number");
}}
