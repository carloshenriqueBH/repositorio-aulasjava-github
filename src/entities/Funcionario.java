package entities;

public class Funcionario {
	public String nome;
	public double salarioBruto;
	public double imposto;
	
	public double salarioLiquido() {
		return salarioBruto - imposto;
	}
	
	public double salarioReajustado(double porcentagem) {
		this.salarioBruto = ((salarioBruto * porcentagem)/100)+salarioBruto;
		return salarioBruto;
	}
	public String toString() {
		return "Salário bruto do funcionário "+nome
				+" $ "+String.format("%.2f", salarioBruto)
				+" valor do imposto retido: $ "+String.format("%.2f", imposto)+
				" valor do salário líquido "+String.format("%.2f", salarioLiquido());
	}
}
