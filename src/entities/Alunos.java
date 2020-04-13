package entities;

public class Alunos {
	public String nome;
	public double primeiro;
	public double segundo;
	public double terceiro;

	public double somaNotas() {
		return (primeiro + segundo + terceiro);
	}

	public double mediaNotas() {
		return somaNotas() / 3;
	}
	public double pontosMinimo() {
		return (somaNotas() * 60)/100;
	}

	public String toString() {
		double quantosFaltam;
		String situacao;
		if (somaNotas() < 60) {
			quantosFaltam = mediaNotas() - 60;
			situacao = "Reprovado";
			return situacao + " Faltaram " + String.format("%.2f%n", quantosFaltam);
		} else {
			quantosFaltam = 0;
			situacao = "Aprovado";
			return situacao;
		}

	}

}
