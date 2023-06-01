package ArrayListELinkedList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ExemploList {

	/*
	 * 	ArrayList deve ser usado onde mais operacoes de pesquisa sao necessarias, e 
	 * LinkedList deve ser usado onde mais operacoes de insercao e exclusao sao necessarias.
	 */
	
	public static void main(String[] args) {
		
		System.out.println("Crie uma lista e adicione as sete notas: ");
		List<Double> notas = new ArrayList<>();
		
		// Metodo de adicao da lista 
		
		notas.add(7.0);
		notas.add(8.5);
		notas.add(9.3);
		notas.add(5.0);
		notas.add(7.0);
		notas.add(0.0);
		notas.add(3.6);
		
		System.out.println(notas);
		
		// Metodo de encontrar a posicao dentro da lista
		System.out.println("Exiba a posicao da nota 5.0: " + notas.indexOf(5d));
		
		// Metodo de adicao escolhendo a posicao que sera adicionado dentro da lista
		System.out.println("Adicione a lista a nota 8.0 na posicao 4: ");
		notas.add(4, 8d);
		System.out.println(notas);
		
		// Metodo de Substituicao
		System.out.println("Substitua a nota 5.0 pela nota 6.0: ");
		notas.set(3, 6d);
		System.out.println(notas);
		
		// Metodo para descobrir se o objeto se encontra na lista
		System.out.println("Confira se a nota 5.0 esta na lista: " + notas.contains(5d));
		
//		System.out.println("Exiba todas as notas na ordem em que foram informadas: ");
//		// Estou usando o for para que ela seja impressa uma abaixo da outra, como uma lista mesmo;
//		for(Double nota : notas) System.out.println(nota);
		
		System.out.println("Exiba a terceira nota adicionada: " + notas.get(2));
		System.out.println(notas.toString());
		
		System.out.println("Exiba a menor nota: " + Collections.min(notas));
		
		System.out.println("Exiba a maior nota: " + Collections.max(notas));

		System.out.println("Exiba a soma dos valores: ");
		Iterator<Double> iterator = notas.iterator();
		Double soma = 0d;
		while(iterator.hasNext()) {
			Double next = iterator.next();
			soma += next;
		}
		
		System.out.println("Exiba a soma dos valores: " + soma);
		
		System.out.println("Exiba a media das notas: " + (soma/notas.size()));
		
		System.out.println("Remova a nota 0: ");
		notas.remove(0.0);
		System.out.println(notas);
		
		System.out.println("Remova a posicao 0: ");
		notas.remove(0);
		System.out.println(notas);
		
		System.out.println("Remova as notas menores que 7 e exibaa lista: ");
		Iterator<Double> iterator1 = notas.iterator();
		while(iterator1.hasNext()) {
			Double next = iterator1.next();
			if(next < 7) iterator1.remove();
		}
		System.out.println(notas);
		
		// Metodo abaixo e usado para limpar toda a lista.
//		System.out.println("Apague toda a lista");
//		notas.clear();
//		System.out.println(notas);
		
		// Metodo usado para verificar se a lista esta vazia ou nao. E este metodo e do tipo 
		// boolean.
		System.out.println("Confira se a lista esta vazia: " + notas.isEmpty());
		
		System.out.println("--------------------");
		
		
		List<Double> notas2 = new LinkedList<>();
		
		System.out.println("Crie uma lista chamada notas 2: ");
		
		notas2.add(7.0);
		notas2.add(8.5);
		notas2.add(9.3);
		notas2.add(5.0);
		notas2.add(7.0);
		notas2.add(0.0);
		notas2.add(3.6);
		
		System.out.println(notas2);
		
		System.out.println("Mostre a primeira nota da nova lista sem remove-lo: " + notas2.get(0));
		
		System.out.println("Mostre a primeira nota da nova lista sem remove-lo: " + notas2.get(0));
		notas2.remove(0);
		
		System.out.println(notas2);
	} 
	
		
		
		
		
		
		
}
