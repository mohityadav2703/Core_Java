// Write a Java program to join two array lists

package com.app.collection1;

import java.util.ArrayList;

public class ArrayList_JoinTwoArrayList {
	public static void main(String[] args) {
		ArrayList<Integer> list1=new ArrayList<Integer>();
		ArrayList<Integer> list2=new ArrayList<Integer>();
		
		for(int i=1;i<=10;i++) {
			list1.add(i);
		}
		
		for(int i=11;i<=20;i++) {
			list2.add(i);
		}
		System.out.print("List1 Elements :");
		for(int x : list1) {
			System.out.print(x+" ");
		}
		System.out.print("\nList2 Elements :");
		for(int x :list2) {
			System.out.print(x+" ");
		}
		ArrayList<Integer> list3 = new ArrayList<Integer>();
		list3.addAll(list1);
		list3.addAll(list2);
		System.out.print("\nAfter Join Both ArrayList :");
		for(int x : list3) {
			System.out.print(x+" ");
		}
		
	}
}
