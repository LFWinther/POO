package br.com.residencia;

public class Lista2_5 {

	public static void main(String[] args) {
		// O sistema “Faço parte” vai te mostrar um histórico da trajetória de nossa
		// cidade.
		// O resultado apresentado na tela será:
		// “Nova Friburgo tem X anos. Desses, Y foram antes de mim. Mas os últimos Z
		// anos contaram comigo!”. Cada letra maiúscula do texto será uma variável,
		// sendo que “x” e “z” são valores fixos, e “y” irá conter uma expressão.
		System.out.println("---Faço parte---");
		int x = 203, y, z = 24;
		y = x - z;
		System.out.println("Nova Friburgo tem " + x + " anos. Desses, " + y + " foram antes de mim. Mas os últimos " + z
				+ " anos contaram comigo!");
	}

}
