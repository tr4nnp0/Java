package br.senac.rj.empresa.modelo;

import br.senac.rj.empresa.modelo.Material;

import java.util.Scanner;

public class TesteMaterial1 {

	public static void main(String[] args) {
		Material mat1 = new Material();
		Scanner sc = new Scanner(System.in);
		int opcao;
		int materialSaida;
		do {
			System.out.println("1 - Cadastrar material");
			System.out.println("2 - Entrada de material");
			System.out.println("3 - Saída de material");
			System.out.println("4 - Consultar saldo em estoque");
			System.out.println("5 - Encerrar");
			System.out.println("Entre com uma opção: ");
			opcao = Integer.parseInt(sc.nextLine());
			switch (opcao) {
			case 1:
				System.out.println("Entre com o código do material: ");
				int codMaterial = Integer.parseInt(sc.nextLine());
				System.out.println("Entre com a descrição do material: ");
				String descMaterial = sc.nextLine();
				mat1.setCodMaterial(codMaterial);
				mat1.setDescMaterial(descMaterial);
				break;
			case 2:
				System.out.println("Entre com a quantidade de material a ser adicionada: ");
				materialSaida = Integer.parseInt(sc.nextLine());
				mat1.entrarMaterial(materialSaida);
				break;
			case 3:
				System.out.println("Entre com a quantidade de material a ser retirada: ");
				materialSaida = Integer.parseInt(sc.nextLine());
				if (!mat1.sairMaterial(materialSaida))
					System.out.println("Não há estoque suficiente!");
				else
					System.out.println("Saída de material realizada com sucesso!");
				break;
			case 4:
				System.out.println("O código do material " + mat1.getDescMaterial() + " é " + mat1.getCodMaterial() + " e a quantidade em estoque é " + mat1.getQtdeEstoque());
				break;
			case 5:
				System.out.println("Programa encerrado!");
				break;
			default:
				System.out.println("Opção incorreta!");
				break;
			}
		} while (opcao != 5);
		sc.close();
		}
}
