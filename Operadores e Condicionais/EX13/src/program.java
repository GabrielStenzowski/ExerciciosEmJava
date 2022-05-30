import java.util.Scanner;


public class program {
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		System.out.println("Informe os valores pra calculadora");
		System.out.println("Valor 1: ");
		double num1 = leitor.nextDouble();
		System.out.println("Valor 2: ");
		double num2 = leitor.nextDouble();
		
		System.out.println("Inform a operação da conta, em caractere: +, -, *, / ");
		char c = leitor.next().charAt(0);
		
		
		double resul = 0;	
		
	
		switch (c) {
		case '+':
			
			resul = num1 + num2;
			
			System.out.println("Resultado: " + resul);
			break;
		case '-':
			
			resul = num1 - num2;
			
			System.out.println("Resultado: " + resul);
			break;
		case '*':
			
			resul = num1 * num2;
			
			System.out.println("Resultado: " + resul);
			break;
		case '/':
			
			resul = num1 / num2;
			
			System.out.println("Resultado: " + resul);
			break;

		
		}
		
		leitor.close();
		
	}
}
