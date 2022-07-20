package constrctr;

public class ParamtrConstrctrCll {

	public ParamtrConstrctrCll(){
		this("Hi");
		
	}
	public ParamtrConstrctrCll(int i,int j){
		System.out.println(i+j);
	}
	public ParamtrConstrctrCll(String s){
		
		this('A');
		System.out.println("String argument constructor called");
		
	}
	public ParamtrConstrctrCll(char c){
		
		this(10,20);
		System.out.println("Char argument constructor called");
		
	}
	public static void main(String[] args) {
		ParamtrConstrctrCll cc=new ParamtrConstrctrCll();
		
		
	}

}
