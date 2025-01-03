package test;

class Display_2{
	public static void displaynum() {
		for(int i=1;i<=10;i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException ie) {
				ie.printStackTrace();
			}
		}
	}
	
	public static void displaychar() {
		for(int i=65;i<=75;i++) {
			System.out.println((char)i);
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException ie) {
				ie.printStackTrace();
			}
		}
	}
}


public class Synchronized_ClassLavelLock {
	public static void main(String[] args) {
		
	}
}
