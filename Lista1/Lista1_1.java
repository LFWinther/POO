package br.com.residencia;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
//		System.out.println("Ol� mundo");
//		System.out.println("\tOl� mundo");
//		System.out.println("\nOl� mundo");
//		System.out.println("\\Ol� mundo");
//		System.out.println("'Ol� mundo");
//		System.out.println("\"Ol� mundo");

//		String nome, sobrenome;
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Digite seu nome: ");
//		nome = scan.next();
//		System.out.println("Digite seu sobrenome: ");
//		sobrenome = scan.next();
//		for(int i = 0; i <= 20; i++) {
//			System.out.println("\n");
//		}
//		System.out.println("Meu nome � " + nome + " " + sobrenome);
//		scan.close();

		int n1, n2;
		Scanner scan = new Scanner(System.in);
		System.out.print("Digite um n�mero: ");
		n1 = scan.nextInt();
		System.out.print("\nDigite outro n�mero: ");
		n2 = scan.nextInt();
		for (int i = 0; i <= 20; i++) {
			System.out.println("\n");
		}
		n1 += n2;
		System.out.println("A soma dos n�meros � igual a " + n1);
		scan.close();
	}

}
