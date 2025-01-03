//Write a Java program that swaps two elements in a linked list.

package com.app.collection1;
import java.util.Collections;
import java.util.LinkedList;

public class LinkedList_SwapTwoElements {
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		for(int i=10;i<=20;i++) {
			list.add(i);
		}
		System.out.println("Original List :"+list);
		Collections.swap(list, 0, 2);
		System.out.println("After Swap :"+list);
	}
}
