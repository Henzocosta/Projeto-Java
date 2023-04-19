package bb;

public abstract class Conta implements iConta{

	protected static int AGENCIA_PADRAO = 1;
	protected static int SEQUENCIAL = 1;
	protected int agencia;
	protected int conta;
	protected double saldo;
	protected Cliente cliente;
	
	public Conta(Cliente cliente) {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.conta = SEQUENCIAL++; 
		this.cliente = cliente;
	}
	
	
	
	@Override
	public void sacar(double valor) {	
		saldo -= valor;
		
	}
	@Override
	public void depositar(double valor) {
		saldo += valor;
	}
	@Override
	public void transferir(double valor, Conta contaDestino) {
		this.sacar(valor); // o this em algumas vezes esclarece bem o que esta sendo feito
		contaDestino.depositar(valor);
	}
	
	protected void imprimirInfoComuns() {
		System.out.println(String.format("Titular: %s ", this.cliente.getNome()));
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Conta: %d",  this.conta));
		System.out.println(String.format("Saldo: %.2f",  this.saldo));
	}

	
	public void sacar() {
		
	}
	public void depositar() {
		
	}
	public void transferir() {
		
	}
	public int getAgencia() {
		return agencia;
	}
	public int getConta() {
		return conta;
	}
	public double getSaldo() {
		return saldo;
	}
	
	
}
