import java.util.Scanner;


public class program {
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		double num1 = leitor.nextDouble();
		double num2 = leitor.nextDouble();
		
		if (num1 == num2) {
			System.out.println("Os numeros s�o iguais!!!");
		}
		if (num1 > num2) {
			System.out.println("Numeros diferentes, o numero maior �: " + num1);
		}
		if (num1 < num2) {
			System.out.println("Numero diferentes, o numero maior �: " + num2);
		}
		
		
		leitor.close();
		
	}
}
