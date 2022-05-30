import java.util.Scanner;

public class program {
	public static void main(String[] args) {
		
		double vetor[] = new double[5];
		
		Scanner leitor = new Scanner(System.in);
		
		for (int i = 0; i < vetor.length; i++) {
			
			System.out.println("Escreva o " + (i+1) + "numero: ");
			
			vetor[i] = leitor.nextDouble();
			
			System.out.println(vetor[i]);						
		}
		
		System.out.println("Numeros Positivos: ");
		for (int i = 0; i < vetor.length; i++) {
			if(vetor[i] > 0)
				System.out.println(vetor[i]);			
		}
		
		System.out.println("Numeros Negativos: ");
		for (int i = 0; i < vetor.length; i++) {
			if(vetor[i] < 0) {
				System.out.println(vetor[i]);
			}
		}
		
		int zero = 0;
		
		for (int i = 0; i < vetor.length; i++) {
			if(vetor[i] == 0) {
				zero++;
			}			
		}
		
		System.out.println("Existem " + zero + "numeros igual a zero!!!!");
		
		leitor.close();
	}

}
