//Abstract method collection of(variables,abstract method,concrete method,blocks,constructor,features)

package p2;
import p1.*;
public class DemoAbstractClass1 {

	public static void main(String[] args) {
		
		ClassA ob = new ClassA();
		System.out.println("The value of p :"+ob.p);
		ob.m1(10,11);
		ob.m2();
		ob.m4(13);
		AClass.m3();
		

	}

}
