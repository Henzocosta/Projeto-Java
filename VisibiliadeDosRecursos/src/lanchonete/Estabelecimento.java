package lanchonete;

import lanchonete.area.cliente.Cliente;
import lanchonete.atendimento.Atendente;
import lanchonete.atendimento.cozinha.Almoxerife;
import lanchonete.atendimento.cozinha.Cozinheiro;

public class Estabelecimento {
	public static void main(String[] args) {
		Cozinheiro cozinheiro = new Cozinheiro();
		//ações que não precisam estarem disponíveis para toda a aplicação
		// Todos os metodos desnecassarios foram modificado com o "private"
		
		//ações que estabelecimento precisa ter ciência
		cozinheiro.adicionarSucoNoBalcao();;
		cozinheiro.adicionarLancheNoBalcao();
		cozinheiro.adicionarComboNoBalcao();
		
		
		// Almoxerife almoxarife = new Almoxerife();
		//ações que não precisam estarem disponíveis para toda a aplicação
		// Todos os metodos desnecassarios foram modificado com o "private"
		
		
		Atendente atendente = new Atendente();
		atendente.servindoMesa();
		
		atendente.receberPagamento();
		
		
		
		Cliente cliente = new Cliente();
		cliente.escolherLanche();
		cliente.fazerPedido();
		cliente.pagarConta();
		
	
		
		
		
		
		
	}
}
