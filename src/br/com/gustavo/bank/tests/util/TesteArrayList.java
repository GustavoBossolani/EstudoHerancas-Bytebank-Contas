package br.com.gustavo.bank.tests.util;

import java.util.ArrayList;

import br.com.gustavo.bank.modelo.Cliente;
import br.com.gustavo.bank.modelo.Conta;
import br.com.gustavo.bank.modelo.ContaCorrente;
import br.com.gustavo.bank.modelo.ContaPoupanca;

public class TesteArrayList {

	public static void main(String[] args) {

		//Na linha a baixo o Array é definido sem um tipo ou seja, sem o Generics<>
		//ArrayList list = new ArrayList();
		
		ArrayList<Conta> list = new ArrayList<Conta>();
		
		Cliente cliente1 = new Cliente("Cainho", "147.852.369.50", "Impreendedor da Industria de Jornais");
		Cliente cliente2 = new Cliente("Toninho o Grande", "147.852.369.50", "Lixeiro");
		
		Conta conta1 = new ContaCorrente(123,4566);
		conta1.setTitular(cliente1);
		Conta conta2 = new ContaPoupanca(456,7897);
		conta2.setTitular(cliente2);

		list.add(conta1);
		list.add(conta2);
		
		System.out.println("Tamanho do ArrayList: " + list.size());
		
		 for(int i = 0; i < list.size(); i++) {
	            Object oRef = list.get(i);
	            System.out.println(oRef);
	        }

	        System.out.println("----------");

	        for(Conta refConta : list) {
	        	Conta conta = (Conta) refConta;
	            System.out.println(conta.getTitular().getNome());
	        }
		
	}

}
