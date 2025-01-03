package com.app.collection;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DemoAll {
	
	private static final Logger logger= Logger.getLogger(DemoAll.class.getName());

	public static void main(String[] args) {
		logger.log(Level.FINE, "Main method started..");
		
		logger.info("HashSet Example...");
		Set<Integer> s1=new HashSet<>();
		
		logger.info("adding integer element to hashset..");
		for(int i=12;i<=17;i++) {
			s1.add(i);
		}
		
		logger.info("Adding Null value to Set..");
		s1.add(null);
		
		logger.warning("Adding Duplicate valueto HashSet..!");
		s1.add(15);		
		
		logger.info("Convert set data to string");
		String joinedData=s1.stream().map(String::valueOf).reduce("",(accumulator,current)-> accumulator.isEmpty()?current : accumulator +", "+current);
		
		
		logger.info("Displaying HashSet Data...!!");
		logger.info(joinedData);
		
		/**
			we can display this data by using below folling way
			* s1.iterator().forEachRemaining(k-> System.out.print(k+" "));
			* s1.spliterator().forEachRemaining(ch -> System.out.print(ch+" "));
			* s1.forEach(k-> System.out.print(k+" "));
		*/
		
		Set<Integer> s2=new LinkedHashSet<>();
		logger.info("LinkedHashSet Example...!!");
		s2.add(12);
		s2.add(10);
		s2.add(20);
		s2.add(9);
		s2.add(11);
		logger.info("Integer Data Added to LinkedHashSet");
		s2.add(null);
		logger.warning("Null value Added to LinkedHashSet");
		
		logger.info("LinkedHashSet Data Converting to String Data");
		String linkedHashSet=s2.stream().map(String::valueOf).reduce("",(accumulator,current)-> accumulator.isEmpty()?current :accumulator+", "+current);
		logger.info("Displaying LinkedHashSetData");
		logger.info(linkedHashSet);
		
		/**
		 	we can display this data by using below folling way
			* s2.iterator().forEachRemaining(k -> System.out.print(k+" "));
			* s2.spliterator().forEachRemaining(ch -> System.out.print(ch+" "));
			* s2.forEach(k-> System.out.print(k+" "));
		*/	
		logger.info("End of HashSet..");
		
		logger.info("TreeSet Example...!!");
		Set<Integer> s3=new TreeSet<>();
	
		s3.add(12);
		s3.add(10);
		s3.add(20);
		s3.add(9);
		s3.add(11);
		logger.info("Integer Element Added to TreeSet");
		logger.log(Level.SEVERE,"Adding Null value instead of Integer to TreeSet ");
	//	s3.add(null);			//not allowed
		
		logger.info("Converting TreeSet Data to String ");
		String treeSet=s2.stream().map(String::valueOf).reduce("",(a,b)-> a.isEmpty()?b :a +", "+b);
		logger.info("Displaying TreeSet data");
		logger.info(treeSet);
		
		/**
		 	we can display this data by using below folling way
			* s3.iterator().forEachRemaining(k -> logger.info(k+" "));
			* s3.spliterator().forEachRemaining(ch -> System.out.print(ch+" "));
			* s3.forEach(ch -> System.out.print(ch+" "));

		*/
		logger.info("End of TreeSet");
		
		logger.info("ArrayList Example...!!");
		List<Integer> a1=new ArrayList<>();
		logger.info("Adding Element to ArrayList..");
		a1.add(12);
		a1.add(10);
		a1.add(20);
		a1.add(9);
		a1.add(null);
		a1.add(11);
		
		logger.info("Converting Arraylist Data to String");
		String arrayList=a1.stream().map(String::valueOf).reduce("",(a,b)-> a.isEmpty()?b:a +", "+b);
		logger.info("Displaying ArrayList Data");
		logger.info(arrayList);
		
		/**
		 	we can display this data by using below folling way
			* a1.iterator().forEachRemaining(k-> logger.info(k+" "));
			* a1.spliterator().forEachRemaining(k-> System.out.print(k+" "));
			* a1.listIterator().forEachRemaining(k->System.out.print(k+" "));
		*/
		logger.info("End of ArrayList");
		
		logger.info("LinkedList Example..");
		List<Integer> a2=new LinkedList<>();
		logger.info("Adding Element to LinkedList");
		a2.add(12);
		a2.add(10);
		a2.add(20);
		a1.add(null);
		a2.add(9);
		a2.add(11);
		logger.info("End of adding element to LinkedList");
		logger.info("Converting LinkedList Data to String");
		String linkedList=a2.stream().map(String::valueOf).reduce("", (a,b)-> a.isEmpty()?b :a +", "+b);
		logger.info("Displaying LinkedList Data");
		logger.info(linkedList);
		
		/**
		 	we can display this data by using below folling way
			* a2.iterator().forEachRemaining(k-> System.out.print(k+" "));
			* a2.spliterator().forEachRemaining(k-> System.out.print(k+" "));
			* a2.listIterator().forEachRemaining(k->System.out.print(k+" "));
		*/
		logger.info("End of Linked List");
		
		logger.info("Vector Example...!!");
		Vector<Integer> a3=new Vector<>();
		logger.info("Adding Elements to Vector");
		a3.add(12);
		a3.add(10);
		a3.add(20);
		logger.warning("Adding Null value to Vector");
		a1.add(null);
		a3.add(9);
		a3.add(11);
		logger.info("End of Adding elements to vector");
		logger.info("Create StringBuilder object");
		StringBuilder logMessage = new StringBuilder("Vector elements: ");
		a3.iterator().forEachRemaining(k -> logMessage.append(k).append(" "));
		logger.info("Displaying Vector Elements");
		logger.info(logMessage.toString());
		
		
		/**
		 	we can display this data by using below folling way
			* a3.iterator().forEachRemaining(k-> System.out.print(k+" "));
			* a3.spliterator().forEachRemaining(k-> System.out.print(k+" "));
		 	* a3.listIterator().forEachRemaining(k->System.out.print(k+" "));
		*/

		logger.log(Level.FINE,"PriorityQueue Example Started..");
		Queue<Integer> q1=new PriorityQueue<>();
		logger.log(Level.INFO,"Elements Adding to PriorityQueue");
		q1.add(4);
		q1.add(5);
		q1.add(3);
		q1.add(1);
		q1.add(2);
		logger.log(Level.FINE,"Elements Added to PrioriryQueue Ended");
		String priorityQueue=q1.stream().map(String::valueOf).reduce("", (a,b)-> a.isEmpty()?b:a +", "+b);
		logger.log(Level.INFO,"Displaying PriorityQueue Elements");
		logger.info(priorityQueue);
		
		/**
		    we can display this data by using below folling way
			* q1.iterator().forEachRemaining(k->System.out.print(k+" "));
			* q1.spliterator().forEachRemaining(k -> System.out.print(k+" "));
			* q1.forEach(k-> System.out.print(k+" "));
		*/

		logger.fine("Array Deque Example Started..!");
		Queue<Integer> q2=new ArrayDeque<>();
		logger.info("Elements adding to ArrayDeque");
		q2.add(12);
		q2.add(10);
		q2.add(20);
		q2.add(9);
		q2.add(11);
		logger.info("Elements adding to ArrayDeque Ended");
		
		logger.info("Converting ArrayDeque to String");
		String arrayDeque=q2.stream().map(String::valueOf).reduce("",(a,b)-> a.isEmpty()?b:a+", "+b);
		logger.info("Displaying ArrayDeque Data ");
		logger.info(arrayDeque);
		/**
		 	we can display this data by using below folling way
			* q2.iterator().forEachRemaining(k->System.out.print(k+" "));
			* q2.spliterator().forEachRemaining(k -> System.out.print(k+" "));
			* q2.forEach(k-> System.out.print(k+" "));
		*/
	}

}
