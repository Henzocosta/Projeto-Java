package queue;

import java.util.LinkedList;
import java.util.Queue;

public class Main {

	public static void main(String[] args) {
		
		Queue<Carro> listaCarro = new LinkedList<>();
		
		listaCarro.add(new Carro("Ford"));
		listaCarro.add(new Carro("Chevrolet"));
		listaCarro.add(new Carro("Fiat"));

		System.out.println(listaCarro.add(new Carro("pegeot")));
		
		System.out.println(listaCarro);
		
		System.out.println(listaCarro.offer(new Carro("Renault")));
		// O metodo offer e muito parecido com o "add" mas a diferenca entre eles
		// e que caso o metodo "add" nao consiga adicionar algo na lista, ele vai
		// dar um erro, ja o metodo "offer" vai retornar apenas 
		//"true = conseguiu adicionar ou false = nao conseguiu adicionar
		
		System.out.println(listaCarro);
		
		System.out.println(listaCarro.peek());
		// O metodo vai pegar o elemento da cabeca da fila e retornar
		// Caso a fila esteja vazia, ele vai te retornar "null"
		System.out.println(listaCarro);
		
		System.out.println(listaCarro.poll());
		// O metodo poll ele vai remover o primeiro elemento da fila
		System.out.println(listaCarro);
		
		System.out.println(listaCarro.isEmpty());
		// O metodo isEmpty ele retorna se a fila esta vazia ou nao
		System.out.println(listaCarro);
		
		System.out.println(listaCarro.size());
		// Usado para informar o tamanho da fila
		System.out.println(listaCarro);
	}
}
