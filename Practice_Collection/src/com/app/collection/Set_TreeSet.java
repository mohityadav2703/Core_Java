package com.app.collection;

import java.util.Set;
import java.util.TreeSet;

public class Set_TreeSet {

	public static void main(String[] args) {
		Set<Integer> s1=new TreeSet<Integer>();
		s1.add(19);
		s1.add(11);
		s1.add(11);
		s1.add(17);
		s1.add(9);
		s1.add(23);
		
		s1.forEach(k-> System.out.print(k+" "));
	//	s1.iterator().forEachRemaining(k-> System.out.print(k+" "));
	//	s1.spliterator().forEachRemaining(k-> System.out.print(k+" "));
		
		
	
	}
}
