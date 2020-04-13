package application;

import java.util.Locale;
import java.util.Scanner;

import util.Calculator;

public class CalculosCirculo {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Calculator calculo = new Calculator();
		
		System.out.println("Digite o raio do c�rculo: ");
		double raio = sc.nextDouble();
		double c = calculo.circunferencia(raio);
		double v = calculo.volume(raio);
		System.out.printf("O Volume do c�rculo � %.2f%n", v);
		System.out.printf("A circunfer�ncia do c�rculo � %.2f%n", c);
		
		sc.close();

	}

}
