import java.util.Scanner;

public class program {
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		int repeticao = 5;
		
		int numero[] = new int[repeticao];
		
		int media = 0;
		
		for (int i = 0; i < numero.length; i++) {
			System.out.println("Escreva os numeros para o calculo da media: ");
			numero[i] = leitor.nextInt();			
			media = media + numero[i];			
		}
		
		media = media/repeticao;
		System.out.println("Sua media ?: " + media);
		System.out.println("Numeros maiores ou iguais s?o: ");
		
		for (int i = 0; i < numero.length; i++) {
			if(numero[i] >= media) {
				System.out.println(numero[i]);
			}
			
		}
		
		leitor.close();
	
	}
	
	
}
