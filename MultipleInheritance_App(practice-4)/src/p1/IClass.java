//concrete method accepted by interface

package p1;

public class IClass implements ITest1{
	int b=12; // by default it considered as 'default'
	public void m1(int a)
	{
		System.out.println("=======Abstract method m1(a)=======");
		System.out.println("The Value of a :"+a);
	}
	public void m7(int r)
	{
		System.out.println("=======Abstract method m7(r)======");
		System.out.println("The Value of r :"+r);
	}
	
}
