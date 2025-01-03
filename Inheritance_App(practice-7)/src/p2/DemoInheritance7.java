//static method overloading process by using 'super' and 'this' keyword

package p2;
import p1.*;
public class DemoInheritance7 {

	public static void main(String[] args) {
		System.out.println("The value of x :"+PClass.x);
		CClass ob=new CClass();
		ob.dis(10,20,30,40);
		//PClass.x=50;
	}

}
