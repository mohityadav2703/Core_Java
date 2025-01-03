//concrete method accepted by interface

package p2;
import p1.*;
public class DemoMultipleInheritance4 {

	public static void main(String[] args) {
		
		System.out.println("The value of p :"+ITest.p);
		System.out.println("The Value of b :"+ITest.b);
		IClass ob = new IClass();
		ob.m1(20);
		ITest.m2(30,40);
		ob.m3(50,60);
		ob.m5(70,80,90,100);
		ob.m7(110);
	
		

	}

}
