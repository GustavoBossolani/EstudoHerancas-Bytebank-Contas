package br.com.gustavo.bank.testes.io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import br.com.gustavo.bank.modelo.ContaCorrente;

public class TesteDeserializacao {

	public static void main(String[] args) {
		try {
			ObjectInputStream ois = new ObjectInputStream( new FileInputStream("conta.bin"));
			ContaCorrente conta = (ContaCorrente) ois.readObject();
			ois.close();
			System.out.println(conta);
			
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		

	}

}
