package p1;

public interface ITest 
{
	public abstract void m1(int a);
	public default void m2(int b)
	{
		System.out.println("****ITest m2(b)*****");
		System.out.println("The value of b :"+b);
	}
	public static void m4(int k)
	{
		System.out.println("****ITest static m4(k)****");
		System.out.println("The Value of k :"+k);
	}
}
