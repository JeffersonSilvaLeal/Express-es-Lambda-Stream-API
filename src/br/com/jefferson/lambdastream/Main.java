package br.com.jefferson.lambdastream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		/**
		 * Recomendação usar java apartir da versão 11
		 */
		
		List<Integer> numbers = new ArrayList<Integer>(List.of(5, 3, 4 ,7 ,2));
		
	// 	NumberComparator comparator = new NumberComparator();
		
		/**
		 * 2 Modo 
		 */
	
		/*
		Comparator<Integer> comparator = new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return -o1.compareTo(o2);
			}
		
		
		};
		*/
		
		/**
		 * Expressão lambdas
		 */
		
		numbers.sort((o1, o2) -> -o1.compareTo(o2));		
		System.out.println(numbers);
		
		
		
	}

}
