package _3_vetores._2_exercicio.mais_velho;

import java.util.Scanner;

public class MaisVelho {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n;
		int idadeDoMaisVelho;
		int posicaoDoMaisVelho;
		
		System.out.print("Quantas pessoas voce vai digitar? ");
		n = scanner.nextInt();
		
		String nomes[] = new String[n];
		int idades[] = new int[n];
		
		for (int i = 0; i < n; i++) {
			System.out.printf("Dados da %dº pessoa:\n", i + 1);
			
			scanner.nextLine();
			
			System.out.print("Nome: ");
			nomes[i] = scanner.nextLine();
			
			System.out.print("Idade: ");
			idades[i] = scanner.nextInt();
		}
		
		idadeDoMaisVelho = idades[0];
		posicaoDoMaisVelho = 0;
		
		for (int i = 0; i < n; i++) {
			if (idades[i] > idadeDoMaisVelho) {
				idadeDoMaisVelho = idades[i];
				posicaoDoMaisVelho = i;
			}
		}
		
		System.out.printf("PESSOA MAIS VELHA: %s\n", nomes[posicaoDoMaisVelho]);
		
		scanner.close();
	}
	
}
