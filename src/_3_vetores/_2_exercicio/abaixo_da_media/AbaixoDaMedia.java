package _3_vetores._2_exercicio.abaixo_da_media;

import java.util.Locale;
import java.util.Scanner;

public class AbaixoDaMedia {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		int n;
		double somaDoVetor;
		double mediaDoVetor;
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		n = scanner.nextInt();
		
		double numeros[] = new double[n];
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.print("Digite um numero: ");
			numeros[i] = scanner.nextDouble();
		}
		
		somaDoVetor = 0;
		
		for (int i = 0; i < numeros.length; i++) {
			somaDoVetor += numeros[i];
		}
		
		mediaDoVetor = somaDoVetor / numeros.length;
		
		System.out.printf("\nMEDIA DO VETOR = %.3f\n", mediaDoVetor);
		
		System.out.println("ELEMENTOS ABAIXO DA MEDIA: ");
		
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] < mediaDoVetor) {
				System.out.printf("%.1f\n", numeros[i]);
			}
		} 
		
		scanner.close();
	}
	
}
