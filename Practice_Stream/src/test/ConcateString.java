package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConcateString {
	public static void main(String[] args) {
		List<String> names=new ArrayList<String>();
		names.addAll(Arrays.asList("Mohit","Chillu","Nihit","Rithanya","Murari","Deepak","Chandan"));
		
		String list=names.stream().collect(Collectors.joining(", "));
		System.out.println(list);
		
	}

}
