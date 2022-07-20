package polymrphsm;

public class C extends P {
public void m1() {
	System.out.println("m1 from C");
}
	public static void main(String[] args) {
		
//P x=new P();
//x.m1();
//C y=new C();
//y.m1();
P z=new C();
z.m1();

	}

}
