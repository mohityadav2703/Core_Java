// Write a Java program to compare two array lists.

package com.app.collection1;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_CompareTwoArrayList {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		ArrayList<Integer> list1=new ArrayList<Integer>();
		
		for(int i=1;i<=10;i++) {
			list.add(i);
		}
		for(int i=11;i<=20;i++) {
			list1.add(i);
		}
		if(list.containsAll(list1)) {
			System.out.println("List Contains All The Elements Of List1");
		}
		else {
			System.out.println("List Doesn't Contains All The Elements Of List1");
		}
		
	}

}
