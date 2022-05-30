import java.util.Scanner;


public class program {
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Calculando o Volume");
		System.out.println();
		
		System.out.println("Valor do Raio");
		double raio = leitor.nextDouble();
		
		
		System.out.println("Valor da Altura");
		double altura = leitor.nextDouble();

		
		double raioele = raio * raio;
		double volume = 3.14 * raioele * altura;
				
		System.out.println("Seu volume é: " + volume);	
		

	
		leitor.close();
			
		}	
	
		
}

