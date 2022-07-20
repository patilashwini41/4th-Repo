package controlstatements;
import java.util.Scanner;
public class SwitchStatement {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the month name");
		String month=sc.next();
		switch(month) {
		case "january" :
			System.out.println("Month no. for given month is 1");
			break;
		case "february" :
			System.out.println("Month no. for given month is 2");
			break;
			case "march" :
				System.out.println("Month no. for given month is 3");
				break;
				case "april" :
					System.out.println("Month no. for given month is 4");
					break;
				case "may" :
					System.out.println("Month no. for given month is 5");
					break;
				case "june" :
					System.out.println("Month no. for given month is 6");
					break;
				case "july" :
					System.out.println("Month no. for given month is 7");
					break;
				case "august" :
					System.out.println("Month no. for given month is 8");
					break;
				case "september" :
					System.out.println("Month no. for given month is 9");
					break;
				case "october" :
					System.out.println("Month no. for given month is 10");
					break;
				case "november" :
					System.out.println("Month no. for given month is 11");
					break;
				case "december" :
					System.out.println("Month no. for given month is 12");
					break;
					default: System.out.println("Invalid Month Name");
		}
		
	}

}
