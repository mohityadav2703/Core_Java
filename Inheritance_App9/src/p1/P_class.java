package p1;

public class P_class 
{
	public void m(int a,int b)
	{
		this.m(a);
		System.out.println("The Value Of b :"+b);
	}
	public void m(int a)
	{
		System.out.println("The Value Of a :"+a);
	}
}
