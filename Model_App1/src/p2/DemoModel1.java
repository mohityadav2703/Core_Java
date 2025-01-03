package p2;
import p1.*;

public class DemoModel1 {

	public static void main(String[] args)
	{
		ITest ob = Access.getRef();// getRef() method is holding implementation of ITest interface
		ob.dis1(123);
		
	}

}
