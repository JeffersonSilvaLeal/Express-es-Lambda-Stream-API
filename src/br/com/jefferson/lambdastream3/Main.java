package br.com.jefferson.lambdastream3;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		
		List<String> words = List.of("Jefferson", "Maria", "Patricia", "Arthur", "Robson");
		
		
		List<String> filteredwords = words
				.stream()
				.filter(w -> w.startsWith("J"))
			//	.map(w -> w.toLowerCase())
				.map(String::toLowerCase)
				.collect(Collectors.toList());
		
		//filteredwords.forEach(w -> System.out.println(w));
		filteredwords.forEach(System.out::println);

	}

}
