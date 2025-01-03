package com.app.stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamExample {
	public static void main(String[] args) {
		
		//get the customer information from collection object
		List<Customer> customerList=CustomerData.getCustomerData();
		
		//convert the collection data to stream object
		Stream<Customer> streamList=customerList.stream();
	
	//	System.err.println("====displaying data from collection object without using intermediate operation====");
		Consumer<Customer> customerConsumer=cust-> System.out.println(cust);
		customerList.forEach(customerConsumer);
	//	customerList.forEach(cust1-> System.out.println(cust1));
	
		System.err.println("====displaying data from stream object without using intermediate operation====");
		streamList.forEach(customerConsumer);
		//streamList.forEach(cust-> System.out.println(cust));

		System.err.println("====displaying data from stream object using intermediate operation====");
		Stream<Customer> streamList1=customerList.stream();
		Function<Customer,String> name=custName-> custName.getName();
		Stream<String> names=streamList1.map(name);
	//	Stream<String> name=streamList1.map(customerNames-> customerNames.getName());
		names.forEach(cust-> System.out.println(cust));
		
		Stream<Customer> streamList2=customerList.stream();
		Predicate<Customer> customerPredicate= custPredicate-> custPredicate.getLocation().equalsIgnoreCase("HYDERABAD");
		streamList2.filter(customerPredicate).forEach(cust-> System.out.println(cust));
		
		Stream<Customer> streamList3=customerList.stream();
		Stream<String> name1=streamList3.map(custName -> custName.getName());
		Predicate<String> lenth=st-> st.length()<=6;
		name1.filter(lenth).forEach(cust -> System.out.println(cust));
		
		System.err.println("=======MAP()=======");
		//Collection Data
		List<Integer> numberList=Arrays.asList(1,2,3,4,5,6,7,8,9);
		//Collection Data Convert to Stream Data
		Stream<Integer> numberStream=numberList.stream();
		
		Function<Integer,Integer> IntegerFuntion=no-> no * no;
		Predicate<Integer> IntegerPredicate=no -> no > 9;
		Consumer<Integer> IntegerConsumer=st -> System.out.print(st+" ");
		
		//apply the map() and filter() and forEach()
		numberStream.map(IntegerFuntion).filter(IntegerPredicate).forEach(IntegerConsumer);
		
	}
}
