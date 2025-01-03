package p2;
import p1.*;

public class DesignModel2 
{
	public static void main(String[] args)
	{
		ITest ob = Access.getRef();//getRef() is holding LambdaExpression
		ob.dis1(143);
		
	}
}
