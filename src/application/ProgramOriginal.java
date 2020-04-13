package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class ProgramOriginal {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		/**
		 * Vers�o do programa utilizando OOP
		 */
		Triangle x = new Triangle();
		Triangle y = new Triangle();
		System.out.println("Entre as medidas do triangulo X: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		System.out.println("Entre as medidas do triangulo Y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		double areaX = x.area();
		double areaY = y.area();

		/**
		 * Vers�o do programa sem utilizar OOP
		 */

//		double xA, xB, xC, yA, yB, yC;//
//		System.out.println("Entre as medidas do triangulo X: ");
//		xA = sc.nextDouble();
//		xB = sc.nextDouble();
//		xC = sc.nextDouble();
//		System.out.println("Entre as medidas do triangulo Y: ");
//		yA = sc.nextDouble();
//		yB = sc.nextDouble();
//		yC = sc.nextDouble();//
//		double p = (xA + xB + xC) / 2;
//		double areaX = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));
//		p = (yA + yB + yC) / 2;
//		double areaY = Math.sqrt(p * (p - yA) * (p - yB) * (p - yC));
//
//		
		System.out.printf("A �rea do triangulo X � %.4f%n", areaX);
		System.out.printf("A �rea do triangulo Y � %.4f%n", areaY);

		if (areaX > areaY) {
			System.out.println("A maior �rea � a do triangulo X");
		} else {
			System.out.println("A maior �rea � a do triangulo Y");

		}
		sc.close();

	}

}
