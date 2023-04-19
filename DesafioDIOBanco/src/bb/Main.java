package bb;

public class Main {

	public static void main(String[] args) {
		Cliente henzo = new Cliente();
		henzo.setNome("Henzo");
		
		Conta conta = new ContaCorrente(henzo);
		conta.depositar(100);
		Conta contaP = new ContaPoupanca(henzo);
		conta.transferir(100, contaP);
		
		
		conta.imprimirExtrato();
		System.out.println();
		contaP.imprimirExtrato();
	}
}
