import java.util.Scanner;


public class program {
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		int num = leitor.nextInt();
		
		if (num <= 10) {
			System.out.println("Numero menor ou igual a 10!!! " + num);
		}
		if (num > 10) {
			System.out.println("Numero maior que 10!!! " + num);
		}
		
		
		
		
		
		System.out.println(num);
		leitor.close();
		
	}
}
