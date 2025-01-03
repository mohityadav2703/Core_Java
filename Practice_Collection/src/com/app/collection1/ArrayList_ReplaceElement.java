// Write a Java program to replace the second element of an ArrayList with the specified element.

package com.app.collection1;

import java.util.ArrayList;

public class ArrayList_ReplaceElement {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i=10; i<=20;i++) {
			list.add(i);
		}
		System.out.println("Original List :"+list);
		System.out.print("New List :");
		list.set(1, 90);
		for(int x : list) {
			System.out.print(x+" ");
		}
		
	}
}
