package p2;
import p1.*;

public class DemoInterface1 {

	public static void main(String[] args) 
	{
		//ITest ob =new ITest(); //Error
		IClass ob = new IClass();
		ob.dis1(11);
		ob.dis2(12);
		ob.dis3(13);
		System.out.println("*******main()*******");
		System.out.println("The value of z :"+ITest.z);

	}

}
