package _3_vetores._2_exercicio.media_pares;

import java.util.Locale;
import java.util.Scanner;

public class MediaPares {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		int n;
		int quantidadeDeNumerosPares = 0;
		int somaDosNumerosPares = 0;
		double mediaDosNumerosPares;
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		n = scanner.nextInt();
		
		int numeros[] = new int[n];
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.print("Digite um numero: ");
			numeros[i] = scanner.nextInt();
		}

		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] % 2 == 0) {
				somaDosNumerosPares = somaDosNumerosPares + numeros[i];
				quantidadeDeNumerosPares++;
			}
		}
		
		if (quantidadeDeNumerosPares > 0) {
			mediaDosNumerosPares = (double) somaDosNumerosPares / quantidadeDeNumerosPares;
			
			System.out.printf("MEDIA DOS PARES = %.1f\n", mediaDosNumerosPares);
		} else {
			System.out.println("NENHUM NUMERO PAR");
		}
		
		scanner.close();
	}

}
