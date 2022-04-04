package br.com.jefferson.lambdastream1;

/**
 * 
 * @author jefferson.leal
 * Ao criar a uma interface funcional usar a anotação
 * @FunctionalInterface pois ao criar métodos duplicados,
 *  ela nos avisa em tempo de compilação
 * Interface funcional = a posso usar expressão lambda
 */

@FunctionalInterface
public interface Operator {

	int execute(int x, int Y);
	
}
