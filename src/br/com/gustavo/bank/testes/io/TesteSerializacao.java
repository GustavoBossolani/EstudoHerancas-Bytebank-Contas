package br.com.gustavo.bank.testes.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import br.com.gustavo.bank.modelo.Cliente;
import br.com.gustavo.bank.modelo.ContaCorrente;

public class TesteSerializacao{

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		
		ContaCorrente contaC = new ContaCorrente(123, 2246);
		contaC.depositar(500.0);
		
		Cliente cliente = new Cliente("Gustavo","473.455.378-54", "Dev");
        contaC.setTitular(cliente);
       
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("conta.bin"));
		oos.writeObject(contaC);
		oos.close();
		
		
    }
}
