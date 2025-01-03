//passing arguments/parameter to main() method
package maccess;
import java.util.*;
public class DemoArray6 {
	public static void main(String[] args) {
		System.out.println("===========Dispaying args[] as Runtime===========");
		Spliterator<String> sp=Arrays.spliterator(args);
		sp.forEachRemaining((k)->
		{
			System.out.println(k.toString());
		});
	}

}
