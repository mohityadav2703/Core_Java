package com.app.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class Student implements Comparable<Student>{
	private String stdName;
	private int rollNo;
	private int stdAge;
	private String stdGen;
	
	public static final String GENDER_MALE="Male";
	public static final String GENDER_FEMALE="Female";
	
	Student(String stdName, int rollNo, int stdAge, String stdGen){
		this.stdName=stdName;
		this.rollNo=rollNo;
		this.stdAge=stdAge;
		this.stdGen=stdGen;
	}

	public String getStdName() {
		return stdName;
	}

	public void setStdName(String stdName) {
		this.stdName = stdName;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public int getStdAge() {
		return stdAge;
	}

	public void setStdAge(int stdAge) {
		this.stdAge = stdAge;
	}

	public String getStdGen() {
		return stdGen;
	}

	public void setStdGen(String stdGen) {
		this.stdGen = stdGen;
	}

	//sort by age
	@Override
	public int compareTo(Student stdObj) {
		int compareAge=stdObj.getStdAge();
		return this.getStdAge()-compareAge;		// Ascending Order
	//	return compareAge-this.getStdAge();		// Descending Order
		
	}

	@Override
	public String toString() {
		return "Student [stdName=" + stdName + ", rollNo=" + rollNo + ", stdAge=" + stdAge + ", stdGen=" + stdGen + "]";
	}
}

public class ArrayListSortStudentUsingComparable {
	public static void main(String[] args) {
		ArrayList<Student> std=new ArrayList<>();
		std.addAll(Arrays.asList(
				new Student("ABC",101, 23,Student.GENDER_MALE),
				new Student("XYZ",102, 11,Student.GENDER_MALE),
				new Student("LMN",103, 22,Student.GENDER_FEMALE),
				new Student("KLM",104, 28,Student.GENDER_MALE),
				new Student("CAB",105, 14,Student.GENDER_FEMALE),
				new Student("BCA",106, 33,Student.GENDER_FEMALE),
				new Student("MCA",107, 26,Student.GENDER_MALE)
			));
		
	
			Collections.sort(std);
			for(Student st : std) {
				System.out.println(st);
			}
	}
}
