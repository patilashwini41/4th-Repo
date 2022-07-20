package polymrphsm;
import java.util.Scanner;

public class UserCls  {
	int u;
	int p;

	public static void main(String[] args) {
		System.out.println("Enter userId and passwd");
		Scanner sc=new Scanner(System.in);
		int u=sc.nextInt();
		int p=sc.nextInt();
		ImplementingCls ic=new ImplementingCls();
		ic.Implemethod(u,p);
	}

}
