package br.com.residencia;

import java.util.Scanner;

public class Lista3_1 {

	public static void main(String[] args) {
//		O �Programa de fidelidade� solicitou a cria��o do sistema �Ver os seus pontos�,
//		onde o cliente poder� consultar seu saldo de pontos. O cliente ir� digitar um n�mero inteiro
//		correspondente aos seus cupons. Cada cupom corresponde a 1 ponto.

		Scanner scan = new Scanner(System.in);
		int n1, i;
		do {
			System.out.println("---Programa de fidelidade---");
			System.out.println("Digite a quantidade de cupons que voc� possui.\nResposta: ");
			n1 = scan.nextInt();
			for (i = 0; i <= 20; i++) {
				System.out.println("\n");
			}
		} while (n1 < 0);
		System.out.println("Voc� tem " + n1 + " Pontos.");
	}

}
