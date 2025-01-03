//we can access static member of class using object reference
package p1;

public class C_class extends P_class
{
	public static void m(int x)
	{
		System.out.println("****C_class static m()****");
		System.out.println("The value of x :"+x);
	}
}
