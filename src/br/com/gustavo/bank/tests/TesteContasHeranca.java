package br.com.gustavo.bank.tests;

import br.com.gustavo.bank.modelo.ContaCorrente;
import br.com.gustavo.bank.modelo.ContaPoupanca;
import br.com.gustavo.bank.modelo.SaldoInsuficienteException;

public class TesteContasHeranca {

	public static void main(String[] args) throws SaldoInsuficienteException {
		
		ContaCorrente contaCorrenteDoJuao = new ContaCorrente(123, 1460, 100.0);
		//contaCorrenteDoJuao.getTitular().setNome("Juao Almeida");
		contaCorrenteDoJuao.sacar(20.0);
		
		ContaPoupanca contaPoupancaDoJuao = new ContaPoupanca(123, 1365);
		//contaPoupancaDoJuao.getTitular().setNome("Juao Almeida");
		contaPoupancaDoJuao.depositar(50.0);
		
		contaCorrenteDoJuao.transferir(79.0, contaPoupancaDoJuao);
		
		System.out.println("Conta corrente do Juão: " + contaCorrenteDoJuao.getSaldo());
		System.out.println("Conta poupança do Juão: " + contaPoupancaDoJuao.getSaldo());
		
		System.out.println(contaCorrenteDoJuao.emitirTDM());
		System.out.println(contaPoupancaDoJuao.emitirTDM());
		
		System.out.println(contaCorrenteDoJuao.getTotalContasAbertas());
	}

}

