package br.com.residencia;

public class Lista3_5 {

	public static void main(String[] args) {
//O programa “mini departamento pessoal” lê a quantidade de horas trabalhadas por um funcionário
//em um mês, o valor que ele recebe por hora e o percentual de desconto para o INSS, e calcula:
//O salário bruto (horas trabalhadas * valor hora)
//O valor do desconto para o INSS
//O salário líquido (adicionais menos descontos).
//Após os cálculos, será impresso o contra cheque  
//(Salário bruto, valor do desconto do INSS, e o salário líquido do funcionário).

		double hrTrab = 220.0, vlTrab = 30.16, salarioBruto = hrTrab * vlTrab, inss = salarioBruto * 12 / 100,
				salarioLiq = salarioBruto - inss;
		String nome = "Fulano";
		System.out.println("---Mini Departamento pessoal---");
		System.out.println("Contra cheque");
		System.out.println("Funcionário:\t" + nome);
		System.out.println("Horas trabalhadas mensais:\t" + hrTrab);
		System.out.println("Valor da hora:\t" + vlTrab);
		System.out.printf("\nSálario Bruto:\t %.2f", salarioBruto);
		System.out.printf("\nINSS:\t %.2f", inss);
		System.out.printf("\nSálario líquido:\t %.2f", salarioLiq);

	}

}
