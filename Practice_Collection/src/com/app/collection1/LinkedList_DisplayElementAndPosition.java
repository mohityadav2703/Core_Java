//Write a Java program to display elements and their positions in a linked list.

package com.app.collection1;

import java.util.LinkedList;

public class LinkedList_DisplayElementAndPosition {
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		for(int i=33;i<=43;i++) {
			list.add(i);
		}
		for(int i=0;i<list.size();i++) {
			System.out.println("Index "+i+" :"+list.get(i));
		}
	}
}
