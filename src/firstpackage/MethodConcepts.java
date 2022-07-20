package firstpackage;

public class MethodConcepts {

	public static void main(String[] args) {
		int r=add(10,20);
System.out.println("The Addition of two nos. is "+r);
		r=subtract(50,40);
System.out.println("The Subtraction of two nos. is "+r);
		r=Mult(20,30);
System.out.println("The Multiplication of two nos. is "+r);
	Float v=Division(100f,30f);
System.out.println("The Division of two nos. is "+r);
		}
	public static int add(int x, int y) {
		int z=x+y;
		return z;
		}
	public static int subtract(int x, int y) {
		int z=x-y;
		return z;
		}
	public static int Mult(int x, int y) {
		int z=x*y;
		return z;
		}
	public static Float Division(Float x, Float y) {
		Float d=x/y;
		return d;
		}}
