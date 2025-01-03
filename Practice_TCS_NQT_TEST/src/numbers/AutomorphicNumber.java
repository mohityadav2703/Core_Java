// Automorphic Number means square of given number end with given number
//Ex :n=25; 25*25=625 =>Automorphic Number
//	  n=12; 12*12=144 =>Not Automorphic Number

package numbers;
import java.util.Scanner;

public class AutomorphicNumber {
	public static boolean isAutomorphic(int N) {
		int square = N*N;
		while (N>0) {
			//check if last digit is equal or not
			if(N%10 != square%10) 
				return false;
				N=N/10;
				square=square/10;
		}
		return true;
	}

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number");
		int n=sc.nextInt();
		if(isAutomorphic(n)==true) {
			System.out.println(n+" is Automorphic Number");
		}
		else {
			System.out.println(n+" is Not Automorphic Number");
		}
		sc.close();
	}
}
