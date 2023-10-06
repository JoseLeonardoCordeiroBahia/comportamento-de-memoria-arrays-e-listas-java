package _3_vetores._2_exercicio.alturas;

import java.util.Locale;
import java.util.Scanner;

public class Alturas {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		int n;
		int quantidadeDeMenores = 0;
		double somaDasAlturas = 0;
		double alturaMedia;
		double percentualDeMenores;
		
		System.out.print("Quantas pessoas serao digitadas? ");
		n = scanner.nextInt();
		
		String nomes[] = new String[n];
		int idades[] = new int[n];
		double alturas[] = new double[n];
		
		for (int i = 0; i < n; i++) {
			System.out.printf("Dados da %dº pessoa:\n", i + 1);
			
			scanner.nextLine();
			
			System.out.print("Nome: ");
			nomes[i] = scanner.nextLine();
			
			System.out.print("Idade: ");
			idades[i] = scanner.nextInt();
			
			System.out.print("Altura: ");
			alturas[i] = scanner.nextDouble();
			
			somaDasAlturas += alturas[i];
			
			if (idades[i] < 16) {
				quantidadeDeMenores++;
			}
		}
		
		alturaMedia = somaDasAlturas / n;
		percentualDeMenores = ((double) quantidadeDeMenores / n) * 100.0;
		
		System.out.println();
		System.out.printf("Altura média: %.2f\n", alturaMedia);
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", percentualDeMenores);
		
		for(int i = 0; i < n; i++) {
			if (idades[i] < 16) {
				System.out.printf("%s\n", nomes[i]);
			}
		}
		
		scanner.close();
	}
	
}
