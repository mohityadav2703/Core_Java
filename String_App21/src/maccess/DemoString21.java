package maccess;
import java.util.*;
public class DemoString21 {
	public static void main(String[] args) {
		System.out.println("*******StringJoiner1********");
		StringJoiner sj1 = new StringJoiner("/");
		sj1.setEmptyValue("Date Not Available...");
		System.out.println("--------Before Adding---------");
		System.out.println("User DOB :"+sj1.toString());
		System.out.println("--------After Adding----------");
		sj1.add("11");
		sj1.add("August");
		sj1.add("2000");
		System.out.println("User DOJ :"+sj1.toString());
		StringJoiner sj2 = new StringJoiner("-");
		System.out.println("********StringJoiner2*********");
		sj2.add("17");
		sj2.add("October");
		sj2.add("1995");
		System.out.println("User DOB :"+sj2.toString());
		System.out.println("********After merge()********");
		sj1.merge(sj2);
		System.out.println("User DOB :==>"+sj1.toString());
		System.out.println("Length :"+sj1.length());
		
	}

}
