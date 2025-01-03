//Write a Java program to join two linked lists.

package com.app.collection1;

import java.util.LinkedList;

public class LinkedList_JoinTwoList {
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		LinkedList<Integer> list1= new LinkedList<Integer>();
		for(int i=10;i<=20;i++) {
			list.add(i);
			list1.add(i);
		}
		
		System.out.println("Original List :"+list);
		list.addAll(list1);
		System.out.println("After Join List :"+list);
		
	}

}
