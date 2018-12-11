package br.com.gustavo.bank.modelo;

import br.com.gustavo.bank.interfaces.Adapter;
import br.com.gustavo.bank.interfaces.AdapterHelper;

public class ObjectAdapter implements Adapter{

	private AdapterHelper helper;
	
	public ObjectAdapter(int lengh) {
		this.helper = new AdapterHelper(lengh);
	}
	
	@Override
	public void adcionar(Object referencia) {
		this.helper.adcionar(referencia);
	}
	
	@Override
	public Object getRefAtPosition(int index) {
		return this.helper.getRefAtPosition(index);
	}
	
	@Override
	public int getLenght() {
		return this.helper.getLenght();
	}
	
}
