package br.com.residencia;

import java.util.Scanner;

public class Lista1_3 {

	public static void main(String[] args) {
		
//	Crie o programa �mini calculadora�, que ap�s ler dois n�meros inteiros apresenta as 
//	opera��es de soma, subtra��o, multiplica��o e divis�o com eles.
//	Obs.: Trate o maior n�mero poss�vel de erros 
//	(ex: opera��es com n�meros negativos, divis�o por zero, uso de letras, etc).

		char op;
		int n1, n2;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("---Mini Calculadora\n---");
		System.out.print("Escolha um operador:\n'+'\t'-'\t'*'\t'/'\n");
		op = scan.next().charAt(0);
		System.out.print("Digite um n�mero: ");
		n1 = scan.nextInt();
		System.out.print("Digite outro n�mero: ");
		n2 = scan.nextInt();
		scan.close();
		for (int i = 0; i <= 20; i++) {
			System.out.println(" ");
		}
		switch (op) {
		case '+':
			System.out.println(n1 + " + " + n2 + " = " + (n1 + n2));
			break;
		case '-':
			System.out.println(n1 + " - " + n2 + " = " + (n1 - n2));
			break;
		case '*':
			System.out.println(n1 + " * " + n2 + " = " + (n1 * n2));
			break;
		case '/':
			System.out.println(n1 + " / " + n2 + " = " + (n1 / n2));
			break;
		default:
			System.out.println("Escolha uma op��o v�lida");
		}
	}

}
