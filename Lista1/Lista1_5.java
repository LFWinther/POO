package br.com.residencia;

public class Lista1_5 {

	public static void main(String[] args) {
//		O programa “Riuju” escreve na tela o resultado das expressões abaixo:
//		a)	2 + 3 - 5 * 8 - 4 + 354 - 521 + 7 * 66
//		b)	2 + 7 * (14 - 21) + 28 * 3 * 42 + 740 - (156 + 4 + 40) * 9

		int n1, n2;
		n1 = 2 + 3 - 5 * 8 - 4 + 354 - 521 + 7 * 66;
		n2 = 2 + 7 * (14 - 21) + (28 * 3 * 42) + 740 - ((156 + 4 + 40) * 9);
		System.out.println("---Riuju---\n\n");
		System.out.println("O resultado da expressão 'a' é: " + n1);
		System.out.println("\nO resultado da expressão 'b' é: " + n2);
	}

}
