import java.util.Scanner;

public class program {
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
//		System.out.println("Quantas voltas vc deseja? ");
//		int rep = leitor.nextInt();
		int rep = 5;
		System.out.println("Ser�o" + rep + "voltas!!!");
		
		
		String vetor1[] = new String[rep];
		String vetor2[] = new String[rep];
		String vetor3[] = new String[rep];
		
		for (int i = 0; i < rep; i++) {
			System.out.println("Valor" + (i+1) + ":");
			vetor1[i] = leitor.next();
		}
		
		for (int i = 0; i < rep; i++) {
			System.out.println("Valor" + (i+1) + ":");
			vetor2[i] = leitor.next();
		}
		
		
		System.out.println("Concatena��o: ");
		for (int i = 0; i < rep; i++) {			
			vetor3[i] = vetor1[i] + ""+ vetor2[i];
			System.out.println(vetor3[i]);
		}
		
		leitor.close();
		
	}
}