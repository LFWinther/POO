package br.com.residencia;

public class Lista3_6 {

	public static void main(String[] args) {
//		O �mini DP� aumentou seus c�lculos. Agora, considera a jornada de trabalho semanal de um
//		funcion�rio, que � de 40 horas. O funcion�rio que trabalhar mais de 40 horas receber� hora
//		extra, cujo c�lculo � o valor da hora regular com um acr�scimo de 50%. 
//		Considerando que o m�s possui 4 semanas exatas, e que a entrada de horas ser� um valor maior
//		que a jornada normal.
//		Sal�rio base (valor da hora * horas normais)
//		Valor de horas extras
//		Valor do desconto para o INSS
//		Sal�rio l�quido (Sal�rio base + horas extras � desconto INSS)
//		Imprimir o contracheque do funcion�rio.

		double hrTrab = 220.0, vlTrab = 30.16, salarioBruto = hrTrab * vlTrab, inss = salarioBruto * 12 / 100,
				horaExtra = vlTrab * 50 / 100 + vlTrab, horaExTrab = 5 * horaExtra,
				salarioLiq = salarioBruto + horaExTrab - inss;
		String nome = "Fulano";
		System.out.println("---Mini Departamento pessoal---");
		System.out.println("Contra cheque");
		System.out.println("Funcion�rio:\t" + nome);
		System.out.println("Horas trabalhadas mensais:\t" + hrTrab);
		System.out.println("Valor da hora:\t" + vlTrab);
		System.out.println("S�lario Bruto:\t" + salarioBruto);
		System.out.println("INSS:\t" + inss);
		System.out.println("Valor hora extra:\t" + horaExtra);
		System.out.println("Hora extra trabalhadas:\t" + (horaExTrab - hrTrab));
		System.out.println("S�lario l�quido:\t" + salarioLiq);

	}

}
