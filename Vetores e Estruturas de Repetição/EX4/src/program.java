import java.util.Scanner;

public class program {
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		int repeticao = 5;
		
		int numero[] = new int[repeticao];		
		
		System.out.println("Numero menor a: ");
		int indice = leitor.nextInt();
		
		for (int i = 0; i < numero.length; i++) {
			System.out.println("Escreva alguns numeros: ");
			numero[i] = leitor.nextInt();
			if(numero[i] > indice) {
				System.out.println(numero[i] + "? menor que " + indice);
			}
		}
		
		leitor.close();
	
	}
	
	
}
