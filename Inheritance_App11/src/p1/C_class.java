//constructor overloading process

package p1;

public class C_class extends P_class
{
  public C_class(int a,int b,int c,int d)
  {
	  this(a,b,c);
	  System.out.println("The value of d :"+d);
  }
  public C_class(int a,int b,int c)
  {
	  super(a,b);
	  System.out.println("The value of c :"+c);
  }
}
