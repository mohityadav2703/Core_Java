// Generalization means converting child class object into parent class
package p1;

public class CClass extends PClass 
{
	public void m1(int x) // overriding method
	{
		System.out.println("====CClass m1(x)====");
		System.out.println("The value of x :"+x);
	}
	public void m3(int z)
	{
		System.out.println("====CClass m3(z)====");
		System.out.println("The value of z :"+z);
	}
}
