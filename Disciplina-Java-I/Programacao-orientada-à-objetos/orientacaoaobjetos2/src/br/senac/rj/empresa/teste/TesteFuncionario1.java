package br.senac.rj.empresa.teste;

import java.util.Scanner;

import br.senac.rj.empresa.modelo.Funcionario;

public class TesteFuncionario1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Funcionario funcionario1 = new Funcionario();
		String pergunta;
		do {
			System.out.println("Entre com o nome do funcionário: ");
			funcionario1.setNome(sc.nextLine());
			System.out.println("Entre com o registro do funcionário: ");
			funcionario1.setRegistro(Integer.parseInt(sc.nextLine()));
			System.out.println("Entre com o cargo do funcionário: ");
			funcionario1.setCargo(Integer.parseInt(sc.nextLine()));
			System.out.println("Entre com o salário do funcionário: ");
			funcionario1.setSalario(Double.parseDouble(sc.nextLine()));;
			System.out.println("O nome do funcionário é: " + funcionario1.getNome());
			System.out.println("O salário do funcionário é de " + funcionario1.getSalario());
			System.out.println("O registro do funcionário é igual a " + funcionario1.getRegistro());
			funcionario1.aplicarBonificacao();
			System.out.println("Deseja continuar?(s/n)");
			pergunta = sc.nextLine();
			} while(pergunta.equals("S") || pergunta.equals("s"));
		sc.close();
	}
	
}