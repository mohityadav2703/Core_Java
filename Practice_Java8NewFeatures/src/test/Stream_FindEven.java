//FindEven

package test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Stream_FindEven {
	public static void main(String[] args) {
		ArrayList<Integer> marks = new ArrayList<Integer>();
	    marks.add(30);
	    marks.add(40);
	    marks.add(22);
	    marks.add(51);
	    marks.add(70);
	    marks.add(27);
	    marks.add(11);
	    marks.add(32);
	    System.out.println("Original Marks :"+marks);
	    
	    ArrayList<Integer> list=new ArrayList<Integer>();
	    for(int i=1;i<=10;i++) {
	    	list.add(i);
	    }
	    
	    ArrayList<String> str=new ArrayList<String>();
	    str.add("Sunny Deol");
	    str.add("Kajal Agrawal");
	    str.add("Prabhash");
	    str.add("Anushka Shetty");
	    str.add("Mallika");
	    str.add("Katrina");
	    
	    //print even number
	    List<Integer> li = marks.stream().filter(i->i%2==0).collect(Collectors.toList());
	    System.out.println("Even Even :"+li);
	  
	    //print all the pass student which marks >35
	    List<Integer> pass = marks.stream().filter(i-> i>35).collect(Collectors.toList());
	    System.out.println("Pass Student :"+pass);

	    //arrange pass marks in ascending order
	    List<Integer> ascPass=marks.stream().filter(i-> i>35).sorted().collect(Collectors.toList());
	    System.out.println("Pass In Ascending 1-way :"+ascPass);
	    
	    List<Integer> ascPass1=marks.stream().filter(i-> i>35).sorted((i1,i2)-> i1.compareTo(i2)).collect(Collectors.toList());
	    System.out.println("Pass In Ascending 2-way :"+ascPass1);
	    
	    List<Integer> ascPass2=marks.stream().filter(i-> i>35).sorted((i1,i2)-> (i1>i2)?1 :(i1<i2)?-1 :0).collect(Collectors.toList());
	    System.out.println("Pass In Ascending 3-way :"+ascPass2);
	    
	    //arrange pass marks in descending order
	    List<Integer> descPass=marks.stream().filter(i-> i>35).sorted((i1,i2)->(i1 < i2)?1 :(i1> i2)?-1 :0).collect(Collectors.toList());
	    System.out.println("Pass in Descending 1-way :"+descPass);
	    
	    List<Integer> passDesc1=marks.stream().filter(i-> i>35).sorted((i1,i2)-> i2.compareTo(i1)).collect(Collectors.toList());
	    System.out.println("Pass in Descending 2-way :"+passDesc1);
	    
	    List<Integer> passDesc2=marks.stream().filter(i-> i>35).sorted((i1,i2)->  -i1.compareTo(i2)).collect(Collectors.toList());
	    System.out.println("Pass in Descending 3-way :"+passDesc2);
	    
	    //print the total number of pass student
	    long passNumber=marks.stream().filter(i-> i>35).count();
	    System.out.println("Total Pass :"+passNumber);
	    
	    //Print all the fail Student which marks < 35
	    List<Integer> fail = marks.stream().filter(i-> i<35).collect(Collectors.toList());
	    System.out.println("Fails Student :"+fail);
	    
	    //arrange fail marks in ascending order
	    List<Integer> failAsc=marks.stream().filter(i-> i<35).sorted().collect(Collectors.toList());
	    System.out.println("Fail in Ascending 1-way :"+failAsc);
	    
	    List<Integer> failAsc1=marks.stream().filter(i-> i<35).sorted((i1,i2) ->(i1>i2)?1 :(i1<i2)?-1 :0).collect(Collectors.toList());
	    System.out.println("Fail in Ascending 2-way :"+failAsc1);
	    
	    List<Integer> failAsc2=marks.stream().filter(i-> i<35).sorted((i1,i2)-> i1.compareTo(i2)).collect(Collectors.toList());
	    System.out.println("Fail in Ascending 3-way :"+failAsc2);
	    
	    List<Integer> failDesc1=marks.stream().filter(i-> i<35).sorted((i1,i2)-> (i1<i2)?1 :(i1>i2)?-1 :0).collect(Collectors.toList());
	    System.out.println("Fail in Descending 1-way:"+failDesc1);
	    
	    List<Integer> failDesc2=marks.stream().filter(i->i<35).sorted((i1,i2)->  -i1.compareTo(i2)).collect(Collectors.toList());
	    System.out.println("Fail in Descending 2-way:"+failDesc2);
	    
	    List<Integer> failDesc3=marks.stream().filter(i->i<35).sorted((i1,i2)-> i2.compareTo(i1)).collect(Collectors.toList());
	    System.out.println("Fail in Descending 3-way:"+failDesc3);
	    
	    //print the total number of fail student
	    long failNumber=marks.stream().filter(i-> i<35).count();
	    System.out.println("Total Fail :"+failNumber);
	    
	    
	    //add 5 with all elements
	    List<Integer> add=marks.stream().map(i->i+5).collect(Collectors.toList());
	    System.out.println("After Add 5 :"+add);
	    
	    //add 5 with all even number
	    List<Integer> add5even=marks.stream().filter(i-> i%2==0).map(i-> i+5).collect(Collectors.toList());
	    System.out.println("Add 5 With Even :"+add5even);
	    
	    System.err.println("==================================================================");
	    System.out.println("List Elements Are :"+list);
	  
	    // multiply element with their next element
	   List<Integer> lis=list.stream().map(i-> i*(i+1)).collect(Collectors.toList());
	   System.out.println("After multiply Elements Are :"+lis);
	   
	   //multiply list elements with 5
	   List<Integer> revMultiply=list.stream().map(i->i*5).collect(Collectors.toList());
	   System.out.println("Multiply with Reverse List :"+revMultiply);
	   
	   System.err.println("==================================================================");
	   System.out.println("String Elements Are :"+str);
	   
	   //arrange in ascending order
	   List<String> ascStr=str.stream().sorted().collect(Collectors.toList());
	   System.out.println("String in Ascending Order :"+ascStr);
	   
	   //arrange in descending order
	   List<String> descStr=str.stream().sorted((i1,i2)->i2.compareTo(i1)).collect(Collectors.toList());
	   System.out.println("String in Descending Order :"+descStr);
	   
	   //arrange String in ascending order based on length
	   
	   
	}
}
