//	O restaurante "Self-Service" precisa de um programa para imprimir as etiquetas de "comanda"
//  na pesagem dos pratos.
//	O operador da balan�a ir� digitar o pre�o do quilo e o total em gramas da refei��o,
//	considerando que o prato vazio pesa 465 gramas (tara). A etiqueta ir� conter o nome do restaurante,
//	o tara do prato, o pre�o de 100 gramas, o peso consumido e o valor total.

package br.com.residencia;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Lista3_3 {

	public static void main(String[] args) {

		double kg, total, tara = 0.465, cemg;

		Scanner scan = new Scanner(System.in);
		System.out.println("\t---Self-Service---");
		System.out.print("Digite o pre�o do Kg: ");
		kg = scan.nextDouble();
		System.out.print("\nDigite o total em gramas da refei��o: ");
		total = scan.nextDouble();
		scan.close();
		for (int i = 0; i <= 10; i++) {
			System.out.println("\n");
		}
		cemg = kg / 10;
		BigDecimal bd = new BigDecimal(cemg).setScale(2, RoundingMode.HALF_EVEN);
		System.out.println(bd.doubleValue());
		System.out.println("---Etiqueta---");
		System.out.println("PanelaV�ia \n" + "Tara:\t" + tara + "\nPeso 100g:\t" + cemg + "\nPeso total:\t" + total
				+ "\nPeso consumido:\t" + (total - tara));

	}

}
