package br.com.residencia;

public class Lista3_6 {

	public static void main(String[] args) {
//		O “mini DP” aumentou seus cálculos. Agora, considera a jornada de trabalho semanal de um
//		funcionário, que é de 40 horas. O funcionário que trabalhar mais de 40 horas receberá hora
//		extra, cujo cálculo é o valor da hora regular com um acréscimo de 50%. 
//		Considerando que o mês possui 4 semanas exatas, e que a entrada de horas será um valor maior
//		que a jornada normal.
//		Salário base (valor da hora * horas normais)
//		Valor de horas extras
//		Valor do desconto para o INSS
//		Salário líquido (Salário base + horas extras – desconto INSS)
//		Imprimir o contracheque do funcionário.

		double hrTrab = 220.0, vlTrab = 30.16, salarioBruto = hrTrab * vlTrab, inss = salarioBruto * 12 / 100,
				horaExtra = vlTrab * 50 / 100 + vlTrab, horaExTrab = 5 * horaExtra,
				salarioLiq = salarioBruto + horaExTrab - inss;
		String nome = "Fulano";
		System.out.println("---Mini Departamento pessoal---");
		System.out.println("Contra cheque");
		System.out.println("Funcionário:\t" + nome);
		System.out.println("Horas trabalhadas mensais:\t" + hrTrab);
		System.out.println("Valor da hora:\t" + vlTrab);
		System.out.println("Sálario Bruto:\t" + salarioBruto);
		System.out.println("INSS:\t" + inss);
		System.out.println("Valor hora extra:\t" + horaExtra);
		System.out.println("Hora extra trabalhadas:\t" + (horaExTrab - hrTrab));
		System.out.println("Sálario líquido:\t" + salarioLiq);

	}

}
