package br.com.gustavo.bank.tests.util;

import java.util.List;
import java.util.ArrayList;

public class TesteListaPrimitivos {

	public static void main(String[] args) {

		/*
		 * Autoboxing é quando o java transforma um primitivo (qualquer um deles) em uma referência e ao contrário se chama Unboxing;
		 * Não sendo necessário a implementação de algum código ou método de alguma classe que faça essa conversão;
		 * O java realiza esta "ação" por baixo dos panos.
		 * 
		 * Wrappers são classes de "conversão": Integer, Double, Boolean, Characters, etc..
		*/
		//List<int> numeros = new ArrayList<int>(); - É impossível criar uma lista de primitivos
		int[] numeros = {0,1,2,3};
		
		// os (:) se lê como 'in'. - "Ei loop, percorra: em, dentro, durante .." (Lista ou Conjunto).
		for(int numero : numeros) {
			System.out.println("Array de numeros: " + numero);
		}
		
		//Criando uma nova lista
		List <Integer> listNumeros = new ArrayList<Integer>(numeros.length); //O Integer é o responsável pela  Autoboxing e Unboxing
		
		int idade = 20;
		//Aqui estamos fazendo um Autoboxing
		Integer idadeComoRef = Integer.valueOf(idade); //Criando uma referencia do numero inteiro: 20
		//Aqui estamos fazendo um Unboxing
		int idadeComoInteiro = idadeComoRef.intValue(); //Convertendo uma referencia em primitivo	
		
		//Adcionando os inteiros dentro da lista
		for(int numero : numeros) {
			//É possível adcionar numeros inteiros em uma lista pois ocorre o "evento" de Autoboxing
			listNumeros.add(numero);
		}
		System.out.println("---- Numeros adcionados na lista ----");
		
		for(Integer numero : listNumeros) {
			System.out.println("Lista de numeros: " + numero);
		}
		
	}

}
