import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("ENTRADA");
		
		Scanner input = new Scanner(System.in);
		
		int numOfOperations = input.nextInt();
		
		int[] jarrosA = new int[numOfOperations];
		int[] jarrosB = new int[numOfOperations];
		int[] jarrosN = new int[numOfOperations];
		
		for(int i=0;i<numOfOperations;i++) {
			
			jarrosA[i] =  input.nextInt();
			jarrosB[i] =  input.nextInt();
			jarrosN[i] =  input.nextInt();
			
		}
		System.out.println("\nSAIDA");
		for(int i=0;i<numOfOperations;i++) {	
			
			System.out.println("===");
			System.out.println(jarrosA[i]+" "+ jarrosB[i]+" "+ jarrosN[i]);
			findResult(jarrosA[i], jarrosB[i], jarrosN[i]);
			
		}
	
	}
	public static void findResult(int maxLitersA, int maxLitersB, int n) {
		Jarro a, b;
		a = new Jarro(maxLitersA);
		b = new Jarro(maxLitersB);
		
		if(n%2!=0 || (n > maxLitersA && n > maxLitersB) ) { 
			System.out.println("SEM SOLUÇÃO");
			return;
		}
		
		int i =0;
		
		if( n%b.getMaxLiters()!=0 ) {
			
			while((a.getLiters() != n)&& (b.getLiters() != n) ) {
				
				switch (i) {
				case 0:
					toFillJarro(a);
					System.out.println("Enche A --> A = "+a.getLiters());
					break;
				case 1:
					transferWater(a, b);
					System.out.println("Transfere de A para B --> A = "+a.getLiters()+", B = "+b.getLiters());
					break;
				case 2:
					toEmptyJarro(b);
					System.out.println("Esvazia B --> B = "+b.getLiters());
					break;
				case 3:
					transferWater(a, b);
					System.out.println("Transfere de A para B --> A = "+a.getLiters()+", B = "+b.getLiters());
					i= -1;
					break;
				default:
					i= -1;
					break;
					
				}
				i++;
				
			}
		}else {
			while( (a.getLiters() != n) && (b.getLiters() != n)) {
				
				switch (i) {
				case 0:
					toFillJarro(b);
					System.out.println("Enche B --> B = "+b.getLiters());
					break;
				case 1:
					transferWater(b, a);
					System.out.println("Transfere de B para A --> A = "+a.getLiters()+", B = "+b.getLiters());
					break;
				case 2:
					toFillJarro(b);
					System.out.println("Enche B --> B = "+b.getLiters());
					break;
				case 3:
					transferWater(b, a);
					System.out.println("Transfere de B para A --> A = "+a.getLiters()+", B = "+b.getLiters());
					i= -1;
					break;
				default:
					i= -1;
					break;
					
				}
				i++;				
			}
		}
	}

	public static boolean toFillJarro(Jarro jarro) {
		if (jarro.isFull())
			return false;
		jarro.setLiters(jarro.getMaxLiters());
		return true;

	}

	public static boolean toEmptyJarro(Jarro jarro) {
		if (jarro.isEmpty())
			return false;
		jarro.setLiters(0);
		return true;
	}

	public static boolean transferWater(Jarro fromJarro, Jarro toJarro) {


		int toJarroFree = toJarro.getMaxLiters() - toJarro.getLiters();

		int waterToTransfer = fromJarro.getLiters() - toJarroFree;

		if (waterToTransfer > 0) {
			fromJarro.setLiters(fromJarro.getLiters() - toJarroFree);
			toJarro.setLiters(toJarro.getMaxLiters());
		} else {
			toJarro.setLiters(toJarro.getLiters() + fromJarro.getLiters());
			fromJarro.setLiters(0);
		}
		return true;

	}

}
