package test;

public class CClass extends PClass
{
	private void m(int k)
	{
		System.out.println("*****CClass m(k)*****");
		System.out.println("The Value Of K: "+k);
	}
	public void access(int k)
	{
	//	super.m(k); //PClass not Available to CClass
		this.m(k);
	}
}
