package _3_vetores._2_exercicio.negativos;

import java.util.Scanner;

public class Negativos {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n;
		
		System.out.print("Quantos numeros voce vai digitar? ");
		n = scanner.nextInt();
		
		int[] numeros = new int[n];
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.print("Digite um numero: ");
			numeros[i] = scanner.nextInt();
		}
		
		System.out.println("NUMEROS NEGATIVOS:");
		
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] < 0) {
				System.out.println(numeros[i]);
			}
		}
		
		scanner.close();
	}
	
}
