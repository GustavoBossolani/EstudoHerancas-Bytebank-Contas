package br.com.gustavo.bank.interfaces;

import java.util.Comparator;

import br.com.gustavo.bank.modelo.Conta;

public class NumeroContaComparator implements Comparator<Conta> {

	//Definindo o Critério de comparação
	@Override
	public int compare(Conta c1, Conta c2) {
		/*
		 * No método compare é definido os seguintes critérios:
		 * Caso as contas sejam iguais o retorno deve ser 0;
		 * Caso o primeiro parâmetro (c1) for maior que o segundo (c2) o retorno deve ser um numero positivo;
		 * Caso o primeiro parâmetro (c1) for menor que o segundo (c2) o retorno deve ser um numero negativo.
		 */
		
		//O método statico Integer.compare() já retorna os valores de acordo com o critério de comparação;
		//do método compare()
		return Integer.compare(c1.getNumeroConta(), c2.getNumeroConta());
	}

}
