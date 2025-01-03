//using stream method find the number starts with 1

package test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindTheNumberStartedWithOne {

	public static void main(String[] args) {
		
		
		List<Integer> listOfInteger= Arrays.asList(11,18,20,24,85,66,13);
		List<String> reString= listOfInteger.stream()
											.map(e -> e+"")
											.filter(e-> e.startsWith("1"))
											.collect(Collectors.toList());
		
		System.out.println(reString);
	}
}
