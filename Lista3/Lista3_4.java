package br.com.residencia;

import java.util.Scanner;

public class Lista3_4 {

	public static void main(String[] args) {
//		O laborat�rio fabricante de �lcool em gel precisa saber se o produto est� atingindo a
//		concentra��o ideal para desinfec��o, que � de 70%. Para a ajudar o laborat�rio, 
//		crie um programa onde ser� preenchida a capacidade da garrafa em mililitros, 
//		e o resultado ser�o os volumes de �lcool e de gel que precisam ser misturados para 
//		preenchimento do vasilhame.

		float ml, alcool, gel;

		Scanner scan = new Scanner(System.in);
		System.out.println("---�lcool gel---");
		System.out.print("Capacidade da garrafa em ml: ");
		ml = scan.nextFloat();
		scan.close();
		alcool = (ml * 70 / 100);
		gel = (ml * 30 / 100);
		System.out.println("Alcool: " + alcool + "\nGel: " + gel);
	}

}
