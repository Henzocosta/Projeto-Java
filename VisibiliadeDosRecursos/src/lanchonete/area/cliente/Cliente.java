package lanchonete.area.cliente;
/*
 * Obs: private = Apenas a classe consegue acessar/enxergar
 * 		default = Fica visivel apenas para as classe dentro so pacote
 * 		public = Fica acessivel a todos.
 */
public class Cliente {
	public void escolherLanche() {
		System.out.println("ESCOLHENDO O LANCHE");
	}
	public void fazerPedido() {
		System.out.println("FAZENDO O PEDIDO");
	}
	public void pagarConta() {
		consultarSaldoAplicativo();
		System.out.println("PAGANDO A CONTA");
	}
	private void consultarSaldoAplicativo() {
		System.out.println("CONSULTANDO SALDO NO APLICATIVO");
	}
	
}


