package com.app.collection1;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedList_IterateElementFromSpecifiedPosition {

	public static void main(String[] args) {
		List<Integer> list = new LinkedList<Integer>();
		for(int i=10;i<=20;i++) {
			list.add(i);
		}
		System.out.println("Original Elements :"+list);
		
		Iterator it=list.listIterator(3);
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}
	}
}
