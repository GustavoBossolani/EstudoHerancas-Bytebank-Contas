package br.com.gustavo.bank.tests.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import br.com.gustavo.bank.modelo.Conta;
import br.com.gustavo.bank.modelo.ContaCorrente;
import br.com.gustavo.bank.modelo.ContaPoupanca;

public class TesteArrayEquals {

	public static void main(String[] args) {
		List<String> argumentos = Arrays.asList(args);//Transformando o String[] args em um ArrayList
		
		//Criando um array de um tipo mais especifico
		//ArrayList<Conta> contas = new ArrayList<Conta>();
		
		//Criando um array de um tipo mais genérico
		List<Conta> contas = new ArrayList<Conta>();
		
		ContaCorrente conta1 = new ContaCorrente(146,2465);
		ContaCorrente conta2 = new ContaCorrente(292, 7815); //292, 7815
		ContaCorrente conta3 = new ContaCorrente(146, 2465);
		
		contas.add(conta1);
		contas.add(conta2);
		
		//O retorno deste println será TRUE pois o contains está comparando o NUMERO DA CONTA e o NUMERO DA AGENCIA
		System.out.println("Minha lista contem a conta3? " + contas.contains(conta3));
		
		//Para cada CONTA em (:) CONTAS, faça: ..
		for(Conta conta : contas) {
			System.out.println("Agencia: " + conta.getAgencia() + " Numero da Conta: " + conta.getNumeroConta());
		}
	}

}
