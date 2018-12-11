package br.com.gustavo.bank.tests.util;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TesteClasseAnonima {

	public static void main(String[] args) {
		
		List<Integer> numeros = new ArrayList<>();
		numeros.add(54);
		numeros.add(3);
		numeros.add(15);
		numeros.add(700);
		
		for (Integer integer : numeros) {
			System.out.println(integer);
		}
		
		//Isso é uma classe anônima
		numeros.sort(new Comparator<Integer>() {
			@Override
			public int compare(Integer it1, Integer it2) {
				return Integer.compare(it1, it2);
			}
		});
		
		System.out.println("Exibindo lista ordenada!");
		for (Integer integer : numeros) {
			System.out.println(integer);
		}
		
	}

}
