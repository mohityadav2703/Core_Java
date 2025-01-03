// Array can Also Store dis-similar Object

package p2;
import p1.Employee;
import java.util.*;

public class DemArray2 {
	@SuppressWarnings("removal")
	public static void main(String[] args) {
		Object o[]=new Object[3];
		o[0]=new Integer(123);  //integer object
		o[1]=new String("nit-hyd"); // String object 
		o[2]=new Employee("A111","Raj","SE",12000);  // Collection of dis-similar object
		System.out.println("=======Object-Array=======");
		Spliterator<Object> sp=Arrays.spliterator(o);
		sp.forEachRemaining((k)->
					{
						System.out.println("Object :"+k);
					} );

	}

}
