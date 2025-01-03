package p1;

public class C_class extends P_class
{
	public static void m(int a,int b,int c,int d)
	{
		System.out.println("***m(a,b,c,d)***");
		System.out.println("The value of a :"+a);
		System.out.println("The value of b :"+b);
		System.out.println("The value of c :"+c);
		System.out.println("The value of d :"+d);
	}
	public static void m(int a,int b,int c) 
	{
		System.out.println("****m(a,b,c)****");
		System.out.println("The value of a :"+a);
		System.out.println("The value of b :"+b);
		System.out.println("The value of c :"+c);
	}
	public void access(int a,int b,int c,int d)
	{
		super.m(a);
		super.m(a, b);
		this.m(a,b,c);
		this.m(a,b,c,d);
	}
}
