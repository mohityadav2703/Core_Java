package p2;
import p1.*;

public class DemoMultipleInheritance1 {

	public static void main(String[] args)
	{
		IClass ob = new IClass();
		ob.dis1(10);
		ITest1.dis2(11);
		ITest2.dis22(12);
		ob.dis3(13);
		ob.dis33(14);

	}

}
