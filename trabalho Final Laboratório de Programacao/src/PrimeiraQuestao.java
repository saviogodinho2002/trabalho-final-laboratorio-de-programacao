import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class PrimeiraQuestao {
	public static void main(String[] args) {
		List<Integer> listArray = new ArrayList<>();
		List<Integer> listLinked = new LinkedList<>();
		
		int n =1000000;
		
		int biggerValueToCheck = (int) Math.sqrt(n);
		
		for (int i = 2; i < n+2; i++) {
			listArray.add(i);
			listLinked.add(i);
		}
		
		long timeArrayList = System.currentTimeMillis();
		for(int i =0;listArray.get(i)<=biggerValueToCheck;i++) {
			mergeArray(listArray, listArray.get(i));
		}
		
		timeArrayList = System.currentTimeMillis() - timeArrayList;
		
		
		
		long timeLinkedList = System.currentTimeMillis();
		
		for(int i =0;listLinked.get(i)<=biggerValueToCheck;i++) {
			removeMultiples(listLinked, listLinked.get(i));
		}
		
		timeLinkedList = System.currentTimeMillis() -timeLinkedList;
		
		System.out.println(timeArrayList);
		System.out.println(timeLinkedList);
		
		
		
	}
	
	private static List<Integer> removeMultiples(List<Integer> list,int multiple) {
			Iterator iteratorList = list.iterator();
			
			while (iteratorList.hasNext())
		    {
		        int i = (Integer)iteratorList.next();
		        if( i != multiple && i%multiple == 0 ) {
					iteratorList.remove();
				}
		    }
			return list;
		}
	private static void mergeArray(List<Integer> list, int multiple){
		List<Integer> metade1 =  new ArrayList<Integer>((list.size()/2));
		List<Integer> metade2 = new ArrayList<Integer>( (list.size()-(list.size()/2)));;	
		for (int i = 0; i < (list.size()/2)-1; i++) {
			metade1.add(list.get(i));
			metade2.add(list.get((list.size()-(list.size()/2))+i ));
		}
		list.clear();
		list.addAll(removeMultiples(metade1, multiple));
		list.addAll(removeMultiples(metade2, multiple));
			
	}
}
