package p1;

public class IClass implements ITest
{
	public void dis1(int a)//implemented and overriding method
	{
		System.out.println("*****dis1(a)******");
		System.out.println("The value of a :"+a);
	}
	public void dis2(int b)//implemented and overriding method
	{
		System.out.println("*****dis2(b)******");
		System.out.println("The value of b :"+b);
	}
	public void dis3(int c) // Non implemented method
	{
		System.out.println("*****dis3(c)******");
		System.out.println("The value of c :"+c);
	}
}
