import java.util.Scanner;


public class program {
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		int num = leitor.nextInt();
		
		if (num >= 100 && num <= 200) {
			System.out.println("Numero esta entre 100 a 200!! " + num);
		}
		if (num < 100 || num > 200) {
			System.out.println("Numero invalido!!! " + num);
		}
		
		
		
		
		System.out.println(num);
		leitor.close();
		
	}
}
