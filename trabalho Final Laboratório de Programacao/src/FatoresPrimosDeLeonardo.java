import java.util.*;

public class FatoresPrimosDeLeonardo {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		long value = input.nextLong();

		System.out.println(getFactPrimos(value));
		
	}

	private static List<Integer> getFactPrimos(long value) {
		List<Integer> listOfPrimos = new ArrayList<>();

		if (value == 2 || value == 3 || value == 5) {
			listOfPrimos.add((int) value);
			return listOfPrimos;
		}
		
		int i = 1;
		
		long tempMultply = 1;

		while (tempMultply <= value) {
			i++;
			int sumNum = getSum(i);
			if ((i == 2 || i == 3 || i == 5 || i == 7) || (i % 2 != 0 && sumNum % 3 != 0 && i % 5 != 0 && i % 7 != 0)) {
				tempMultply *= i;
				
				if (tempMultply <= value) {						
					listOfPrimos.add(i);
				}

			}

		}

		return listOfPrimos;
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
