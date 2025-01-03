package p2;
import p1.*;

public class DemoMethodReferences {

	public static void main(String[] args) 
	{
		System.out.println("------References to Constructor------");
		ITest ob1 = Display::new;
		ob1.dis1(12);//constructor body is executed
		ob1.dis2(13);
		System.out.println("------References to InstanceMethod------");
		Display d = new Display(500);// constructor call
		ITest ob2 =d::m1;
		ob2.dis1(14);
		ob2.dis2(15);
		System.out.println("------Reference to StaticMethod------");
		ITest ob3 = Display ::m2;
		ob3.dis1(16);
		ob3.dis2(17);

	}

}
