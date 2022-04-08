package br.com.residencia;

import java.util.Scanner;

public class Lista1_1 {

	public static void main(String[] args) {

//		O programa “Tempo de vida” irá imprimir a soma das idades de todos os colegas 
//		da sua equipe (6 pessoas). Pergunte a cada um a idade e não esqueça a sua! 
//		Depois faça a atribuição direta da expressão em uma variável inteira.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("---Tempo de Vida---");
		for (int i = 1; i <= 6; i++) {
			System.out.print("Qual é a idade do colega " + i + "?\nResposta: ");
			int r;
			r = scan.nextInt();
		}
		scan.close();
	}

}
