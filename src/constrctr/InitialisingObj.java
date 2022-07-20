package constrctr;

public class InitialisingObj {
	ChildCls2 cs;

	public void InitialisingObj() {
		cs=new ChildCls2();
		cs.method();
	}
	public static void main(String[] args) {
		InitialisingObj Io=new InitialisingObj();
		

	}

}
