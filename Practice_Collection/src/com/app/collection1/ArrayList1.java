package com.app.collection1;

import java.util.ArrayList;
import java.util.List;

public class ArrayList1 {
	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		list.add("Red");
		list.add("Green");
		list.add("Yellow");
		list.add("Black");
		list.add("pink");
		list.add("White");
		list.add("Brown");
		
		list.iterator().forEachRemaining(k->System.out.print(k+" "));
		System.out.println();
		list.listIterator().forEachRemaining(k->System.out.print(k+" "));
		System.out.println();
		list.spliterator().forEachRemaining(k-> System.out.print(k+" "));
		System.out.println();
		list.listIterator(2).forEachRemaining(k->System.out.print(k+" "));
		System.out.println();
		System.out.println(list.subList(2, 4));
		
		for(String ab : list) {
			System.out.print(ab+" ");
		}
	}

}
