package com.app.stream;

import java.util.Arrays;
import java.util.List;

public class CustomerData {
	
	public static List<Customer> getCustomerData(){
		//creating address class object
		Address homeAddress=new Address("1-2-3","ABC STREET","HYDERABAD");
		Address officeAddress=new Address("3-2-1","XYZ STREET","MUMBAI");
	
		//creating customer class object
		Customer customer1=new Customer(1,"MOHIT","HYDERABAD","XNXX@GMAIL.COM","9128441424",Arrays.asList(homeAddress,officeAddress));
		Customer customer2=new Customer(2,"APURVA","PATNA","XNXX@GMAIL.COM","7778239212",Arrays.asList(homeAddress,officeAddress));
		Customer customer3=new Customer(3,"SONALI","PATNA","XVIDEOS@GMAIL.COM","9128441424",Arrays.asList(homeAddress,officeAddress));
		Customer customer4=new Customer(4,"SATRUDHAN","HYDERABAD","XVIDEOS@GMAIL.COM","9876543321",Arrays.asList(homeAddress,officeAddress));
		Customer customer5=new Customer(5,"RAJEEV RANJAN29","MUMBAI","INDIANPORN@GMAIL.COM","7862014374",Arrays.asList(homeAddress,officeAddress));
		Customer customer6=new Customer(6,"SONI DARLING","PATNA","XXX@GMAIL.COM","6290541237",Arrays.asList(homeAddress,officeAddress));
		Customer customer7=new Customer(7,"RAJEEV RANJAN42","MUMBAI","EPORNER@GMAIL.COM","8873261290",Arrays.asList(homeAddress,officeAddress));
		Customer customer8=new Customer(8,"RAUSHAN PANDIT","DELHI","XHAMSTER@GMAIL.COM","7644239087",Arrays.asList(homeAddress,officeAddress));
		Customer customer9=new Customer(9,"RUPA BHAUJI","DELHI","PORNHUB@GMAIL.COM","9999222787",Arrays.asList(homeAddress,officeAddress));
		
		return Arrays.asList(customer1,customer2,customer3,customer4,customer5,customer6,customer7,customer8,customer9);
	}

}
