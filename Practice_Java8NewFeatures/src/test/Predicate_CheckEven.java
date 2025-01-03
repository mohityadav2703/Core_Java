// Check Given Number is Even or Not


package test;
import java.util.function.*;

public class Predicate_CheckEven {

	public static void main(String[] args) {
		Predicate<Integer> p = i -> i%2==0;
		System.out.println(p.test(20));
		System.out.println(p.test(15));
		
	}
}
