package br.com.residencia;

import java.util.Scanner;

public class Lista3_2 {

	public static void main(String[] args) {
//		O “Programa de fidelidade” aumentou o sistema, criando o botão “Multiplique seus pontos”.
//		O cliente irá digitar quantos cupons tem, e o sistema irá triplicar o valor.

		Scanner scan = new Scanner(System.in);
		int n1, i;
		do {
			System.out.println("---Programa de fidelidade---");
			System.out.println("Digite a quantidade de cupons que você possui.\nResposta: ");
			n1 = scan.nextInt();
			for (i = 0; i <= 20; i++) {
				System.out.println("\n");
			}
		} 
		while (n1 < 0);
		System.out.println("Você tem " + (n1 * 3) + " Pontos.");
	}

}
