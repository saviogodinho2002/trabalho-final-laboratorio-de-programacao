import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class CrivodeEratóstenes {

	public static void main(String[] args) {
		List<Integer> listOfNumbers = new ArrayList<>();
		
		System.out.println("Escreva um numero: ");
		Scanner input =  new Scanner(System.in);
		
		int biggerValue = input.nextInt();
		
		int biggerValueToCheck = (int) Math.round(Math.sqrt(biggerValue));
		
		System.out.println(biggerValueToCheck);
		
		gerateNumbersOnList(listOfNumbers, biggerValue);
		
		for(int i =0;listOfNumbers.get(i)<=biggerValueToCheck;i++) {
			removeMultiples(listOfNumbers, listOfNumbers.get(i));
		}
		

	}
	private static void gerateNumbersOnList(List<Integer> list,int limitValue) {
		list.clear();
		for(int i=2;i<=limitValue+2;i++) {
			list.add(i);
		}	
	}
	private static void removeMultiples(List<Integer> list,int multiple) {
		Iterator iteratorList = list.iterator();
		
		while (iteratorList.hasNext())
        {
            int i = (Integer)iteratorList.next();
            if( i != multiple && i%multiple == 0 ) {
				iteratorList.remove();
			}
        }
			
	}
	

}