package br.com.jefferson.lambdastream1;

/**
 * 
 * @author jefferson.leal
 * Ao criar a uma interface funcional usar a anota��o
 * @FunctionalInterface pois ao criar m�todos duplicados,
 *  ela nos avisa em tempo de compila��o
 * Interface funcional = a posso usar express�o lambda
 */

@FunctionalInterface
public interface Operator {

	int execute(int x, int Y);
	
}
