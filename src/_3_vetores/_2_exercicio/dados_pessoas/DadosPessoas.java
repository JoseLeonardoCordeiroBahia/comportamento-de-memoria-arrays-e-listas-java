package _3_vetores._2_exercicio.dados_pessoas;

import java.util.Locale;
import java.util.Scanner;

public class DadosPessoas {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		int n;
		int quantidadeDeMulheres;
		int quantidadeDeHomens;
		double menorAltura;
		double maiorAltura;
		double somaDasAlturasMulheres;
		double mediaDasAlturasMulheres;
		
		System.out.print("Quantas pessoas serao digitadas? ");
		n = scanner.nextInt();
		
		double alturas[] = new double[n];
		char generos[] = new char[n];
		
		for (int i = 0; i < n; i++) {
			System.out.printf("Altura da %dº pessoa: ", i + 1);
			alturas[i] = scanner.nextDouble();
			
			System.out.printf("Genero da %dº pessoa: ", i + 1);
			generos[i] = scanner.next().toUpperCase().charAt(0);
		}
		
		menorAltura = alturas[0];
		maiorAltura = alturas[0];
		
		for (int i = 0; i < n; i++) {
			if (alturas[i] < menorAltura) {
				menorAltura = alturas[i];
			}
			
			if (alturas[i] > maiorAltura) {
				maiorAltura = alturas[i];
			}
		}
		
		quantidadeDeHomens = 0;
		quantidadeDeMulheres = 0;
		somaDasAlturasMulheres = 0;
		
		for (int i = 0; i < n; i++) {
			if (generos[i] == 'M') {
				quantidadeDeHomens++;
			} else {
				quantidadeDeMulheres++;
				somaDasAlturasMulheres = somaDasAlturasMulheres + alturas[i];
			}
		}
		
		mediaDasAlturasMulheres = somaDasAlturasMulheres / quantidadeDeMulheres;
		
		System.out.printf("Menor altura = %.2f\n", menorAltura);
		System.out.printf("Maior altura = %.2f\n", maiorAltura);
		System.out.printf("Media das alturas das mulheres = %.2f\n", mediaDasAlturasMulheres);
		System.out.printf("Numero de homens = %d\n", quantidadeDeHomens);
		
		scanner.close();
	}
	
}
