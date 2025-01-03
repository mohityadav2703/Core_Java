//Write a Java program to clone an array list to another array list.

package com.app.collection1;

import java.util.ArrayList;

public class ArrayList_CloneOnAnotherList {

	public static void main(String[] args) {
	  ArrayList<String> list=new ArrayList<String>();
	  list.add("Mohit");
	  list.add("Nihit");
	  list.add("Chillu");
	  list.add("Deepak");
	  list.add("Chandan");
	  
	  System.out.print("Original List :");
	  for(String s :list) {
		  System.out.print(s+" ");
	  }
	  
	  ArrayList<String> list1=new ArrayList<String>(list);
	  System.out.print("\nCloned List :");
	  for(String s : list1) {
		  System.out.print(s+" ");
	  }
	}
}
