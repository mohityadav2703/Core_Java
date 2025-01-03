//Program to check Last character of string end with 'a'

package test;
import java.util.function.Predicate;
import java.util.logging.Logger;

public class PredicateCheckStringEndWith {

	private static final Logger logger = Logger.getLogger(PredicateCheckStringEndWith.class.getName());
	
	public static void main(String[] args) {
		String[] s= {"India","Nepal","Bhutan","Srilanka","Maldiv","Mayanmar"};
		Predicate<String> p = st -> st.charAt(st.length()-1)=='a';
		logger.info("The String End With 'A' Are :");
		for(String str : s) {
			if(p.test(str)) {
				logger.info(str);
			}
		}
	}
}
