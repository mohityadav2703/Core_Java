//static method overloading process by using 'super' and 'this' keyword

package p1;

public class CClass extends PClass{
 
	public static void m(int a,int b,int c,int d)
	{
		System.out.println("The value of d :"+d);
	}
	public static void m(int a,int b,int c)
	{
		System.out.println("The Value Of c :"+c);
	}
	public void dis(int a,int b,int c,int d)
	{
		super.m(a);
		super.m(a, b);
	//	this.m(a);
	//	this.m(a, b);
		this.m(a, b, c);
		this.m(a, b, c, d);
	}
}
