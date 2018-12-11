package br.com.gustavo.bank.tests.util;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class TesteLambda {

	public static void main(String[] args) {
		
		List<String> jogos = new ArrayList<>();
		jogos.add("World of Warcraft");
		jogos.add("Dark souls 3");
		jogos.add("WYD");
		jogos.add("Naruto Storm Ninja");
		jogos.add("Devil may cry");
		jogos.add("Age of Empires");
		
		//Este c�digo estranho � um Lambda! (Um "enxugador" de sintaxe de classes an�nimas)
		jogos.sort((s1,s2) -> s1.compareTo(s2));
		
		System.out.println("Lista ordenada: ");
		
		//forEach() da pr�pria lista usando Lambda
		jogos.forEach((jogo) -> System.out.println("Jogo: " + jogo));
	}

}
