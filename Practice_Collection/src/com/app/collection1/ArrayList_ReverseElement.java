//  Write a Java program to reverse elements in an array list.

package com.app.collection1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList_ReverseElement {

	public static void main(String[] args) {
		List<Integer> list=new ArrayList<Integer>();
		for(int i=1;i<=10;i++) {
			list.add(i);
		}
		System.out.print("Original List Elements Are :");
		for(int x : list) {
			System.out.print(x+" ");
		}
		System.out.print("\nAfter Reverse List Elements Are :");
		Collections.reverse(list);
		for(int x :list) {
			System.out.print(x+" ");
		}
	}
}
