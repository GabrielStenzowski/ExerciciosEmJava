import java.util.Scanner;

public class program {
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Quantos numeros deseja ler ?");
		int repeticao = leitor.nextInt();
		

		int contador = 0;	
		int numero[] = new int[repeticao];		
		
		System.out.println("Numero que � igual a: ");
		int indice = leitor.nextInt();
		
		for (int i = 0; i < numero.length; i++) {
			System.out.println("Escreva alguns numeros: ");
			numero[i] = leitor.nextInt();
			if(numero[i] > indice) {
				System.out.println(numero[i] + "� menor que " + indice);
				}					
		
			}
		
		for (int i1 = 0; i1 < numero.length; i1++) {
				if(numero[i1] == indice) {
					contador++;			
				}		
			}			
		
		System.out.println("O numero " + indice + " apareceu " + contador + "vezes");
		leitor.close();
		
	}
	
}
		
		
		

					

	
