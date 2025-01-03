// Generalization means creating parent class object

package p2;
import p1.*;

public class DemoGeneralization2 
{
	public static void main(String[] args)
	{
	//	Generalization
		ITest ob = (ITest)new IClass();
		ob.dis1(11);
		ob.dis2(12);
	//	ob.dis3(13); //Error
	
	}
}
