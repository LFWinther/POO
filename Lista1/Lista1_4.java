package br.com.residencia;

import java.util.Scanner;

public class Lista1_4 {

	public static void main(String[] args) {
		// O programa �term�metro� l� uma temperatura em graus celsius,
		// e devolve sua equival�ncia na escala fahrenheit.

		double f, c;
		Scanner scan = new Scanner(System.in);
		System.out.print("Escreva uma temperatura em �C: ");
		c = scan.nextDouble();
		f = (c * 9 / 5) + 32;
		System.out.println("a convers�o de " + c + "�C para fahrenheit �: " + f + "�F.");
		scan.close();
	}

}
