import java.util.Scanner;


public class program {
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Media Aritmetica de 3 notas!!");
		System.out.println();
		
		System.out.println("Valor da Nota1");
		double nota1 = leitor.nextDouble();
		System.out.println("Digite o Peso da Nota1");
		double peso1 = leitor.nextDouble();
		
		
		System.out.println("Valor da Nota2");
		double nota2 = leitor.nextDouble();
		System.out.println("Digite o Peso da Nota2");		
		double peso2 = leitor.nextDouble();
		
		System.out.println("Valor da Nota3");
		double nota3 = leitor.nextDouble();
		System.out.println("Digite o Peso da Nota3");
		double peso3 = leitor.nextDouble();
		

		double resulnota = (nota1 * peso1) + (nota2 * peso2) + (nota3 * peso3);
		double resulpeso = peso1 + peso2 + peso3;
		double resul = resulnota / resulpeso;
				
		System.out.println("Sua media é: " + resul);	
		

	
		leitor.close();
			
		}	
	
		
}

