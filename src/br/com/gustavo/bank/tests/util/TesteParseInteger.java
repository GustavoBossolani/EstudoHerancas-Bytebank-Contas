package br.com.gustavo.bank.tests.util;

public class TesteParseInteger {

	public static void main(String[] args) {
		Integer ref = Integer.valueOf("3"); //valueOf() retorna uma referencia, precisando fazer autoboxing e unboxing
		int valor = Integer.parseInt("3");  //parseInt() retorna um primitivo não precisando fazer autoboxing e unboxing
		valor++;
        ref++;
        System.out.println(ref);
        System.out.println(valor);
	}

}
