package p2;
import p1.Product;
import java.util.*;
import java.util.stream.*;
public class DemoStream2 {

	public static void main(String[] args) {
		ArrayList<Product> al=new ArrayList<Product>();
		al.add(new Product("A111","MOUSE",1200,12));
		al.add(new Product("A112","KEYBOARD",1700,5));
		al.add(new Product("A113","PROCESSOR",12000,2));
		al.add(new Product("A114","SSD",5000,9));
		al.add(new Product("A115","RAM",2000,1));
		al.add(new Product("A116","FDD",600,6));
		System.out.println("======ProductDetails======");
		al.forEach((k)->System.out.println(k));
		
		System.out.println("======ProductQty<10=======");
		Stream<Product> sm1=al.stream();
		sm1.filter((x)->x.qty<7).forEach((k)->System.out.println(k));
		
		Stream<Product> sm2=al.stream();
		sm2.map((x)->x.price-(x.price*0.02f)).forEach((k)->System.out.println(k));
		System.out.println("======Product totalValue======");
		Stream<Product> sm3=al.stream();
		System.out.println(sm3.map((x)->x.price-(x.price*0.02f)).reduce((sum,i)->sum+i));
	}

}
