package funcionalGeral;

import AparelhoTelefonico.CorreiodeVoz.iniciarCorreioDeVoz;
import AparelhoTelefonico.atender.atender;
import AparelhoTelefonico.ligar.ligar;
import Musica.pausar.pausar;
import Musica.selecionarMusica.selecionarMusica;
import Musica.tocar.tocar;
import Navegador.add.adicionarNovaAba;
import Navegador.atualizar.atualizarPagina;
import Navegador.exibir.exibirPagina;

public class Celular implements atender, iniciarCorreioDeVoz, ligar, tocar, pausar, selecionarMusica, adicionarNovaAba, atualizarPagina, exibirPagina  {

	@Override
	public void exibirPagina() {
		System.out.println("Exibindo Safari");
		
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Atualizando pagina");
		
	}

	@Override
	public void adicionarNovaAba() {
		
		System.out.println("Abrindo nova Aba");
		
	}

	@Override
	public void selecionarMusica() {
		System.out.println("Selecionando Musica");
		
	}

	@Override
	public void pausar() {
		System.out.println("Pausando Musica");
		
	}

	@Override
	public void tocar() {
		System.out.println("Tocando Musica");
		
	}

	@Override
	public void ligar() {
		System.out.println("Ligando para: ");
		
	}

	@Override
	public void iniciarCorreioDeVoz() {
		System.out.println("Grave seu correio de voz");
		
	}

	@Override
	public void atender() {
		System.out.println("Atendendo Ligacao");
		
	}

}
