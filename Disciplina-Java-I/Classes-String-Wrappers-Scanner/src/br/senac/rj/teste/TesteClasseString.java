package br.senac.rj.teste;

public class TesteClasseString {

	public static void main(String[] args) {
		String nome = "Ricardo";
		int idade = 20;
		System.out.println("nome = " + nome);
		char posicao3 = nome.charAt(3);
		boolean vazio = nome.isEmpty();
		boolean emBranco = nome.isBlank();
		int tamanho = nome.length();
		String parte = nome.substring(0, 4);
		String maiuscula = nome.toUpperCase();
		String minuscula = nome.toLowerCase();
		String semEspacos = nome.trim();
		String converteString = String.valueOf(idade);
		System.out.println("posicao = " + posicao3);
		System.out.println("vazio = " + vazio);
		System.out.println("Em branco = " + emBranco);
		System.out.println("Tamanho =  " + tamanho);
		System.out.println("Parte = " + parte);
		System.out.println("maiúscula = " + maiuscula);
		System.out.println("minúscula = " + minuscula);
		System.out.println("semEspaços = " + semEspacos);
		System.out.println("tamanho de converteString = " + converteString.length());
		System.out.println("nome = \"RICARDO\" = " + nome.trim().toUpperCase().equals("RICARDO"));
	}

}
