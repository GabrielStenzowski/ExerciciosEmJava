import java.util.Scanner;

public class program {
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Quantas voltas vc deseja? ");
		int rep = leitor.nextInt();
		
		double numero[] = new double[rep];
		double peso[] = new double[rep];
		
		

		for (int i = 0; i < rep; i++) {
			System.out.println("Escreva o peso " + (i+1) + ": ");
			peso[i] = leitor.nextDouble();
		}
		
		for (int i = 0; i < rep; i++) {
			System.out.println("Escreva a nota " + (i+1) + ":");
			numero[i] = leitor.nextDouble();
		}
		
		double notapeso = 0;
		for (int i = 0; i < rep; i++) {
			notapeso += numero[i] * peso[i];
		}
		
		double pesopeso = 0;
		for (int i = 0; i < rep; i++) {
			pesopeso = peso[i];
		}
		
		notapeso = notapeso/pesopeso;
		
		System.out.println(notapeso);
		
		leitor.close();
		
	}
}


