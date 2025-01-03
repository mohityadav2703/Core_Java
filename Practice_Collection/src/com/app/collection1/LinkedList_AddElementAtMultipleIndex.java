//Write a Java program to insert some elements at the specified position into a linked list.

package com.app.collection1;

import java.util.LinkedList;

public class LinkedList_AddElementAtMultipleIndex {
	public static void main(String[] args) {
		int num1=33, num2=45, num3=77,num4=36;
		LinkedList<Integer> list = new LinkedList<Integer>();
		for(int i=1;i<=15;i++) {
			list.add(i);
		}
		System.out.println("Original List :"+list);
		list.addFirst(num1);
		list.addLast(num2);
		list.add(6, num4);
		list.add(9, num3);
		
		System.out.println("After Adding Elements :"+list);
	}
}
