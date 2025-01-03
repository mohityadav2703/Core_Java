package test;

import java.util.function.Function;

public class Greeting {
	public static void main(String[] args) {
		
		Function<String, Integer> lengthFunction= str -> str.length();
		System.out.println("String length :"+lengthFunction.apply("WelcomeToFunctionInterfaceExample"));
		
		Function<String,String> f1 = s -> s.replaceAll(" ", "");
		System.out.println("After Removing spaces :"+f1.apply("Hello this is Mohit Kumar"));
		
		Function<String, Integer> f2 = s-> s.length() - s.replaceAll(" ", "").length();
		System.out.println(f2.apply("Hello this is Mohit Kumar"));
	}
}
