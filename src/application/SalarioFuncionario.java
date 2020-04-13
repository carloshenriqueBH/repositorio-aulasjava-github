package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;

public class SalarioFuncionario {
	public static void main(String[] args) {
		Funcionario funcionario = new Funcionario();
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe os dados do funcion�rio:");
		System.out.println();
		System.out.print("Nome do funcion�rio: ");
		funcionario.nome = sc.next();
		System.out.println();
		System.out.print("Sal�rio bruto do funcion�rio: ");
		funcionario.salarioBruto = sc.nextDouble();
		System.out.println();
		System.out.print("Imposto retido: ");
		funcionario.imposto = sc.nextDouble();
		double liquido = funcionario.salarioLiquido();
		System.out.println(funcionario);
		System.out.println();
		System.out.print("Porcentagem de reajuste do sal�rio: ");
		double porcentagem = sc.nextDouble();
		double salarioReajustado = funcionario.salarioReajustado(porcentagem);
		System.out.println();
		System.out.println(funcionario);
		
		sc.close();
		
	}
	

}
