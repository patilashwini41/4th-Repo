package firstpackage;

public class LocalGlobalinitialising {
	//Global Variable
//Non-Static
	int x;
	int a=100;
	public static void main(String[] args) {
		//Local Variable
		int y=10;
		int b;
		 
LocalGlobalinitialising lc=new LocalGlobalinitialising();
lc.x=y;
//By using local varaible inialize the global variable (non static)

System.out.println("Value of Global Var x is "+lc.x);
//By using Global varaible inialize the local variable (non static)

b=lc.a;
System.out.println("Value of Local Var b is "+b);
//By using local varaible inialize the global variable (static)

//k=y;
System.out.println("Value of Global Static Variable k is "+y+" which is nothing but Local Var y's value");
//By using local varaible inialize the global variable (static)

y=k;
System.out.println("Value of Local Variable y is "+k+" which is nothing but Global Var k's value");
		//By using local varaible inialize the global variable (static));

	}
//Global Static Variable
	static int k=12;
	
}
