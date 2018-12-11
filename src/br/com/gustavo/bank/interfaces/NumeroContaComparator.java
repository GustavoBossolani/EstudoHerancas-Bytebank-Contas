package br.com.gustavo.bank.interfaces;

import java.util.Comparator;

import br.com.gustavo.bank.modelo.Conta;

public class NumeroContaComparator implements Comparator<Conta> {

	//Definindo o Crit�rio de compara��o
	@Override
	public int compare(Conta c1, Conta c2) {
		/*
		 * No m�todo compare � definido os seguintes crit�rios:
		 * Caso as contas sejam iguais o retorno deve ser 0;
		 * Caso o primeiro par�metro (c1) for maior que o segundo (c2) o retorno deve ser um numero positivo;
		 * Caso o primeiro par�metro (c1) for menor que o segundo (c2) o retorno deve ser um numero negativo.
		 */
		
		//O m�todo statico Integer.compare() j� retorna os valores de acordo com o crit�rio de compara��o;
		//do m�todo compare()
		return Integer.compare(c1.getNumeroConta(), c2.getNumeroConta());
	}

}
