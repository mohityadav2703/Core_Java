package maccess;
import test.pack1.*;
public class DemoSealedClass {

	public static void main(String[] args) {
		System.out.println("===============ClassB=============");
		ClassB ob1=new ClassB();
		ob1.mA();
		ob1.mB();
		
		System.out.println("===============ClassC=============");
		ClassC ob2=new ClassC();
		ob2.mA();
		ob2.mC();

		System.out.println("===============ClassE===============");
		ClassE ob3=new ClassE();
		ob3.mA();
		ob3.mD();
		ob3.mE();

	}

}
