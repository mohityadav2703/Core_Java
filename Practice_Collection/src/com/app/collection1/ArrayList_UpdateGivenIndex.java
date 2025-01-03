// Write a Java program to update an array element by the given element.

package com.app.collection1;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_UpdateGivenIndex {

	public static void main(String[] args) {
		int ind=3;
		int value=20;
		List<Integer> li=new ArrayList<Integer>();
		for(int i=1;i<=10;i++) {
			li.add(i);
		}
		System.out.print("Original ArrayList :");
		for(int ab :li) {
			System.out.print(ab+" ");
		}
		System.out.println();
		System.out.print("Updated ArrayList :");
		li.add(ind, value);
		for(int ab :li) {
			System.out.print(ab+" ");
		}
	}
}
