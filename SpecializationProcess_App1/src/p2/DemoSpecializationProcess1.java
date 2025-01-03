//Specialization process 

package p2;
import p1.*;
public class DemoSpecializationProcess1 {

	public static void main(String[] args) {
		ClassB ob=(ClassB) new ClassA();
		ob.dis1(10,11);
		ob.dis4(19, 20);
		ClassB.dis2(12);
	}

}
