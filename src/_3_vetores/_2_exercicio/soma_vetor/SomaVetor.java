package _3_vetores._2_exercicio.soma_vetor;

import java.util.Locale;
import java.util.Scanner;

public class SomaVetor {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		int n;
		double soma = 0;
		double media;
		
		System.out.print("Quantos numeros voce vai digitar? ");
		n = scanner.nextInt();
		
		double numeros[] = new double[n];
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.print("Digite um numero: ");
			numeros[i] = scanner.nextDouble();
			
			soma += numeros[i];
		}
		
		media = soma / numeros.length;
		
		System.out.println();
		System.out.print("VALORES = ");

	    for (int i = 0; i < numeros.length; i++) {
	    	System.out.printf("%.1f  ", numeros[i]);
	    }
		
		System.out.printf("\nSOMA = %.2f\n", soma);
		System.out.printf("MEDIA = %.2f\n", media);
		
		scanner.close();
	}
	
}
