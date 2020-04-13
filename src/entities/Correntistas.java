package entities;
public class Correntistas {
	private int numeroConta;
	private String nomeCorrentista;
	private double saldoConta;	
	public Correntistas(String nomeCorrentista, int numeroConta) {
		this.nomeCorrentista = nomeCorrentista;
		this.numeroConta = numeroConta;
	}
	public Correntistas(String nomeCorrentista, int numeroConta, double depositoInicial) {
		this.nomeCorrentista = nomeCorrentista;
		this.numeroConta = numeroConta;
		deposito(depositoInicial);
	}	
	public String getNomeCorrentista() {
		return nomeCorrentista;
	}
	public void setNomeCorrentista(String nomeCorrentista) {
		this.nomeCorrentista = nomeCorrentista;
	}
	public double getSaldoConta() {
		return saldoConta;
	}
	public int getNumeroConta() {
		return numeroConta;
	}	
	public void deposito(double valor) {
		saldoConta += valor;			
	}
	public void saque(double valor) {
		saldoConta -= (valor + 5.00);		
	}
	public String toString() {
		return "N° da conta: "+numeroConta
				+", Correntista: "
				+nomeCorrentista+" Saldo da conta: $ "+String.format("%.2f",saldoConta);
	}
}
