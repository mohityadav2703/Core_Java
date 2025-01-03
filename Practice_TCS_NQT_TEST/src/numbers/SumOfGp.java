//Formula of Gp : (a*(r^(n-1)))/r-1

package numbers;

import java.util.Scanner;

public class SumOfGp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The First Number of Gp Series");
		float a = sc.nextFloat();
		System.out.println("Enter The Common Ration of Gp Series");
		float r = sc.nextFloat();
		System.out.println("Enter The Total Size Of Gp Series");
		int n = sc.nextInt();
		
		float sumOfGp= (float) (a*(Math.pow(r, n-1)))/(r-1);
		System.out.println(sumOfGp);
		sc.close();
	}
}
