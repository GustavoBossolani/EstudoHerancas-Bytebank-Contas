package br.com.gustavo.bank.modelo;

public class SaldoInsuficienteException extends Exception{
	
	public SaldoInsuficienteException(String msg) {
		super(msg);
	}

}
