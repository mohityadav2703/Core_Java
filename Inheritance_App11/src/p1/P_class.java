//constructor overloading process

package p1;

public class P_class 
{
	public P_class(int a,int b)
	{
		this(a);
		System.out.println("The Value of b :"+b);
	}
	public P_class(int a)
	{
		System.out.println("The value of a :"+a);
	}
}
