package firstpackage;

public class GlobalVar {
	//Instance Variable 
int x;
char y;
float z;
String s; 
boolean b;
int a=11;
static int r=41;
	public static void main(String[] args) {
		
		GlobalVar gv=new GlobalVar();
		
		//Default Values
System.out.println(gv.x);
		System.out.println(gv.y);
		System.out.println(gv.z);
		System.out.println(gv.s);
		System.out.println(gv.b);
		System.out.println(gv.a);
		GlobalVar gv2=new GlobalVar();
		gv2.a=21;
		System.out.println(gv2.a);
		//FOR STATIC VARIABLE NO INSTANCE OF OBJ IS REQUIRED,WE CAN CALL VARIABLE DIRECTLY ALSO
		System.out.println(r);
		
		System.out.println(gv2.r);
		int r=50;
		System.out.println(r);
		

	}

}
