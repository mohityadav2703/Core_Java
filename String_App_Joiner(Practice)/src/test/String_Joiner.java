package test;

import java.util.StringJoiner;

public class String_Joiner {

	public static void main(String[] args) {
		System.out.println("String Joiner");
		StringJoiner sj1=new StringJoiner("/");
		sj1.setEmptyValue("Before String Joiner");
		System.out.println(sj1.toString());
		System.out.println("After String Joiner");
		sj1.add("17");
		sj1.add("october");
		sj1.add("1998");
		System.out.println(sj1.toString());
		
		StringJoiner sj2=new StringJoiner("-");
		sj2.add("11");
		sj2.add("august");
		sj2.add("2000");
		System.out.println(sj2.toString());
		
		System.out.println("After Merge");
		sj1.merge(sj2);
		System.out.println(sj1.toString());
		
	
	}

}
