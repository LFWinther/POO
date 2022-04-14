package br.com.residencia;

import java.util.Scanner;

public class Lista2_4 {

	public static void main(String[] args) {
//		O programa "Educado" irá perguntar seu nome, e também como você gostaria de ser chamado.
//		Depois disso uma saudação para você aparece na tela.
		
		Scanner scan = new Scanner(System.in);
		String nome, apelido;
		System.out.println("---Educado---");
		System.out.println("Qual o seu nome completo?\nResposta: ");
		nome = scan.nextLine();
		System.out.println("Olá, " + nome + " Como gostaria de ser chamado?\nResposta: ");
		apelido = scan.nextLine();
		System.out.println("Saudações " + apelido);
		scan.close();
	}

}
