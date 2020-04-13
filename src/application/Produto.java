package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Produto {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		
		System.out.println("Informe os dados dos produtos:");
		System.out.print("Informe o nome do produto: ");
		String name = sc.nextLine();
		System.out.print("Informe o preço do produto: ");
		double price = sc.nextDouble();
		System.out.print("Informe a quantidade do produto: ");
		int quantity = sc.nextInt();
		Product product = new Product(name, price, quantity);
		System.out.println();
		System.out.println("Estoque atual: "+product);
		System.out.println();
		System.out.print("Informe a quantidade do produto a adicionar ao estoque: ");
		int quantidade = sc.nextInt();
		product.addProduct(quantidade);
		System.out.println();
		System.out.println("Estoque atualizado: "+product);
		
		System.out.println();
		System.out.print("Informe a quantidade do produto a remover ao estoque: ");
		quantidade = sc.nextInt();
		product.addProduct(quantidade);
		System.out.println();
		System.out.println("Estoque atualizado: "+product);
		
		sc.close();
	}

}
