import java.util.Scanner;


public class program {
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		int num = leitor.nextInt();
		
		if (num >= 50) {
			System.out.println("Numero ? maior ou igual a 50!!!");
			System.out.println("Seu numero ?: " + num);
		}
		if (num < 50) {
			System.out.println("Numero ? menor que 50!!!");
			System.out.println("Seu numero ?: " + num);
		}		

		leitor.close();
		
	}
}
