package br.com.gustavo.bank.tests;

import br.com.gustavo.bank.modelo.Cliente;
import br.com.gustavo.bank.modelo.Conta;

public class Main {
	
	public static void main(String[] args) {
		
		/*
		Conta contaDoJamil = new Conta();
		contaDoJamil.depositar(100);
		
		Conta contaDoRomulo = new Conta();
		contaDoRomulo.depositar(150);
		
		System.out.println("Saldo da conta do Jamil é: " + contaDoJamil.saldo);
		System.out.println("Saldo da conta do Romulo é: " + contaDoRomulo.saldo);
		
		contaDoJamil.transferir(70, contaDoRomulo);

		System.out.println("Saldo da conta do Jamil é: " + contaDoJamil.saldo);
		System.out.println("Saldo da conta do Romulo é: " + contaDoRomulo.saldo);
		*/
		
		/*
		Conta contaDoGustavo = new Conta();
		Cliente gustavo = new Cliente();
		
		contaDoGustavo.depositar(100);
		contaDoGustavo.titular = gustavo;
		
		gustavo.nome = "Gustavo Bossolani";
		gustavo.cpf = "473.455.378-54";
		gustavo.profissao = "Programador de Games";
		*/
		
		/*
		Conta conta = new Conta();
		Cliente gustavo = new Cliente();
		
		conta.setTitular(gustavo);
		conta.getTitular().setNome("Gustavo de Oliveira Bossolani");
		conta.getTitular().setCpf("473.455.378-54");
		conta.getTitular().setProfissao("Programador");
		conta.setNumeroConta(77152);
		conta.setAgencia(146);
		conta.depositar(70.00);
		
		System.out.println(conta);
		
		
		Conta contaGustavo = new Conta(77152, 2546, 10);
		Cliente gustavo = new Cliente("Gustavo Bossolani", "473.455.378-54");
		contaGustavo.setTitular(gustavo);
		System.out.println(contaGustavo.getSaldo());
		System.out.println(contaGustavo.getTitular().getProfissao());
		
		Conta contaJamil = new Conta(4564, 4864);
		System.out.println(Conta.getTotalContasAbertas());
		*/
	}

}
