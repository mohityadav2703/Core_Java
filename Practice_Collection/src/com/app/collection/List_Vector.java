package com.app.collection;

import java.util.List;
import java.util.Vector;

public class List_Vector {

	public static void main(String[] args) {
		List<Integer> li=new Vector<Integer>();
		for(int i=10;i<=17;i++) {
			li.add(i);
		}
		li.listIterator().forEachRemaining(k-> System.out.print(k+" "));
		System.out.println();
		li.iterator().forEachRemaining(k1-> {System.out.print(k1+" ");});
	}
}
