import java.util.Scanner;

public class program {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Escreva o valor primeira variavel: ");
		float v1 = leitor.nextFloat();
		
		System.out.println("Escreva o valor da segunda variavel: ");
		float v2 = leitor.nextFloat();
		
		System.out.println("Valor da variavel 1 ?: " + v1);
		System.out.println("Valor da variavel 2 ?: " + v2);
		System.out.println();
		
		float vt;
		
		vt = v1;
		v1 = v2;
		v2 = vt;
	
		System.out.println("O novo valor da variavel 1 ? igual a: " + v1);
		System.out.println("O novo valor da variavel 2 ? igual a: " + v2);
		
		
		leitor.close();
	}


}
