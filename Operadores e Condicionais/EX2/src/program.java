import java.util.Scanner;


public class program {
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Escreva o primeiro numero: ");
		int num1 = leitor.nextInt();
		
		System.out.println("Escreva o segundo numero: ");
		int num2 = leitor.nextInt();
		
		int resul = num1 + num2;
		
		System.out.println(resul);		
		
		
		
		leitor.close();
		
	}
}

