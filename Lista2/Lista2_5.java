package br.com.residencia;

public class Lista2_5 {

	public static void main(String[] args) {
		// O sistema �Fa�o parte� vai te mostrar um hist�rico da trajet�ria de nossa
		// cidade.
		// O resultado apresentado na tela ser�:
		// �Nova Friburgo tem X anos. Desses, Y foram antes de mim. Mas os �ltimos Z
		// anos contaram comigo!�. Cada letra mai�scula do texto ser� uma vari�vel,
		// sendo que �x� e �z� s�o valores fixos, e �y� ir� conter uma express�o.
		System.out.println("---Fa�o parte---");
		int x = 203, y, z = 24;
		y = x - z;
		System.out.println("Nova Friburgo tem " + x + " anos. Desses, " + y + " foram antes de mim. Mas os �ltimos " + z
				+ " anos contaram comigo!");
	}

}
