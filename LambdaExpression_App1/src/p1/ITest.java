package p1;

public interface ITest 
{
	public static final int k=10;
	public abstract void dis1(int a);
	public default void dis2(int b)
	{
		System.out.println("*****Default dis2(b)*****");
		System.out.println("The value of b :"+b);
		System.out.println("The value of k :"+k);
	}
}
