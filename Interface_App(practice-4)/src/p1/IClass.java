//using generalization in Interface
package p1;

public class IClass implements ITest1{

	public void dis1(int a)
	{
		System.out.println("=====Abstract dis(a)=====");
		System.out.println("The value of a :"+a);
	}
	public static void dis3(int y)
	{
		System.out.println("=====overrided static method dis3(x)=====");
		System.out.println("The value of x :"+y);
	}
	public void dis4()
	{
		System.out.println("======class instance method=====");
	}
}
