import java.util.Scanner;

public class program {
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Quantas Voltas? ");
		//int voltas = leitor.nextInt();
		
		int voltas = 5;
		
		
		double temp = 0;
		double a[] = new double[voltas];

		System.out.println("Escreva os numeros em ordem CRESCENTE!!!!!");
		for (int i = 0; i < a.length; i++) {
			System.out.println((i+1) + "? numero");			
			a[i] = leitor.nextInt();
			if (a[i] <= temp) {
				System.out.println("Numero na ordem invalida, leia o enunciado!!!");
				a[i] = temp;
				i--;
			} else {
				temp = a[i];
			}
		
		}		
		for (int i = 0; i < a.length; i++) {
			 System.out.print(a[i] + " / ");
		}
		leitor.close();		
	}
}
