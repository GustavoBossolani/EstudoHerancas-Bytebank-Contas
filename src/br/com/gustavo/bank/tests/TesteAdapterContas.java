package br.com.gustavo.bank.tests;

import br.com.gustavo.bank.modelo.Cliente;
import br.com.gustavo.bank.modelo.ContaCorrente;
import br.com.gustavo.bank.modelo.ContaPoupanca;
import br.com.gustavo.bank.modelo.ContasAdapter;
import br.com.gustavo.bank.modelo.ObjectAdapter;

public class TesteAdapterContas {

	public static void main(String[] args) {

		ObjectAdapter obAdapter = new ObjectAdapter(4);
		ContasAdapter adapter = new ContasAdapter();
		
		Cliente cliente = new Cliente("Gustavo", "473.455.378.54");
		Cliente cliente2 = new Cliente("Letícia", "123.456.789.10");
		
		ContaCorrente contaC1 = new ContaCorrente(124, 1460);
		ContaPoupanca contaP1 = new ContaPoupanca(124, 2425);
		
		obAdapter.adcionar(contaC1);
		obAdapter.adcionar(contaP1);
		
		ContaCorrente contaC2 = (ContaCorrente) obAdapter.getRefAtPosition(0);
		contaC2.setTitular(cliente);
		
		ContaPoupanca contaP2 = (ContaPoupanca) obAdapter.getRefAtPosition(1);
		contaP2.setTitular(cliente2);
		
		int tamanhoAdapter = adapter.getLenght();
		int tamahoObAdapter = obAdapter.getLenght();
		
		System.out.println("Tamanho Adappter contas: " + tamanhoAdapter);
		System.out.println("Tamanho adapter de objetos: " + tamahoObAdapter);
		
		System.out.println(contaC2);
		System.out.println(contaP2);
		
	}

}
