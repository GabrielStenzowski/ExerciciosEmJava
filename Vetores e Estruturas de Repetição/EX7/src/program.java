import java.util.Scanner;

public class program {
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
//		System.out.println("Quantas voltas vc deseja? ");
//		int rep = leitor.nextInt();
		
		System.out.println("Ser?o 5 voltas!!!");
		int rep = 5;
		
		double vetor1[] = new double[rep];
		double vetor2[] = new double[rep];
		
		
		System.out.println("Primeiro vetor ");
		for (int i = 0; i < vetor1.length; i++) {
			System.out.println("Digite o numero " + (i+1) + ":");
			vetor1[i] = leitor.nextDouble();
		}
		
		System.out.println("Segundo vetor ");
		for (int i = 0; i < vetor2.length; i++) {
			System.out.println("Digite o numero " + (i+1) + ":");
			vetor2[i] = leitor.nextDouble();
		}
		
		if(vetor1[0] == vetor2[0] && vetor1[1] == vetor2[1] && vetor1[2] == vetor2[2] && vetor1[3] == vetor2[3] && vetor1[4] == vetor2[4]) {
			System.out.println("Deu bom, pode ir embora");
		}
		
		else {
			System.out.println("Deu ruim, tente novamente");
		}
		
		leitor.close();
		
	}
}
