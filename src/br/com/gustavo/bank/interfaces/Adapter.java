package br.com.gustavo.bank.interfaces;

import br.com.gustavo.bank.modelo.Conta;

public abstract interface Adapter {

	public abstract void adcionar(Object referencia);
	public abstract Object getRefAtPosition(int index);
	public abstract int getLenght();
	
}
