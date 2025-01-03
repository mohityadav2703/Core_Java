package com.app.collection;

import java.util.PriorityQueue;
import java.util.Queue;

public class Queue_PriorityQueue {

	public static void main(String[] args) {
		Queue<Integer> q1=new PriorityQueue<Integer>();
		for(int i=10;i<=17;i++) {
			q1.add(i);
		}
		q1.forEach(k-> System.out.print(k+" "));
	//	q1.iterator().forEachRemaining(k-> System.out.print(k+" "));
	//	q1.spliterator().forEachRemaining(k-> System.out.print(k+" "));
		
	
	}
}
