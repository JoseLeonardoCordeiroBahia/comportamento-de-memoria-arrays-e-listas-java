package _3_vetores._2_exercicio.aprovados;

import java.util.Locale;
import java.util.Scanner;

public class Aprovados {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		int n;
		double mediaDasNotas;
		
		System.out.print("Quantos alunos serao digitados? ");
		n = scanner.nextInt();
		
		String nomes[] = new String[n];
		double notas1[] = new double[n];
		double notas2[] = new double[n];
		
		for (int i = 0; i < n; i++) {
			System.out.printf("Digite nome, primeira e segunda nota do %dº aluno:\n", i + 1);

			scanner.nextLine();
			
			nomes[i] = scanner.nextLine();
			notas1[i] = scanner.nextDouble();
			notas2[i] = scanner.nextDouble();
		}
		
		System.out.println("Alunos aprovados: ");
		
		for (int i = 0; i < n; i++) {
			mediaDasNotas = (notas1[i] + notas2[i]) / 2;
			
			if (mediaDasNotas >= 6.0) {
				System.out.println(nomes[i]);
			}
		}
		
		scanner.close();
	}
	
}
