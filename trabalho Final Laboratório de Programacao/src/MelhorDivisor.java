import java.util.Scanner;

public class MelhorDivisor {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Insira numero: ");
		int value = input.nextInt();
		
		System.out.println(getDivisor(value));
		
	}
	public static int getDivisor(int num) {
		int sumNum =num%10 + num/10;
		int i = 0;
		int best = num;
		int bestSum = sumNum;
		do {		
			i++;
			int sumI= (i/10)+i%10;					
			if(num%i==0 && (sumI >= bestSum)) {	
				
				best = sumI == bestSum && best<i?
						best:
							i;
				
				bestSum = sumI; 		
				
			}
			
		}while( (num/i != 2) && (i != num) );
		return best;
	}
	
	
}
