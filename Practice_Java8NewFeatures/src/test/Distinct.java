package test;

import java.util.Arrays;
import java.util.List;

public class Distinct {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10,22,33,10,19,10,22,11,17,19,8);
		System.out.println("Original List :"+list);
		
		System.out.print("Stream List :");
		list.stream().forEach(ob-> System.out.print(ob+" "));
		
		System.out.print("\nAfter Remove Duplicate :");
		list.stream().distinct().forEach(ob-> System.out.print(ob+" "));
		
		System.out.print("\nAfter use of limit() :");
		// limit() : it is use to set the limit of stream object.
		list.stream().limit(3).forEach(ob-> System.out.print(ob+" "));
		
		System.out.println("\nAfter use peek() :");
		//peek() : it is use to perform some operation on all the stream objects.
		list.stream().filter(i-> i%2==0).limit(4).peek((x)-> {System.out.println(x+"..."+(x*x));}).count();
	}
	

}
