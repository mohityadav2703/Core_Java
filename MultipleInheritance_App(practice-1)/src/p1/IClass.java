package p1;

public class IClass implements ITest,ITest1{
	public void dis1(int a)
	{
		System.out.println("============Abstract dis1(a)============");
		System.out.println("The value of a :"+a);
	}
	public void dis11(int x)
	{
		System.out.println("============Abstract dis11(x)============");
		System.out.println("The Value Of x :"+x);
	}
	public static void dis222(int d)
	{
		System.out.println("============Static dis222(d)==============");
		System.out.println("The value of d :"+d);
	}
	public void dis333(int e)
	{
		System.out.println("============Instance dis333(e)============");
		System.out.println("The value of e :"+e);
	}
}
