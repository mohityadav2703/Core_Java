// Write a Java program to empty an array list.

package com.app.collection1;

import java.util.ArrayList;

public class ArrayList_EmptyList {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i=10;i<=20;i++) {
			list.add(i);
		}
		System.out.print("List Elements Are :");
		for(int x : list) {
			System.out.print(x+" ");
		}
		
		list.removeAll(list);
		System.out.println("\nAfter Remove Elements :"+list);
	}
}
