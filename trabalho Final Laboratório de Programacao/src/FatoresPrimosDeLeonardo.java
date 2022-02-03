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
		
		long multiplyOfPrimos = 1;
		int i = 1;
		long tempMultply = 1;

		while (tempMultply <= value) {

			i++;
			if ((i == 2 || i == 3 || i == 5 || i == 7) || (i % 2 != 0 && i % 3 != 0 && i % 5 != 0 && i % 7 != 0)) {
				tempMultply *= i;

				if (tempMultply <= value) {
					multiplyOfPrimos = tempMultply;
					
					if (i != 1)
						listOfPrimos.add(i);
				}

			}

		}

		return listOfPrimos;
	}

}
