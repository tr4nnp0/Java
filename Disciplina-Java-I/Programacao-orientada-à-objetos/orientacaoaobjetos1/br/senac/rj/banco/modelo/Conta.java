package br.senac.rj.banco.modelo;

public class Conta {
	private int agencia;
	private int numero;
	private double saldo;
	
	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	

	public double getSaldo() {
		return saldo;
	}

	public void deposita(double valor) {
		saldo = saldo + valor;
	}
	
	public boolean saca(double valor) {
		double novoSaldo =  this.saldo - valor;
		if (novoSaldo < 0)
			return false;
		else
			return true;
	}
}
