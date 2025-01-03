// Copy ArrayList Element to Another ArrayList

package com.app.collection1;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_CopyArrayList {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		for(int i=1;i<=10;i++) {
			list.add(i);
		}
		
		System.out.print("List 1 Elements:");
		ArrayList<Integer> list1=new ArrayList<Integer>(list);
		for(int ab : list) {
			System.out.print(ab+" ");
		}
		
		System.out.print("\nList 2 Elements:");
		for(int ab :list1) {
			System.out.print(ab+" ");
		}
	}
}
