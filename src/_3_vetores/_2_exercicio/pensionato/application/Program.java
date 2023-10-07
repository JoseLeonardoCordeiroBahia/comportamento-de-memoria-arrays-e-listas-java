package _3_vetores._2_exercicio.pensionato.application;

import java.util.Scanner;

import _3_vetores._2_exercicio.pensionato.entities.Aluguel;

public class Program {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Aluguel alugueis[] = new Aluguel[10];
		
		System.out.print("Quantos quartos serão alugados? ");
		int n = scanner.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.println();
			System.out.println("Aluguel #" + i + ":");
			
			System.out.print("Nome: ");
			scanner.nextLine();
			String nome = scanner.nextLine();
			
			System.out.print("Email: ");
			String email = scanner.next();
			
			System.out.print("Quarto: ");
			int numeroDoQuarto = scanner.nextInt();
			
			alugueis[numeroDoQuarto] = new Aluguel(nome, email);;
		}
		
		System.out.println();
		System.out.println("Quartos ocupados:");
		for (int i = 0; i < alugueis.length; i++) {
			if (alugueis[i] != null) {
				System.out.println(i + ": " + alugueis[i]);
			}
		}
		
		scanner.close();;
	}
	
}
