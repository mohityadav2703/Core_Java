// Generalization means creating parent class object
package p1;

public interface ITest 
{
	public abstract void dis1(int a);
	public default void dis2(int b)
	{
		System.out.println("=====ITest dis2(b)=====");
		System.out.println("The value of b :"+b);
	}
}
