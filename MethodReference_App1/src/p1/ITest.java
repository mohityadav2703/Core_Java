package p1;

public interface ITest 
{
	public abstract void dis1(int k);
	public default void dis2(int z)
	{
		System.out.println("****default dis2(z)****");
		System.out.println("The value of z :"+z);
	}
}
