//using generalization in abstract class

package p2;
import p1.*;
public class DemoAbstractClass2 {

	public static void main(String[] args) {
		AClass ob = (AClass) new ClassA();
		ob.dis1(10);
		ob.dis2(11);
	//	ob.dis3(); Error

	}

}
