import java.util.Scanner;

public class MelhorDivisor {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Insira numero: ");
		int value = input.nextInt();
		
		System.out.println(getDivisor(value));
		
	}
	public static int getDivisor(int num) {
		
		int sumNum = getSum(num);
		int i = 0;
		int best = num;
		int bestSum = sumNum;
		do {		
			i++;
			int sumI= getSum(i);	
			if(num%i==0 && (sumI >= bestSum)) {	
				
				best = sumI == bestSum && best<i?
						best:
							i;
				
				bestSum = sumI; 		
				
			}
			
		}while( (num/i != 2) && (i != num) );
		return best;
	}
	public static int getSum(int num ) {
		int sum = 0;	
		while(num != 0) {
			sum += num%10;
			num /= 10;
		}
		return sum;
	}
	
	
	
}
