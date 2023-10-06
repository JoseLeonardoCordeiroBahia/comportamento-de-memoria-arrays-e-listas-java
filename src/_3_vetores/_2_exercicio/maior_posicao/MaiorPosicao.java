package _3_vetores._2_exercicio.maior_posicao;

import java.util.Locale;
import java.util.Scanner;

public class MaiorPosicao {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		int n;
		int posicaoDoMaiorValor = 0;
		double maiorValor = 0;
		
		System.out.print("Quantos numeros voce vai digitar? ");
		n = scanner.nextInt();
		
		double numeros[] = new double[n];
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.print("Digite um numero: ");
			numeros[i] = scanner.nextDouble();
			
			if (numeros[i] > maiorValor) {
				maiorValor = numeros[i];
				posicaoDoMaiorValor = i;
			}
		}
		
		System.out.printf("\nMAIOR VALOR = %.1f\n", maiorValor);
		System.out.printf("POSICAO DO MAIOR VALOR = %d\n", posicaoDoMaiorValor);
		
		scanner.close();
	}
	
}
