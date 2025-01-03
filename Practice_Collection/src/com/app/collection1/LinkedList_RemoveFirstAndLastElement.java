package com.app.collection1;

import java.util.LinkedList;

public class LinkedList_RemoveFirstAndLastElement {
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		for(int i=12;i<=22;i++) {
			list.add(i);
		}
		System.out.println("Original List :"+list);
		System.out.println("First Element :"+list.removeFirst());
		System.out.println("Last Element :"+list.removeLast());
		System.out.println("After Remove Elements :"+list);
	}

}
