package br.senac.rj.banco.teste;

import java.util.Scanner;

import br.senac.rj.banco.modelo.Conta;

public class TesteClasse2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1 - Consultar 2 - Depositar 3 - Sacar 4 - Encerrar");
		int pergunta = Integer.parseInt(sc.nextLine());
		int valorDeposito = 10;
		int valorSaque = 10;
		do {
			Conta conta1 = new Conta();
			conta1.setAgencia(1);
			conta1.setNumero(1);
			conta1.deposita(200);
			if (pergunta == 1) {
				System.out.println("Saldo Inicial = " + conta1.getSaldo());
			} else if (pergunta==2) {
				conta1.deposita(valorDeposito);
				System.out.println("Valor do depósito = " + valorDeposito);
			} else if (pergunta == 3) {
				System.out.println("Valor do Saque = " + valorSaque);
				if (conta1.saca(valorSaque))
					System.out.println("Saldo após o saque = " + conta1.getSaldo());
				else
					System.out.println("Não foi possível efetuar o saque"); } 
			break;
		} while (pergunta != 4);
		System.out.println("Programa encerrado!");
	sc.close();
}
}
