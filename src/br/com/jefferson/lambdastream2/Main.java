package br.com.jefferson.lambdastream2;

import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {

		List<String> words = List.of("Carlos", "José", "Joana", "Maria", "Celso");
		
		/**
		 * Stream fluxo de informações
		 * Retornar apenas pessoas que tem a letra J
		 */
		
		List<String>filteredWords = words.stream()
			 .filter(w -> w.startsWith("J"))
			 .map(w -> w.toLowerCase())
			 .collect(Collectors.toList());
		
		filteredWords.forEach(w -> System.out.println(w));
		
	}

}
