package p2;
import p1.*;

public class DemoInnerClass4 {

	public static void main(String[] args) 
	{
		System.out.println("------InnerClass in Interface------");
		ITest.SubClass1 ob1 = new ITest.SubClass1();
		ob1.m1(12);
		System.out.println("------InnerClass in AbstractClass------");
		AClass ob = new AClass()
				{
			 		//Anonymous InnerClass with zero methods
				};
				AClass.SubClass2 ob2=ob.new SubClass2();
				ob2.m2(13);
				AClass.SubClass22 ob22=new AClass.SubClass22();
				ob22.m22(14);

	}

}
