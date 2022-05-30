import java.util.Scanner;

public class program {
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
//		System.out.println("Quantas voltas vc deseja? ");
//		int rep = leitor.nextInt();
		int rep = 5;
		System.out.println("Serão" + rep + "voltas!!!");
		
		
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
		
		vetor3[0] = vetor1[0] + vetor1[2] + vetor1[4];
		
		vetor2[1] = vetor2[1] + vetor2[3];
		System.out.println("Par: " + vetor3[0]);
		System.out.println("Impar: " + vetor3[1]);		
		
		leitor.close();
		
	}
}