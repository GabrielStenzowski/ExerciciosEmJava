import java.util.Scanner;


public class program {
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Escreva a temperatura em graus celcius: ");
		float temp = leitor.nextFloat();
		
		float F;
		
		F = (9 * temp + 160) / 5;

		System.out.println("A temperatura em fahrenheit e: " + F);
			
						
		leitor.close();
		
	}
}

