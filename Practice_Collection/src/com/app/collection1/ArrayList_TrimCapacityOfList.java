// Write a Java program for trimming the capacity of an array list

package com.app.collection1;

import java.util.ArrayList;

public class ArrayList_TrimCapacityOfList {

	public static void main(String[] args) {
		 ArrayList<String> c1= new ArrayList<String>();
         c1.add("Red");
         c1.add("Green");
         c1.add("Black");
         c1.add("White");
         c1.add("Pink");
         System.out.println("Original array list: " + c1);
         System.out.print("Let trim to size the above array: ");
         c1.trimToSize();
         System.out.print(c1+" ");
  }
}

