package controlstatements;
import java.util.Scanner;
public class WhileLoopProgram {

	public static void main(String[] args) {
		
		int count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		while(num!=0) {
			
			num=num/10;//1234 -->123
			count=count+1;
			
			}
		System.out.println("Length of the given no. is "+count);

	}
	/*-------------------------- To make a Number Reverse-----------------------------------------
	 * main(){
	 * int num=sc.nextint();
	 * int remaindr=0;
	 * while(num!=0){
	 * remaindr=num%10;
	 * reverse=reverse*10+ remaindr;
	 * no=no/10; 
	 * }
	 * System.o.p.(reverse);
	 * 
	 * }
	 */

}
