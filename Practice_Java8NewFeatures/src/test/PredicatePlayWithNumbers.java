package test;
import java.util.function.Predicate;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PredicatePlayWithNumbers {
	private static final Logger logger = Logger.getLogger(PredicatePlayWithNumbers.class.getName());
	public static void main(String[] args) {
		int[] x= {0,5,10,15,20,25,30};
		
		Predicate<Integer> p1 = a-> a>10;
		Predicate<Integer> p2 = a -> a%2==0;
		
		logger.log(Level.INFO, "The Numbers Which is Greater Than 10 Are :");
		m1(p1,x);	
		
		logger.log(Level.INFO, "\nThe Number Which are Even Are :");
		m1(p2,x);
		
		logger.log(Level.INFO, "\nThe Number Which Are Greater Than 10 And Which is Even Are :");
		m1(p1.and(p2),x);
		
		logger.log(Level.INFO, "\nThe Number Which Is Greater Than 10 Or Even Is :");
		m1(p1.or(p2),x);
		
		logger.log(Level.INFO, "\nThe Number Which Is Less Than 10 Are :");
		m1(p1.negate(),x);
	}
	
	public static void m1(Predicate<Integer> p, int[] x) {
		for(int x1 : x) {
			if(p.test(x1)) {
				logger.info(x1+" ");
			}
		}
	}
}
