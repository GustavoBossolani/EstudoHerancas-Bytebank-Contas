package br.com.gustavo.bank.tests.util;

import java.util.List;
import java.util.ArrayList;

public class TesteListaPrimitivos {

	public static void main(String[] args) {

		/*
		 * Autoboxing � quando o java transforma um primitivo (qualquer um deles) em uma refer�ncia e ao contr�rio se chama Unboxing;
		 * N�o sendo necess�rio a implementa��o de algum c�digo ou m�todo de alguma classe que fa�a essa convers�o;
		 * O java realiza esta "a��o" por baixo dos panos.
		 * 
		 * Wrappers s�o classes de "convers�o": Integer, Double, Boolean, Characters, etc..
		*/
		//List<int> numeros = new ArrayList<int>(); - � imposs�vel criar uma lista de primitivos
		int[] numeros = {0,1,2,3};
		
		// os (:) se l� como 'in'. - "Ei loop, percorra: em, dentro, durante .." (Lista ou Conjunto).
		for(int numero : numeros) {
			System.out.println("Array de numeros: " + numero);
		}
		
		//Criando uma nova lista
		List <Integer> listNumeros = new ArrayList<Integer>(numeros.length); //O Integer � o respons�vel pela  Autoboxing e Unboxing
		
		int idade = 20;
		//Aqui estamos fazendo um Autoboxing
		Integer idadeComoRef = Integer.valueOf(idade); //Criando uma referencia do numero inteiro: 20
		//Aqui estamos fazendo um Unboxing
		int idadeComoInteiro = idadeComoRef.intValue(); //Convertendo uma referencia em primitivo	
		
		//Adcionando os inteiros dentro da lista
		for(int numero : numeros) {
			//� poss�vel adcionar numeros inteiros em uma lista pois ocorre o "evento" de Autoboxing
			listNumeros.add(numero);
		}
		System.out.println("---- Numeros adcionados na lista ----");
		
		for(Integer numero : listNumeros) {
			System.out.println("Lista de numeros: " + numero);
		}
		
	}

}
