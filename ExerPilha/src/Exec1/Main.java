package Exec1;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Pilha pilha = new Pilha();
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=1; i<=10; i++) {
			System.out.println("Entre com um numero: ");
			int num = sc.nextInt();
			
			if(num %2 == 0) {
				
				System.out.println("Empilhando o numero " + num);
				pilha.push(new No(num));
			}else {
				No poped = pilha.pop();
				if(poped == null) {
					System.out.println("Pilha Vazia");
				}else {
					System.out.println("Numero impar, desempilhado: " + 
				poped);
				}
			}
		}
		
		System.out.println("Todos os numeros lidos!");
		
		while(pilha.isEmpty()) {
			
				System.out.println("desempilhado" + 
			pilha.pop());
		}
		System.out.println("Esvaziando");
		
		sc.close();
	}
}