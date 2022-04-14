package br.com.residencia;

import java.util.Scanner;

public class Lista2_3 {

	public static void main(String[] args) {
//		Um programa "Total de produtos" irá solicitar que o cliente digite quantos produtos irá comprar. 
//		Depois, exibe a mensagem: "Parabéns por comprar x produtos!", substituindo x pela quantidade.
		System.out.println("---Total de produtos---");
		int x;
		Scanner scan = new Scanner(System.in);
		System.out.println("Quantos produtos deseja comprar?\nResposta: ");
		x = scan.nextInt();
		scan.close();
		System.out.println("Parabéns por comprar " + x + " produtos.");
	}

}
