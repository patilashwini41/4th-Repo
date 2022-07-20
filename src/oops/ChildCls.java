package oops;


public class ChildCls extends ParentCls{
public ChildCls(int x) {
super(11);
		System.out.println("Child Class Parameter constrctr "+x);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChildCls c=new ChildCls(10);

	}

}
