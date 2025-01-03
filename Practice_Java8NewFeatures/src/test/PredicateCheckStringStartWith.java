// Check the String start with M

package test;
import java.util.function.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PredicateCheckStringStartWith {
	private static final Logger logger = Logger.getLogger(PredicateCheckStringStartWith.class.getName());

	public static void main(String[] args) {
		String[] str= {"Mohit","Nihit","Mohan","Chandan","Deepak","chillu"};
		Predicate<String> p = s -> s.charAt(0)=='M';
		logger.log(Level.INFO, "The String Starts With M Are :");
		for(String st : str) {
			if(p.test(st)) {
				logger.info(st+", ");
			}
		}
	}
}
