package p1;

public class C_class extends P_class
{
	public void m(int a,int b,int c,int d)
	{
		this.m(a,b,c);
		System.out.println("The value of d :"+d);
	}
	public void m(int a,int b,int c)
	{
		super.m(a,b);
		System.out.println("The value of c :"+c);
	}
}
