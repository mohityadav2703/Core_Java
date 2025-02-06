package test;

public class EvenOddPrimeNumber extends Thread {
	public static void main(String[] args) throws InterruptedException {
		int[] a = { 1, 15, 3, 2, 27, 14, 12, 11, 20, 23, 16, 9, 5 };
		int even = 0, odd = 0, prime = 0;

		for (int i = 0; i < a.length; i++) {
			int temp = 0;
			if (a[i] % 2 == 0) {
				even++;
				System.out.println("Even Number :" + a[i]);
				Thread.sleep(1000);
			} else {
				odd++;
				System.out.println("Odd Number :" + a[i]);
				Thread.sleep(1000);
			}
			for (int j = 2; j < a[i]; j++) {
				if (a[i] % j == 0) {
					temp = temp + 1;
				}
			}
			if (temp == 0) {
				prime++;
				System.out.println("Prime Number :" + a[i]);
				Thread.sleep(1000);
			}
		}
		System.out.println("Total Number of Even :" + even);
		Thread.sleep(2000);
		System.out.println("Total Number of Odd :" + odd);
		Thread.sleep(2000);
		System.out.println("Total Number of Prime :" + prime);
		Thread.sleep(2000);
	}

}
