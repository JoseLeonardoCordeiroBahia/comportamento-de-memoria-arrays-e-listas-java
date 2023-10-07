package _6_listas._1_exercicio.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import _6_listas._1_exercicio.entities.Funcionario;

public class Solucao2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		int n;
		List<Funcionario> funcionarios = new ArrayList<>();
		
		System.out.print("Quantos funcionários serão cadastrados? ");
		n = scanner.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.println();
			System.out.println("Funcionário #" + (i + 1) + ":");
			
			System.out.print("Id: ");
			Integer id = scanner.nextInt();
			
			while(idExistente(funcionarios, id)) {
				System.out.print("Esse Id já existe! Tente novamente: ");
				id = scanner.nextInt();
			}
			
			System.out.print("Nome: ");
			scanner.nextLine();
			String nome = scanner.nextLine();
			
			System.out.print("Salário: ");
			Double salario = scanner.nextDouble();
			
			Funcionario funcionario = new Funcionario(id, nome, salario);
			
			funcionarios.add(funcionario);
		}
		
		System.out.println();
		System.out.print("Informe o Id do funcionário que terá aumento salarial: ");
		int idFuncionario = scanner.nextInt();
		
		Funcionario funcionarioFiltrado = funcionarios.stream()
				.filter(funcionario -> funcionario.getId() == idFuncionario)
				.findFirst()
				.orElse(null);
		
		if (funcionarioFiltrado == null) {
			System.out.println("Esse Id não existe!");
		} else {
			System.out.print("Insira a porcentagem: ");
			double porcentagem = scanner.nextDouble();
			
			funcionarioFiltrado.aumentarSalario(porcentagem);
		}
		
		System.out.println();
		System.out.println("Lista de funcionários:");
		
		for (Funcionario funcionario : funcionarios) {
			System.out.println(funcionario);
		}
				
		scanner.close();
	}
	
	public static boolean idExistente(List<Funcionario> list, int id) {
		Funcionario employee = list.stream()
				.filter(x -> x.getId() == id)
				.findFirst()
				.orElse(null);
		
		return employee != null;
	}
	
}
