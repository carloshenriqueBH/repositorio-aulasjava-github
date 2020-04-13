package entities;

public class Retangulo {

	public double altura;
	public double largura;
	
	public double areaRetangulo() {
		return largura * altura;
	}
	public double perimetroRetangulo() {
		return 2 * (largura  + altura);
	}
	public double diagonalRetangulo() {
		return Math.sqrt((altura * altura) + (largura * largura));
	}
	
}
