package br.com.gustavo.bank.modelo;

import br.com.gustavo.bank.interfaces.Adapter;

public class ContasAdapter{
	
	private Conta[] contas;
	private int id;
	
	public ContasAdapter() {
		this.contas = new Conta[5];
	}


	public void adcionar(Conta conta) {
		contas[this.id] = conta;
		this.id ++;
	}

	public Conta getRefAtPosition(int index) {
		return contas[index];
	}
	
	public int getLenght() {
		return this.id;
	}

}
