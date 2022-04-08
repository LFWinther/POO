package br.com.residencia;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
//		System.out.println("Olá mundo");
//		System.out.println("\tOlá mundo");
//		System.out.println("\nOlá mundo");
//		System.out.println("\\Olá mundo");
//		System.out.println("'Olá mundo");
//		System.out.println("\"Olá mundo");

//		String nome, sobrenome;
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Digite seu nome: ");
//		nome = scan.next();
//		System.out.println("Digite seu sobrenome: ");
//		sobrenome = scan.next();
//		for(int i = 0; i <= 20; i++) {
//			System.out.println("\n");
//		}
//		System.out.println("Meu nome é " + nome + " " + sobrenome);
//		scan.close();

		int n1, n2;
		Scanner scan = new Scanner(System.in);
		System.out.print("Digite um número: ");
		n1 = scan.nextInt();
		System.out.print("\nDigite outro número: ");
		n2 = scan.nextInt();
		for (int i = 0; i <= 20; i++) {
			System.out.println("\n");
		}
		n1 += n2;
		System.out.println("A soma dos números é igual a " + n1);
		scan.close();
	}

}
