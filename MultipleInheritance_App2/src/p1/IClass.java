package p1;

public class IClass extends PClass implements ITest
{
	public void m2(int y)
	{
		System.out.println("*****ITest m2(y)*****");
		System.out.println("The value of y :"+y);
	}
}
