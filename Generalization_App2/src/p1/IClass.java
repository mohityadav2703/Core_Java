// Generalization means creating parent class object
package p1;

public class IClass implements ITest
{
	public void dis1(int a) //implemented and overriding
	{
		System.out.println("====ITest dis1(a)====");
		System.out.println("The value of a :"+a);
	}
	public void dis3(int c)
	{
		System.out.println("======ITest dis3(c)======");
		System.out.println("The value of c :"+c);
	}
}
