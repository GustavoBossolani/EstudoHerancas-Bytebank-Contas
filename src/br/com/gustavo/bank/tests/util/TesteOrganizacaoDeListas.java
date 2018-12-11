package br.com.gustavo.bank.tests.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.com.gustavo.bank.interfaces.NumeroContaComparator;
import br.com.gustavo.bank.interfaces.TitularComparator;
import br.com.gustavo.bank.modelo.Cliente;
import br.com.gustavo.bank.modelo.Conta;
import br.com.gustavo.bank.modelo.ContaCorrente;
import br.com.gustavo.bank.modelo.ContaPoupanca;

public class TesteOrganizacaoDeListas {

	public static void main(String[] args) {
		
		List<Conta> contas = new ArrayList<>();
		
		Conta conta1 = new ContaCorrente(146, 2258, 200.0);
		Cliente cliente1 = new Cliente("Gustavo", "473.455.378-54","Desenvolvedor");
		conta1.setTitular(cliente1);
		
		Conta conta2 = new ContaPoupanca(146, 2025, 1000.0);
		Cliente cliente2 = new Cliente("Letícia", "123.456.789-10","Social Midia");
		conta2.setTitular(cliente2);
		
		Conta conta3 = new ContaCorrente(129, 5588, 500.0);
		Cliente cliente3 = new Cliente("Tarkão", "321.654.987-45","Mercenário");
		conta3.setTitular(cliente3);
		
		Conta conta4 = new ContaPoupanca(151, 1223, 800.0);
		Cliente cliente4 = new Cliente("Tonho", "741.258.963-32","Domador de Drgões");
		conta4.setTitular(cliente4);
		
		contas.add(conta1);
		contas.add(conta2);
		contas.add(conta3);
		contas.add(conta4);
		
		//Exibindo a ordem pardrão de inserção
		System.out.println("Lista com a ordem Padrão de inserção!");
		for (Conta conta : contas) {
			System.out.println(conta);
		}
		System.out.println("--------------------------------------------------------------------------------------------");
		
		//Ordenando de acordo com o numero da conta 
		contas.sort(new NumeroContaComparator()); //Método sort recebe um Comparator como parâmetro para definir o critério de comparação
		System.out.println("Lista com a ordem de acordo com o Numero da conta!");
		for (Conta conta : contas) {
			System.out.println(conta);
		}
		System.out.println("--------------------------------------------------------------------------------------------");
		
		
		//Ordenando de acordo com o nome do Títular da conta
		contas.sort(new TitularComparator());
		System.out.println("Lista com a ordem de acordo com o Títular da conta!");
		for (Conta conta : contas) {
			System.out.println(conta);
		}
		System.out.println("--------------------------------------------------------------------------------------------");
		
		//Ordenando de acordo com a ordem natural da Conta
		Collections.sort(contas);
		//Ao passar um Comparator como null, automaticamente a lista se ordenará usando seu critério de ordem natural
		//contas.sort(null);
		System.out.println("Lista com a ordem de acordo com a ordem Natural da conta! [Saldo]");
		for (Conta conta : contas) {
			System.out.println(conta);
		}
		System.out.println("--------------------------------------------------------------------------------------------");
		
		
		//Collections.rotate(contas, 3);
		//Collections.shuffle(contas);
		Collections.reverse(contas);
		
		//Collections sempre levará em consideração  a sobrescrita do método compareTo() na classe mãe da lista
		System.out.println("Lista com a ordem de acordo com o método do Collections!");
		for (Conta conta : contas) {
			System.out.println(conta);
		}
		System.out.println("--------------------------------------------------------------------------------------------");
		
	}

}
