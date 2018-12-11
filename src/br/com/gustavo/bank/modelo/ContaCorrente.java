package br.com.gustavo.bank.modelo;


public class ContaCorrente extends Conta {
	
	private double taxa = 0.50;
	
	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
	}
	
	public ContaCorrente(int agencia, int numero, double saldo) {
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
		String mensagem = "Atualmente a taxa de Movimentação na Conta Corrente está em: R$" + this.taxa + " reais";
		return mensagem;
	}

	@Override
	public String toString() {
		return "Conta Corrente, " + super.toString();
	}
	
}
