import java.util.Scanner;


public class program {
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Calculando o Consumo de Combustivel");
		System.out.println();
		
		System.out.println("Escreva o tempo gasto da viagem");
		double tempo = leitor.nextDouble();
		
		
		System.out.println("Escreva a velocidade media");
		double vm = leitor.nextDouble();
		
		System.out.println("Escreva o km/h");
		double km = leitor.nextDouble();

		
		double distancia = tempo * vm;
		double combustivel = distancia / km;
				
		System.out.println("A quantidade gasta de litros foi em: " + combustivel);	
		

	
		leitor.close();
			
		}	
	
		
}

