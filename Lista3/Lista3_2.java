package br.com.residencia;

import java.util.Scanner;

public class Lista3_2 {

	public static void main(String[] args) {
//		O �Programa de fidelidade� aumentou o sistema, criando o bot�o �Multiplique seus pontos�.
//		O cliente ir� digitar quantos cupons tem, e o sistema ir� triplicar o valor.

		Scanner scan = new Scanner(System.in);
		int n1, i;
		do {
			System.out.println("---Programa de fidelidade---");
			System.out.println("Digite a quantidade de cupons que voc� possui.\nResposta: ");
			n1 = scan.nextInt();
			for (i = 0; i <= 20; i++) {
				System.out.println("\n");
			}
		} 
		while (n1 < 0);
		System.out.println("Voc� tem " + (n1 * 3) + " Pontos.");
	}

}
