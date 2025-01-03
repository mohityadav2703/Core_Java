package p1;
public interface ITest {
	public static int m=10;
	public abstract void m1(int a);
	public default void dis1(int b)
	{
		System.out.println("The Value of m :"+m);
		System.out.println("The value of b :"+b);
	}

}
