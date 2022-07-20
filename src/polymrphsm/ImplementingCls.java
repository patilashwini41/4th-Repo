package polymrphsm;

public class ImplementingCls extends EncapsEx1 {
	static int userid;
	static int paswd;
	public void Implemethod(int u,int p){
		this.userid=u;
		 this.paswd=p;

	if(userid==1 && paswd==123) 
	{
		super.getData();
	int balance=super.getData();
	
		 System.out.println("Your balance is "+balance);}
	
	}
		
	
		
	
	

	public static void main(String[] args) {
		// ImplementingCls ic=new  ImplementingCls();
		 
				
	}

}
