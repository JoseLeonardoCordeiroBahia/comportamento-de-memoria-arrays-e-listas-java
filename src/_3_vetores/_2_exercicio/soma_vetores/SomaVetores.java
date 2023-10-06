package _3_vetores._2_exercicio.soma_vetores;

import java.util.Scanner;

public class SomaVetores {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n;
		
		System.out.print("Quantos valores vai ter cada vetor? ");
		n = scanner.nextInt();
		
		int vetorA[] = new int[n];
		int vetorB[] = new int[n];
		int vetorC[] = new int[n];
		
		System.out.println("Digite os valores do vetor A: ");
		
		for (int i = 0; i < vetorA.length; i++) {
			vetorA[i] = scanner.nextInt();
		}
		
		System.out.println("Digite os valores do vetor B: ");
		
		for (int i = 0; i < vetorB.length; i++) {
			vetorB[i] = scanner.nextInt();
		}
		
		
		for (int i = 0; i < vetorC.length; i++) {
			vetorC[i] = vetorA[i] + vetorB[i];
		}
		
		System.out.println("VETOR RESULTANTE:");
		
		for (int i = 0; i < vetorC.length; i++) {
			System.out.println(vetorC[i]);
		}
		
		scanner.close();
	}

}
