package br.com.gustavo.bank.modelo;

import java.io.Serializable;

/**
 * Esta classe é um modelo de uma conta, possuindo ramificações de conta corrente e conta poupança.
 * 
 * @author Gustavo Bossolani
 * @version 1.0
 */

public abstract class Conta implements Comparable<Conta>, Serializable{

	//podemos usar a palavra chave transient para ignorar a Serialização do campo;
	//ex: private transient String endereco; - Este campo não será Serializado
	//É boa prática colocar o atributo estático serialVersionUID para versionar a classe;
	private static final long serialVersionUID = -50132125283196697L;
	
	private double saldo;
	private int agencia;
	private int numeroConta;
	private Cliente titular;
	
	private static int totalContasAbertas;
	
	/**
	 * Crianção de conta a partir destes 3 valores.
	 * 
	 * @param agencia
	 * @param numeroConta
	 * @param saldo
	 */
	public Conta(int agencia, int numeroConta,  double saldo) {
		
		if(agencia > 1000 || agencia < 99 && agencia < 0) {
			throw new IllegalArgumentException("Agencia foi digitado errado. " + "Valor digitado: " + agencia);
		}
		
		if(numeroConta > 10000 || numeroConta < 999 && numeroConta < 0) {
			throw new IllegalArgumentException("Numero de conta foi digitado errado. " + "Valor digitado: " + numeroConta);
		}
		
		Conta.totalContasAbertas++;
		this.agencia = agencia;
		this.numeroConta = numeroConta;
		this.depositar(saldo);
		System.out.println("Conta aberta! Seu dinheiro total na conta é de: R$" + this.saldo);
	}
	
	/**
	 * 
	 * Criação de conta, com a diferença de que não será inicializada com saldo.
	 * 
	 * @param agencia
	 * @param numeroConta
	 */
	public Conta(int agencia, int numeroConta) {
		this(agencia, numeroConta, 0);
	}
	
	public abstract String emitirTDM();
	
	public void depositar(double valor) {
		this.saldo += valor;
	}
	
	public void sacar(double valor) throws SaldoInsuficienteException{
		if(this.saldo < valor) {
			throw new SaldoInsuficienteException("Saldo atual: R$" + this.saldo + ", Valor com TDM: R$" + valor);
		}
		this.saldo -= valor;
	}
	
	/**
	 * Valor de transferência é relativo para cada conta
	 * Exemplo: De conta corrente para conta poupança, a taxa será de: 0.70 | conta corrente = taxa de 0.50 | conta poupança = taxa de 0.20
	 * Pois é somado o valor de movimentação de cada conta especifica.
	 * 
	 * @param valor
	 * @param destino
	 * @throws SaldoInsuficienteException
	 */
	public void transferir(double valor, Conta destino) throws SaldoInsuficienteException {
		this.sacar(valor);
		destino.depositar(valor);
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}
	
	public int getNumeroConta() {
		return this.numeroConta;
	}
	
	public int getAgencia() {
		return agencia;
	}
	
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	
	public Cliente getTitular() {
		return titular;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public static int getTotalContasAbertas() {
		System.out.print("O total de contas abertas no momento é de: ");
		return Conta.totalContasAbertas;
	}
	
	@Override
	public String toString() throws NullPointerException{
		
		return 
				"Títular: " + this.getTitular().getNome() + ", " +
				"Agência: " + this.getAgencia() + ", " +
				"Numero da Conta: " + this.getNumeroConta() + ", " +
				"Saldo Atual: R$" + this.getSaldo() + ".";
	}
	
	//Critério de igualdade para inserção de novos modelos em listas
	@Override
	public boolean equals(Object obj) {
		Conta outraConta = (Conta) obj;
		if(this.numeroConta != outraConta.getNumeroConta()) {
			return false;
		}
		return true;
	}
	
	//Critério para comparação natural de contas em uma lista
	@Override
	public int compareTo(Conta outraConta) {
		return Double.compare(this.saldo, outraConta.saldo);
	}
	
}
