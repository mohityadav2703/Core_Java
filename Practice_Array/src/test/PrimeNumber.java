package test;

public class PrimeNumber {
	public static void main(String[] args) {
		int[] no= {6,29,28,33,11,100,101,43,89};
		
		for(int i=0;i<no.length;i++) {
			int temp=0;
			for(int j=2;j<no.length-1;j++) {
				if(no[i]%j==0) {
					temp=temp+1;
				}
			}
			if(temp==0) {
				System.out.print(no[i]+" ");
			}
		}
	}

}
