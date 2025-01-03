//constructor overloading process

package p1;

public class CClass extends PClass{
	public CClass(int a,int b,int c,int d)
	{
		this(a,b,c);
		System.out.println("The Value of d :"+d);
	}
	public CClass(int a,int b,int c)
	{
		super(a,b);
		System.out.println("The value of c :"+c);
	}

}
