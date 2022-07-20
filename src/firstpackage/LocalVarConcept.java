package firstpackage;

public class LocalVarConcept {
	public void m() {
		int a=11;
	System.out.println(a);
		
	}

	public static void main(String[] args) {
		// Local Variable
		int a=101;
		System.out.println(a);
LocalVarConcept lc=new LocalVarConcept(); 
lc.m();
//int y;
//Local VaRIABLES MUST BE INITIALIZED WHEN DECLARED OTHERWISE GET COMPILE ERROR
//System.out.println(y);
//y=lc.m();
	}

}
