package firstpackage;
// Utilization of Static/Instance/Local variables in Static/Instance methods
public class VarMethodConcepts {
 static int x;
 int y=11;
 public int m1()
	{
		int z;
		z=x+y;
		return z;
		
	}

	public static void main(String[] args) {
		x=10;
		VarMethodConcepts v=new VarMethodConcepts();
		System.out.println(x);
		System.out.println(v.m1());
		VarMethodConcepts.m2();
		

	}
 public static void m2() {
	//int r=v.y+1;
	x=x+1;
	System.out.println(x);
 }
	

}
