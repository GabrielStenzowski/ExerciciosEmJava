import java.util.Scanner;


public class program {
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Escreva o primeiro numero: ");
		double num1 = leitor.nextDouble();
		
		System.out.println("Escreva o segundo numero: ");
		double num2 = leitor.nextInt();
		
		double rmais = num1 + num2;
		double rmenos = num1 - num2;
		double rmulti = num1 * num2;
		double rdivi = num1 / num2;
		
				
		System.out.println("Resultado da soma ?: " + rmais);
		System.out.println("Resultado da subtra??o ?: " + rmenos);
		System.out.println("Resultado da multiplica??o ?: " + rmulti);
		System.out.println("Resultado da divis?o ?: " + rdivi);
		
		leitor.close();
		
	}
}

