import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		/**
		 * Calcular a área de um trapézio:
		 */
		/*
		 * double topo = 6.0; double base = 8.0; double altura = 5.0; double area =
		 * ((topo + base) / 2) * altura; System.out.println("A área do trapézio é " +
		 * area);
		 */
		/**
		 * Usando Scanner
		 */
		/*
		 * 
		 * String x = s.next(); System.out.println("Você digitou "+x); int y =
		 * s.nextInt(); System.out.println("O N° digitado foi "+y); Scanner s = new
		 * Scanner(System.in);
		 */

		/*
		 * int minutos = sc.nextInt(); double conta = 50.00; if (minutos > 100) { conta
		 * += (minutos - 100) * 2.00; }
		 * System.out.printf("O valor da conta é: R$ %.2f%n",conta); sc.close();
		 */
		/*
		 * int x; for (int i = 0; i < 20; i++) { x = ((i % 2) == 0) ? 0 : 1;
		 * System.out.println(i + " " + x);
		 */

//		Locale.setDefault(Locale.US);
//		Scanner sc = new Scanner(System.in);
//		double largura = sc.nextDouble();
//		double comprimento = sc.nextDouble();
//		double metroQuadrado = sc.nextDouble();
//		double area = largura * comprimento;
//		double preco = area * metroQuadrado;
//		System.out.printf("Área: %.2f%n ", area);
//		System.out.printf("Preço: %.2f%n ", preco);
//		sc.close();

		/**
		 * Converter Celsus em Fahrenheit
		 */
		Scanner sc = new Scanner(System.in);
		/*
		 * Primeira forma de fazer:
		 */
//		char resp = 's';
//		while (resp != 'n') {
//
//			System.out.println("Digite a temperatura em Celsius ");
//			double temperaturaC = sc.nextDouble();
//			double temperaturaF = ((9 * temperaturaC) / 5) + 32;
//			System.out.printf("A temperatura em Fahrenheit é %.2f%n", temperaturaF);
//			System.out.println("Deseja repetir (s/n) ? ");
//			resp = sc.next().charAt(0);
//		}
		/*
		 * Segunda forma de fazer:
		 * 
		 */
		char resp;
		do {
			System.out.println("Digite a temperatura em Celsius ");
			double temperaturaC = sc.nextDouble();
			double temperaturaF = ((9 * temperaturaC) / 5) + 32;
			System.out.printf("A temperatura em Fahrenheit é %.2f%n", temperaturaF);
			System.out.println("Deseja repetir (s/n) ? ");
			resp = sc.next().charAt(0);
			
		} while (resp != 'n');
		

		sc.close();

	}
}
