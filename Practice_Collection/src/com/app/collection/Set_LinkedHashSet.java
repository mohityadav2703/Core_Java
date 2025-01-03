package com.app.collection;

import java.util.LinkedHashSet;
import java.util.Set;

public class Set_LinkedHashSet {

	public static void main(String[] args) {
		Set<Integer> s1=new LinkedHashSet<Integer>();
		s1.add(10);
		s1.add(11);
		s1.add(17);
		s1.add(19);
		s1.add(11);
		s1.add(17);
		
		s1.forEach(k-> System.out.print(k+" "));
	}
}
