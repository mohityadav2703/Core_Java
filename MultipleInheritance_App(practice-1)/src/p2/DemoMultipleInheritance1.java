package p2;
import p1.*;

public class DemoMultipleInheritance1 {

	public static void main(String[] args) {
		IClass ob = new IClass();
		ob.dis1(10);
		ITest.dis2(11);
		ob.dis3(12);
		ob.dis11(14);
		ITest1.dis22(15);
		ob.dis33(16);
		IClass.dis222(17);
		ob.dis333(18);

	}

}
