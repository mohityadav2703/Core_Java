// print the String whose length is greater than 5.

package test;

import java.util.function.Predicate;

public class Predicate_LengthOfString {
	public static void main(String[] args) {
		String[] str= {"India","Russia","Isarail","France","UAE","Srilanka","Nepal"};
		Predicate<String> p = st -> st.length()>5;
		
		for(String s :str) {
			if(p.test(s)) {
				System.out.print(s+" ");
			}
		}
	}

}
