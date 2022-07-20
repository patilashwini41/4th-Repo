package polymrphsm;

public class SubCls extends SupCls {
	//when one method is static and other non static in overriding then we will get compile time error
	public  void m() {
		System.out.println("Hi from Subclass m");
	}

	public static void main(String[] args) {
	SupCls ref=new SubCls();
	SubCls.m();
	}

}
