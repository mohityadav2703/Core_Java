//Write a Java program to insert the specified element at the specified position in the linked list.

package com.app.collection1;

import java.util.LinkedList;
import java.util.Scanner;
public class InsertElementAtSpecifiedPosition {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Element :");
		int num=sc.nextInt();
		System.out.println("Enter the Position :");
		int pos=sc.nextInt();
		
		LinkedList<Integer> list= new LinkedList<Integer>();
		for(int i=1;i<=10;i++) {
			list.add(i);
		}
		System.out.println("Original List :"+list);
		list.add(pos, num);
		System.out.println("After Add Element :"+list);
		
		
	}

}
