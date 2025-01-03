package com.app.collection;

import java.util.ArrayDeque;

public class Queue_ArrayDeque {
	public static void main(String[] args) {
		ArrayDeque<Integer> q1=new ArrayDeque<Integer>();
		for(int i=10;i<=17;i++) {
			q1.add(i);
		}
		q1.forEach(k-> System.out.print(k+" "));
		q1.addLast(20);
		System.out.println();
		q1.iterator().forEachRemaining(k-> System.out.print(k+" "));
		
		q1.addFirst(90);
		System.out.println();
		q1.forEach(k->System.out.print(k+" "));
		
		ArrayDeque<Integer> q2=q1.clone();
		System.out.println();
		q2.forEach(k-> System.out.print(k+" "));
		
		System.out.println();
		System.out.println(q1.containsAll(q2));
		q1.poll();
		q1.forEach(k->System.out.print(k+" "));
	}

}
