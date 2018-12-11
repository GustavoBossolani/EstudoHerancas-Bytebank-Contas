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
		double taxaMovimenta��o = valor - this.taxa;
		super.depositar(taxaMovimenta��o);
	}
	
	@Override
	public void sacar(double valor) throws SaldoInsuficienteException {
		double taxaMovimenta��o = valor + this.taxa;
		super.sacar(taxaMovimenta��o);
	}
	
	@Override
	public String emitirTDM() {
		String mensagem = "Atualmente a taxa de Movimenta��o na Conta Poupan�a est� em: R$" + this.taxa + " reais";;
		return mensagem;
	}
	
	@Override
	public String toString() {
		
		return "Conta Poupan�a, " + super.toString();
	}
	
}
