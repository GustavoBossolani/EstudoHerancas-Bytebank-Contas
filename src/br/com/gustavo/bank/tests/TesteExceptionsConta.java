package br.com.gustavo.bank.tests;

import br.com.gustavo.bank.modelo.Conta;
import br.com.gustavo.bank.modelo.ContaCorrente;
import br.com.gustavo.bank.modelo.SaldoInsuficienteException;

public class TesteExceptionsConta {
	
	public static void main(String[] args) {
		Conta conta = new ContaCorrente(123, 1234);
		conta.depositar(50.5);
		
		try {
			conta.sacar(40.0);
		} catch (SaldoInsuficienteException ex) {
			System.out.println("Exception: " + ex.getMessage());
			ex.printStackTrace();
		}
		System.out.println(conta.getSaldo());
	}
	

}
