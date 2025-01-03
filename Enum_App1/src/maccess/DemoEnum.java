package maccess;
import test.Cars;
import java.util.*;
public class DemoEnum {
	public static void main(String[] args) {
		System.out.println("=====Display Enum<E>=====");
		Cars c[]=Cars.values();
		Spliterator<Cars> sp=Arrays.spliterator(c);
		sp.forEachRemaining((k)->{
			System.out.println(k.toString()+ " Costs "+k.getPrice()+" Thousand Dollars");
		});

	}

}
