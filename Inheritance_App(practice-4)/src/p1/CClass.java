package p1;

public class CClass extends PClass{
	//parameterized constructor
	public CClass(int x,int y)
	{
		super(x,y);
		System.out.println("==========Para-Cons of CClass============");
		System.out.println("The Value of x:"+x);
		System.out.println("The Value of y:"+y);
	}
	//instance method
	public void cm()
	{
		System.out.println("===========This is Instance Method ofCClass==========");
	}
	public static void cm1()
	{
		System.out.println("===========This is Static Method Of CClass============");
	}
	//static block
	static
	{
		System.out.println("===========Static-Block of Cclass==========");
	}
	//instance block
	{
		System.out.println("===========Instance-Block Of CClass============");
	}
}
