package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Alunos;

public class NotasAluno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Alunos aluno = new Alunos();
		System.out.printf("Digite o nome do aluno:");
		aluno.nome = sc.next();
		System.out.printf("Digite a nota do 1° trimestre : ");
		aluno.primeiro = sc.nextDouble();
		System.out.printf("Digite a nota do 2° trimestre : ");
		aluno.segundo = sc.nextDouble();
		System.out.printf("Digite a nota do 3° trimestre : ");
		aluno.terceiro = sc.nextDouble();
		System.out.printf(" A soma das notas dos trimestres é: %.2f", aluno.somaNotas());
		System.out.println();
		System.out.printf(" A média das notas dos trimestres é: %.2f", aluno.mediaNotas());
		System.out.println();
		System.out.println(aluno);
		
		

	}

}
