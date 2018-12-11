package br.com.gustavo.bank.interfaces;

import br.com.gustavo.bank.modelo.Conta;

public class AdapterHelper{
	
	private Object[] referencias;
	private int id;

	public AdapterHelper(int lengh) {
		this.referencias = new Object[lengh];
	}
	
	public void adcionar(Object referencia) {
		this.referencias[id] = referencia;
		id++;
	}

	public Object getRefAtPosition(int index) {
		return this.referencias[index];
	}

	public int getLenght() {
		return id;
	}

	
	
}
