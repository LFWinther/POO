package br.com.residencia;

import java.util.Scanner;

public class Lista2_4 {

	public static void main(String[] args) {
//		O programa "Educado" ir� perguntar seu nome, e tamb�m como voc� gostaria de ser chamado.
//		Depois disso uma sauda��o para voc� aparece na tela.
		
		Scanner scan = new Scanner(System.in);
		String nome, apelido;
		System.out.println("---Educado---");
		System.out.println("Qual o seu nome completo?\nResposta: ");
		nome = scan.nextLine();
		System.out.println("Ol�, " + nome + " Como gostaria de ser chamado?\nResposta: ");
		apelido = scan.nextLine();
		System.out.println("Sauda��es " + apelido);
		scan.close();
	}

}
