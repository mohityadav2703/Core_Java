//Write a Java program to insert the specified element at the end of a linked list.

package com.app.collection1;
import java.util.LinkedList;
import java.util.Scanner;

public class LinkedList_AddElementAtLast {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the element");
		int last=sc.nextInt();
		LinkedList<Integer> list= new LinkedList<Integer>();
		for(int i=10;i<=20;i++) {
			list.add(i);
		}
		System.out.println("Original List :"+list);
		list.offerLast(last);
		System.out.println("Updated List :"+list);
		sc.close();
	}
}
