import java.util.Scanner;

public class program {
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Quantas voltas deseja?");
		// int voltas = leitor.nextInt();
		int voltas = 5;
		
		
		double a[] = new double[voltas];
		
		double temp = 0;
		double temp2 = 0;
		
		for (int i = 0; i < voltas; i++) {
			System.out.println("Numero: ");
			a[i] = leitor.nextDouble();
			
			if((i + 1) == voltas) {
			temp = a[i];
			}	
			
		}
		
		
		for (int i = 0; i < voltas; i++) {
			temp2 = a[i];
			a[i] = temp;
			temp = temp2;
		}
		
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

			
			
		leitor.close();
		
	}
}
