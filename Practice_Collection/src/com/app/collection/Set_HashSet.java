package com.app.collection;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
public class Set_HashSet {

	public static void main(String[] args) {
	
	Set<Integer> s1=new HashSet<Integer>();
	TreeSet<String> s2=new TreeSet<String>();
	s2.add("Mohit");
	s2.add("Nihit");
	s2.add("Nihit");
	s2.add("Deepak");
	s2.add("chandan");
	s2.add("Chillu");
	s2.forEach(k-> System.out.print(k+" "));
	
	for(int i=10;i<=17;i++) {
		s1.add(i);
	}
	HashSet<Integer> s3=new HashSet<Integer>();
	for(int i=0;i<10;i++) {
		s3.add(i);
	}
	System.out.println("\nSet Data ");
	s1.forEach(k-> System.out.print(k+" "));
	
	System.out.println("\n\nIs Set<> Empty :"+s1.isEmpty());
	System.out.println("Is Set Contain :"+s1.contains(11));
	System.out.println("Add Into HashSet :"+s1.add(19));
	System.out.println(s1);
	System.out.println(s1.containsAll(s3));
	System.out.println(s1.remove(19));
	System.out.println(s1);
	System.out.println(s1.addAll(s3));
	System.out.println(s1.toString());
	System.out.println(s1.retainAll(s3));
	System.out.println(s1);
	System.out.println(s3.addAll(s1));
	System.out.println(s3.toString());
  }
}
