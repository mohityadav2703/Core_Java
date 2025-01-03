// Write a Java program to retrieve an element (at a specified index) from a given array list.

package com.app.collection1;

import java.util.ArrayList;

public class ArrayList_GetElementFromGivenIndex {

	public static void main(String[] args) {
		int ind=3;
		
		ArrayList<Integer> list= new ArrayList<Integer>();
		for(int i=1;i<=10;i++) {
			list.add(i);
		}
		
		for(int ab : list) {
			System.out.print(ab+" ");
		}
		System.out.println();
		System.out.println(list.get(ind));
	}
}
