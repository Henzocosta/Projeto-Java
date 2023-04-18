package lanchonete.atendimento.cozinha;

public class Almoxerife {
	private void controlarEntrada() {
		System.out.println("CONTROLANDO A ENTRADA DOS ITENS");
	}
	private void controlarSaida() {
		System.out.println("CONTROLANDO A SAIDA DOS ITENS");
	}
	 void entregarIngredientes() {
		System.out.println("ENTREGANDO INGREDIENTES");
		controlarSaida();
		//...?
		// Usando o modificador de acesso default para que o Estabelecimento nao fique sabendo de acoes
		// que sao apenas para o almoxerife e cozinheiro saber.
	}
	 void trocarGas() {
		System.out.println("ALMOXARIFE TROCANDO O GÁS");
	}
}
