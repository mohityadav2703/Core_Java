//Write a Java program to insert elements into the linked list at the first and last positions.

package com.app.collection1;
import java.util.LinkedList;
import java.util.Scanner;

public class LinkedList_InsertEleAtFirstAndLastIndex {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The First Element At First Position :");
		int first=sc.nextInt();
		System.out.println("Enter The Last Element At Last Position :");
		int last=sc.nextInt();
		
		LinkedList<Integer> list = new LinkedList<Integer>();
		for(int i=1;i<=10;i++) {
			list.add(i);
		}
		System.out.println("Original List :"+list);
		list.addFirst(first);
		list.addLast(last);
		
		System.out.println("After Adding :"+list);
		sc.close();
	}

}
