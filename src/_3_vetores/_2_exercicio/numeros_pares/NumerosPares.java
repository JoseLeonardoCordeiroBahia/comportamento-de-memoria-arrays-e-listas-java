package _3_vetores._2_exercicio.numeros_pares;

import java.util.Scanner;

public class NumerosPares {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n;
		int quantidadeDeNumerosPares;
		
		System.out.print("Quantos numeros voce vai digitar? ");
		n = scanner.nextInt();
		
		int numeros[] = new int[n];
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.print("Digite um numero: ");
			numeros[i] = scanner.nextInt();
		}
		
		System.out.println("\nNUMEROS PARES: ");
		
		quantidadeDeNumerosPares = 0;
		
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] % 2 == 0) {
				System.out.printf("%d  ", numeros[i]);
				quantidadeDeNumerosPares++;
			}
		}
		
		System.out.printf("\n\nQUANTIDADE DE PARES = %d\n", quantidadeDeNumerosPares);
		
		scanner.close();
	}
	
}
