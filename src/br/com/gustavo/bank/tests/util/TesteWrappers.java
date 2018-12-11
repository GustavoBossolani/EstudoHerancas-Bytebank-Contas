package br.com.gustavo.bank.tests.util;

import java.util.ArrayList;
import java.util.List;

public class TesteWrappers {

	public static void main(String[] args) {
		
		
		// * Lembrando que o Autoboxing e Unboxing é feito por baixo dos panos
		 

		//Integer intRef = 17 - autoboxing automatico
		Integer intRef = Integer.valueOf(17);   // Autoboxing
		System.out.println(intRef.intValue()); // Unboxing
		
		//Double doubleRef = 15.8 - autoboxing automatico
		Double doubleRef = Double.valueOf(15.8);		 // Autoboxing
		System.out.println(doubleRef.doubleValue()); // Unboxing
		
		//Float floatRef = 10.1 - autoboxing automatico
		Float floatRef = Float.valueOf(10.1f); 		// Autoboxing
		System.out.println(floatRef.floatValue());	// Unboxing
		
		//Boolean boolRef = true - autoboxing automatico
		//Boolean boolRef = Boolean.valueOf(true);		// Autoboxing
		Boolean boolRef = Boolean.TRUE;
		System.out.println(boolRef.booleanValue()); // Unboxing
		
		Character charRef = Character.valueOf('G'); // Autoboxing
		System.out.println(charRef.charValue());	  //  Unboxing 	
		
		//Classe mãe dos wrappers Number, vale lembrar que number não possui o metodo de todos os Wrappers;
		//Ex: boolean.
		List<Number> valoresNumericos = new ArrayList<>();
		valoresNumericos.add(intRef);
		valoresNumericos.add(doubleRef);
		valoresNumericos.add(floatRef);
		
		System.out.println("Lista de Numbers:");
		for(Number valor : valoresNumericos) {
			//Unboxing executado automaticamente por baixo dos panos
			System.out.println(valor); 
		}
	}

}
