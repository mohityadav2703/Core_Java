package p1;

public interface ITest1 {

	public abstract void dis11(int x);
	public static void dis22(int y)
	{
		System.out.println("===========Static dis22(y)============");
		System.out.println("The value of  y :"+y);
	}
	public default void dis33(int z)
	{
		System.out.println("===========Instance dis33(z)==========");
		System.out.println("The value of z :"+z);
	}
}
