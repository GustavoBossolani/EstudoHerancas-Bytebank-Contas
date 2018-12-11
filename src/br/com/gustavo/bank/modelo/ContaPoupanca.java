package br.com.gustavo.bank.modelo;

public class ContaPoupanca extends Conta {
	
	private double taxa = 0.20;
	


	public ContaPoupanca(int agencia, int numero) {
		super(agencia, numero);
	}
	
	public ContaPoupanca(int agencia, int numero, double saldo) {
		super(agencia, numero, saldo);
	}
	
	@Override
	public void depositar(double valor) {
		double taxaMovimentação = valor - this.taxa;
		super.depositar(taxaMovimentação);
	}
	
	@Override
	public void sacar(double valor) throws SaldoInsuficienteException {
		double taxaMovimentação = valor + this.taxa;
		super.sacar(taxaMovimentação);
	}
	
	@Override
	public String emitirTDM() {
		String mensagem = "Atualmente a taxa de Movimentação na Conta Poupança está em: R$" + this.taxa + " reais";;
		return mensagem;
	}
	
	@Override
	public String toString() {
		
		return "Conta Poupança, " + super.toString();
	}
	
}
