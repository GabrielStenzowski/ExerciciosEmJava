import java.util.Scanner;


public class program {
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Escreva o primeiro numero: ");
		int num1 = leitor.nextInt();
		
		System.out.println("Escreva o segundo numero: ");
		int num2 = leitor.nextInt();
		
		if(num1 > num2){
			System.out.println("numero 1 � maior que o numero 2, logo o numero maior �: " + num1);
		}
		if(num1 < num2){
			System.out.println("numero 1 � menor que o numero 2, logo o numero maior �: " + num2);
		}
		if(num1 == num2){
			System.out.println("A sequencia de numero esta errada!!!! ");
		}

		
		leitor.close();
		
	}
}

