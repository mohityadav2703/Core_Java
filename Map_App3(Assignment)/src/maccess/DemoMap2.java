package maccess;
import java.util.*;
import java.util.function.*;
import test.ProductValues;
public class DemoMap2 {
	public static void main(String[] args) {
		LinkedHashMap<String,ProductValues> ob=new LinkedHashMap<String,ProductValues>();
		ob.put(new String("A102"), new ProductValues("mouse",1200,12));
		ob.put(new String("E102"), new ProductValues("keyboard",1700,17));
		ob.put(new String("A109"), new ProductValues("CDR",1500,8));
		ob.put(new String("A115"),new ProductValues("FDD",400,19));      
		ob.put(new String("E106"),new ProductValues("FDD",120,1));
		System.out.println("=====ProductDetails=====");
		ob.forEach((k,v)->{
						System.out.println(k+"\t"+v);
					});
		BiPredicate<String,ProductValues> bp=(k,v)->
										{
											if(v.qty>=10)
												return true;
											else
												return false;
										};
				System.out.println("=======ProductDetails========");
				ob.forEach((k,v)->{
					if(bp.test(k, v))
						System.out.println(k+"\t"+v);
				});
	}

}
