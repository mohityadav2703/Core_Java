//Instance Method Overloading Process


package p1;

public class CClass extends PClass{
 
	public void m(int a,int b,int c,int d)
	{
		this.m(a,b,c);
		System.out.println("The Value Of d :"+d);
	}
	public void m(int a,int b,int c)
	{
		super.m(a,b);
		System.out.println("The value of c :"+c);
	}
}
