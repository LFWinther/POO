package br.com.residencia;

import java.util.Scanner;

public class Lista2_3 {

	public static void main(String[] args) {
//		Um programa "Total de produtos" ir� solicitar que o cliente digite quantos produtos ir� comprar. 
//		Depois, exibe a mensagem: "Parab�ns por comprar x produtos!", substituindo x pela quantidade.
		System.out.println("---Total de produtos---");
		int x;
		Scanner scan = new Scanner(System.in);
		System.out.println("Quantos produtos deseja comprar?\nResposta: ");
		x = scan.nextInt();
		scan.close();
		System.out.println("Parab�ns por comprar " + x + " produtos.");
	}

}
