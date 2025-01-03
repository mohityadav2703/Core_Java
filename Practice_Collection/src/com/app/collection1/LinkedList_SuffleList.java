//Write a Java program to shuffle elements in a linked list.

package com.app.collection1;
import java.util.Collections;
import java.util.LinkedList;

public class LinkedList_SuffleList {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		for(int i=20;i<=30;i++) {
			list.add(i);
		}
		System.out.println("Original List :"+list);
		Collections.shuffle(list);
		System.out.println("After Mixing Element :"+list);
	}
}
