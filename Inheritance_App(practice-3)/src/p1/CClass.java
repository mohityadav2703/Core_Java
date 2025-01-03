package p1;

public class CClass extends PClass{
public CClass(int x,int y)  //para-constructor
{
	super(x,y); // load the data to pclass
	System.out.println("=========CClass Para-Constructor=========");
	System.out.println("The value of x :"+x);
	System.out.println("The value of y :"+y);
}
}
