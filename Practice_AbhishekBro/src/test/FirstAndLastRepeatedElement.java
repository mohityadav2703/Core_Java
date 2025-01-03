package test;

import java.util.HashSet;
import java.util.Set;

public class FirstAndLastRepeatedElement {
	public static void main(String[] args) {
		int[] a= {10,45,67,3,2,45,6,67};

		System.out.println("First Repeated Number :"+firstRepeatedNumber(a));
		System.out.println("Last Repeated Number  :"+lastRepeatedNumber(a));
	}	
	public static Integer firstRepeatedNumber(int[] a) {
		Set<Integer> uniqueNumber = new HashSet<>();
		Integer lastRepeated=null;
		for(int num : a) {
			if(!uniqueNumber.add(num)) {
				return num;
			}
			lastRepeated=num;
		}
		return null; //no duplicate found
	}
	
	public static Integer lastRepeatedNumber(int[] a) {
		Set<Integer> uniqueNum = new HashSet<>();
		Integer lastRepeated=null;
		for(int num : a) {
			if(!uniqueNum.add(num)) {
				lastRepeated=num;
			}
			uniqueNum.add(num);
		}
		return lastRepeated;
	}
}