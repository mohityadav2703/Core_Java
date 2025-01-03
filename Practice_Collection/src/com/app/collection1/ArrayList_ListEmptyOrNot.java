// Write a Java program to test whether an array list is empty or not.

package com.app.collection1;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_ListEmptyOrNot {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		for(int i=10;i<=20;i++) {
			list.add(i);
		}
		System.out.println("Is This List Empty :"+list.isEmpty());
		list.removeAll(list);
		System.out.println("Is This List Empty :"+list.isEmpty());
	}

}
