package p1;

public class IClass implements ITest3
{
	public void m1(int x)
	{
		System.out.println("****ITest m1(x)****");
		System.out.println("The value of x :"+x);
	}
	public void m2(int y)
	{
		System.out.println("*****ITest2 m2(y)*****");
		System.out.println("The value of y :"+y);
	}
	public void m3(int z)
	{
		System.out.println("*****ITest3 m3(z)******");
		System.out.println("The value of z :"+z);
	}
}
