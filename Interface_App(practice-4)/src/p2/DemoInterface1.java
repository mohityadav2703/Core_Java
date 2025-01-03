//using generalization in abstract class
package p2;
import p1.*;
public class DemoInterface1 {

	public static void main(String[] args) {
		ITest1 ob =(ITest1) new IClass();
		ob.dis1(10);
		ob.dis2(11,12);
		ITest1.dis3(13);
		
	}

}
