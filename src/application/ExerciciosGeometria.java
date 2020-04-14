package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Retangulo;

public class ExerciciosGeometria {

	public static void main(String[] args) {
		
		/*
		 * programa alterado e commitado em 14/04/2020
		 */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe os dados do retângulo:");
		System.out.print("Infome a altura: ");
		double altura = sc.nextDouble();
		System.out.print("Informe a largura: ");
		double largura = sc.nextDouble();
		Retangulo retangulo = new Retangulo();
		retangulo.altura = altura;
		retangulo.largura = largura;
		System.out.println();
		System.out.printf("A área do retângulo é : %.2f%n",retangulo.areaRetangulo());
		System.out.printf("O perímetro do retângulo é : %.2f%n",retangulo.perimetroRetangulo());
		System.out.printf("A diagonal do retângulo é : %.2f%n",retangulo.diagonalRetangulo());
		sc.close();
		
		
		

	}

}
