package ReceberDoisValores;

import java.util.Scanner;

public class Main_Main {

	public static void main(String[] args) {

		/*
		 * crie um código que recebe dois valores do usuário. Esses valores serão
		 * números inteiros. pergunte ao usuário que operação ele quer que seja
		 * executada(+. -, *, /). Daí seu programa deve fazer a operação.
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o primeiro valor: ");
		int primeiroValor = sc.nextInt();
		System.out.println("Digite o segundo valor: ");
		int segundoValor = sc.nextInt();

		int somar = primeiroValor + segundoValor;
		int subtrair = primeiroValor - segundoValor;
		int multiplicar = primeiroValor * segundoValor;

		System.out.println("Qual o tipo de operecao que deseja executar? ");

		int i;
		
		System.out.println("Digite 1 para somar");
		System.out.println("Digite 2 para subtrair");
		System.out.println("Digite 3 para multiplicar");
		if(segundoValor != 0) {
			System.out.println("Digite 4 para dividir");

		}

		i = sc.nextInt();

		if (i == 1) {
			System.out.println(somar);
		} else if (i == 2) {
			System.out.println(subtrair);
		} else if (i == 3) {
			System.out.println(multiplicar);
		} else if (i == 4) {
			int dividir;
			try {

				dividir = primeiroValor / segundoValor;
				System.out.println(dividir);
			} catch (ArithmeticException e) {
				System.out.println("Nao e possivel dividir por 0");
			}

		}

		sc.close();
	}

}
