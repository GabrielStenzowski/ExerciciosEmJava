import java.util.Scanner;


public class program {
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Realizando a Operação an = a1 + (n – 1) * r");
		System.out.println("Digite o valor das respectivas letras!!!");
		System.out.println();
		
		System.out.println("Valor de A1");
		double a1 = leitor.nextDouble();
		System.out.println("Valor de N");
		double n = leitor.nextDouble();
		System.out.println("Valor de R");
		double r = leitor.nextDouble();
		

		double resul = a1 + (n - 1) * r;	

			
			System.out.println("Resultado: " + resul);

	
		leitor.close();
			
		}	
	
		
}

