package test;

import java.util.function.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Scanner;

class User{
	String username;
	String password;
	
	User(String username, String password){
		this.username=username;
		this.password=password;
	}
}


public class PredicateUserPassword {
	private static final Logger logger = Logger.getLogger(PredicateUserPassword.class.getName());
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		logger.log(Level.INFO, "Enter UserName :");
		String username=sc.next();
		logger.log(Level.INFO, "Enter Password :");
		String password =sc.next();
		
		User user1=new User(username,password);
		Predicate<User> p =user-> user.username.equals("Mohit") && user.password.equals("Mohit@123");
		if(p.test(user1)) {
			logger.log(Level.INFO, "You Are Valid User And You Can Access All The Services...");
		}
		else {
			logger.log(Level.INFO, "Invalid Creadentials... Please Try Again");
		}
		
		sc.close();
	}
}
