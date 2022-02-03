import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int numOfOperations = input.nextInt();
		
		int[] a = new int[numOfOperations];
		int[] b = new int[numOfOperations];
		int[] n = new int[numOfOperations];
		
		for(int i=0;i<numOfOperations;i++) {
			
			a[i] =  input.nextInt();
			b[i] =  input.nextInt();
			n[i] =  input.nextInt();
			
		}
		
		for(int i=0;i<numOfOperations;i++) {	
			
			System.out.println(fibonacci(a[i], b[i], n[i]));
			
		}		
	}
	private static int fibonacci(int a,int b,int n) {
		if(n==1) return b;
		return fibonacci(b, (a+b), (n-1));
	}

}
