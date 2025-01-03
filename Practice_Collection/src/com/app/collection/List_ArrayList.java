package com.app.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class List_ArrayList implements Comparable<Integer>{
	public static void main(String[] args) {
		int a=14,b=40;
		List<Integer> li=new ArrayList<Integer>();
		for(int i=10;i<=17;i++) {
			li.add(i);
		}
		li.add(14);
		li.iterator().forEachRemaining(k-> System.out.print(k+" "));
		System.out.println();
		System.out.println("Element :"+a+" is Present or not :"+li.contains(a)+"=> On index :"+li.indexOf(a));
		System.out.println("Element :"+b+" is Present or not :"+li.contains(b)+"=> On index :"+li.indexOf(b));
		
		System.out.println(li.isEmpty());
		System.out.println(li.lastIndexOf(a));
		li.add(4, 15);
		li.forEach(k -> System.out.print(k+" "));
		System.out.println();
		li.listIterator(4).forEachRemaining(k-> System.out.print(k+" "));
		//sort arraylist
		Collections.sort(li);
		System.out.println("\nSort ArrayList"+li);
		
		
	}

	@Override
	public int compareTo(Integer o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
