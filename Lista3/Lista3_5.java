package br.com.residencia;

public class Lista3_5 {

	public static void main(String[] args) {
//O programa �mini departamento pessoal� l� a quantidade de horas trabalhadas por um funcion�rio
//em um m�s, o valor que ele recebe por hora e o percentual de desconto para o INSS, e calcula:
//O sal�rio bruto (horas trabalhadas * valor hora)
//O valor do desconto para o INSS
//O sal�rio l�quido (adicionais menos descontos).
//Ap�s os c�lculos, ser� impresso o contra cheque  
//(Sal�rio bruto, valor do desconto do INSS, e o sal�rio l�quido do funcion�rio).

		double hrTrab = 220.0, vlTrab = 30.16, salarioBruto = hrTrab * vlTrab, inss = salarioBruto * 12 / 100,
				salarioLiq = salarioBruto - inss;
		String nome = "Fulano";
		System.out.println("---Mini Departamento pessoal---");
		System.out.println("Contra cheque");
		System.out.println("Funcion�rio:\t" + nome);
		System.out.println("Horas trabalhadas mensais:\t" + hrTrab);
		System.out.println("Valor da hora:\t" + vlTrab);
		System.out.printf("\nS�lario Bruto:\t %.2f", salarioBruto);
		System.out.printf("\nINSS:\t %.2f", inss);
		System.out.printf("\nS�lario l�quido:\t %.2f", salarioLiq);

	}

}
