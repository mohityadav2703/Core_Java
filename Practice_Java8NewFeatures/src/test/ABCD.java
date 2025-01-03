package test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ABCD {
	public static void main(String[] args) {
		List<String> str=new ArrayList<String>();
		str.add("hello");
		str.add("india");
		str.add("russia");
		str.add("france");
		str.add("israiel");
		str.add("japan");
		
		//print string whose length is > 5
		List<String> list=str.stream().filter(i -> i.length()>5).sorted((String o1, String o2) -> (o2.compareTo(o1))).collect(Collectors.toList());
		list.iterator().forEachRemaining(a -> System.out.print(a+" "));
		
		//print first character capital of every string
		List<String> list1=str.stream().map(i-> Character.toUpperCase(i.charAt(0))+i.substring(1)).collect(Collectors.toList());
		list1.forEach(System.out::println);
		
		//print last character capital of every string
		str.stream().map(i-> i.substring(0, i.length()-1) + Character.toUpperCase(i.charAt(i.length()-1))).forEach(System.out::println);
		
		str.stream().filter(i-> i.length() %2==0).map(k-> k.toUpperCase()).forEach(System.out::println);
		
		str.stream().filter(i-> i.length()%2!=0).forEach(System.out::println);
		
	}
}
