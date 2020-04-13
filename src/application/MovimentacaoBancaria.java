package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;
import entities.Correntistas;

public class MovimentacaoBancaria {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Correntistas correntista;
		System.out.print("Entre o número da conta: ");
		int conta = sc.nextInt();
		System.out.print("Entre nome do correntista: ");
		sc.nextLine();
		String nome = sc.nextLine();
		System.out.print("Tem depósito inicial? (s/n) ");
		char resposta = sc.next().charAt(0);
		if (resposta== 's') {
			System.out.print("Entre o valor do depósito inicial: ");
			double depositoInicial = sc.nextDouble();
			correntista = new Correntistas(nome,conta,depositoInicial);
		} else {
			correntista = new Correntistas(nome,conta);
		}
		System.out.println();
		System.out.println("Dados da conta: ");
		System.out.println(correntista);
		
	    System.out.print("Entre um valor para depósito: ");
	    double valorDeposito = sc.nextDouble();
	    correntista.deposito(valorDeposito);
	    System.out.println("Dados da conta atualizada: ");
	    System.out.println();
	    System.out.println(correntista);
	    System.out.print("Entre um valor para saque: ");
	    double valorSaque = sc.nextDouble();
	    correntista.saque(valorSaque);
	    System.out.println("Dados da conta atualizada: ");
	    System.out.println();
	    System.out.println(correntista);
		
		sc.close();
	}
	
}
