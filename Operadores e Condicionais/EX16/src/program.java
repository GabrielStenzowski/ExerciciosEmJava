import java.util.Scanner;


public class program {
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Media Aritmetica de 3 notas!!");
		System.out.println();
		
		System.out.println("Valor da Nota1");
		double nota1 = leitor.nextDouble();
		System.out.println("Valor da Nota2");
		double nota2 = leitor.nextDouble();
		System.out.println("Valor da Nota3");
		double nota3 = leitor.nextDouble();
		

		double resul = (nota1 + nota2 + nota3) / 3;	

		System.out.println("Sua media é: " + resul);	
		

	
		leitor.close();
			
		}	
	
		
}

