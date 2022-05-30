import java.util.Scanner;


public class program {
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		System.out.println("Escreva um numero de 1 a 5!!!");
		
		
		int num = leitor.nextInt();
		switch (num) {
		case 1:
			System.out.println("um");
			break;
		case 2:
			System.out.println("dois");
			break;
		case 3:
			System.out.println("tres");
			break;
		case 4:
			System.out.println("quatro");
			break;
		case 5:
			System.out.println("cinco");
			break;	

		default:
			System.out.println("De 1 a 5, POR FAVOR!!!!!!!!!!!!!!!!!!!");
			break;
		
		}
		
		leitor.close();
		
	}
}
