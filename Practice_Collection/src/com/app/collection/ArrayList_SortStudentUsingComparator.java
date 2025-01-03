package com.app.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

class Student1 {
	private String stdName;
	private int stdRoll;
	private int stdAge;
	private String stdGender;

	Student1(String stdName, int stdRoll, int stdAge, String stdGender) {
		this.stdName = stdName;
		this.stdRoll = stdRoll;
		this.stdAge = stdAge;
		this.stdGender = stdGender;
	}

	public String getStdName() {
		return stdName;
	}

	public void setStdName(String stdName) {
		this.stdName = stdName;
	}

	public int getStdRoll() {
		return stdRoll;
	}

	public void setStdRoll(int stdRoll) {
		this.stdRoll = stdRoll;
	}

	public int getStdAge() {
		return stdAge;
	}

	public void setStdAge(int stdAge) {
		this.stdAge = stdAge;
	}

	public String getStdGender() {
		return stdGender;
	}

	public void setStdGender(String stdGender) {
		this.stdGender = stdGender;
	}

	/* Comparator for sorting the list by student name */
	public static Comparator<Student1> stdNamecomparator = new Comparator<Student1>() {
		public int compare(Student1 s1, Student1 s2) {
			String stdName1 = s1.getStdName().toUpperCase();
			String stdName2 = s2.getStdName().toUpperCase();

			return stdName1.compareTo(stdName2); // AscendingOrder
			// return stdName2.compareTo(stdName1); //DescendingOrder
		}
	};

	/* Comparator for Sorting the list by student Roll No */
	public static Comparator<Student1> stdRollNoComaparator = new Comparator<Student1>() {
		public int compare(Student1 s1, Student1 s2) {
			int rollNo1 = s1.getStdRoll();
			int rollNo2 = s2.getStdRoll();

			// return rollNo1-rollNo2; //AscendingOrder
			return rollNo2 - rollNo1;  //DescendingOrder
		}
	};

	@Override
	public String toString() {
		return "[stdName=" + stdName + ", stdRoll=" + stdRoll + ", stdAge=" + stdAge + ", stdGender="
				+ stdGender + "]";
	}
}

public class ArrayList_SortStudentUsingComparator {
	public static void main(String[] args) {
		ArrayList<Student1> std = new ArrayList<Student1>();
		std.addAll(Arrays.asList(
				new Student1("ABC", 101, 24, "Female"), 
				new Student1("XYZ", 102, 20, "male"),
				new Student1("LMN", 103, 33, "male"), 
				new Student1("CBI", 104, 11, "Female"),
				new Student1("BCA", 105, 26, "Female"), 
				new Student1("MCA", 106, 31, "Female"),
				new Student1("MBA", 107, 18, "male"), 
				new Student1("KLM", 108, 61, "Female")));

		/* Sorting based on Student Name */
		System.err.println("Student Name Sorting In AscendingOrder :");
		Collections.sort(std, Student1.stdNamecomparator);
		for(Student1 str : std) {
			System.out.println(str);
		}
		System.out.println();
		
		/* Sorting Based on Student RollNo */
		System.err.println("Student RollNo Sorting In DescendingOrder :");
		Collections.sort(std, Student1.stdRollNoComaparator);
		for(Student1 str : std) {
			System.out.println(str);
		}
	}
}
