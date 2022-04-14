package br.com.residencia;

import java.util.Scanner;

public class Lista3_4 {

	public static void main(String[] args) {
//		O laboratório fabricante de álcool em gel precisa saber se o produto está atingindo a
//		concentração ideal para desinfecção, que é de 70%. Para a ajudar o laboratório, 
//		crie um programa onde será preenchida a capacidade da garrafa em mililitros, 
//		e o resultado serão os volumes de álcool e de gel que precisam ser misturados para 
//		preenchimento do vasilhame.

		float ml, alcool, gel;

		Scanner scan = new Scanner(System.in);
		System.out.println("---Álcool gel---");
		System.out.print("Capacidade da garrafa em ml: ");
		ml = scan.nextFloat();
		scan.close();
		alcool = (ml * 70 / 100);
		gel = (ml * 30 / 100);
		System.out.println("Alcool: " + alcool + "\nGel: " + gel);
	}

}
