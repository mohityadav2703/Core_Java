package p1;

public interface ITest {
	public abstract void dis1(int a);
	public static void dis2(int b)
	{
		System.out.println("==========Static dis(b)===========");
		System.out.println("The Value of b :"+b);
	}
	public default void dis3(int c)
	{
		System.out.println("==========Instance dis(c)=========");
		System.out.println("The value of c :"+c);
	}

}
