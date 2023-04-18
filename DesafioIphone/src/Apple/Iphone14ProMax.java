package Apple;

import funcionalGeral.Celular;

public class Iphone14ProMax {

	public static void main(String[] args) {
		Celular iphone = new Celular();
		
		iphone.ligar();
		iphone.atender();
		iphone.iniciarCorreioDeVoz();
		
		iphone.tocar();
		iphone.pausar();
		iphone.selecionarMusica();
		
		iphone.adicionarNovaAba();
		iphone.atualizarPagina();
		iphone.exibirPagina();
	}
}
