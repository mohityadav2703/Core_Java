//program to print half of string in lower and half in upper

package test;

public class HalfOfStringInUpperAndHalfLower {
	
	public static void main(String[] args) {
		String str="Hello This is Java Program";
		int mid=str.length()/2;
		String lower="";
		String upper="";
		
		for(int i=0;i<str.length();i++) {
			if(i<mid) {
				lower=lower+Character.toLowerCase(str.charAt(i));
			}
			else {
				upper=upper+Character.toUpperCase(str.charAt(i));
			}
		}
		System.out.println("Total length of String :"+str.length());
		System.out.println("Length of Lower :"+lower.length());
		System.out.println("Length of Upper :"+upper.length());
		System.out.println(lower+upper);
	}
}
