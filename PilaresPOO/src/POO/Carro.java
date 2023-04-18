package POO;

public class Carro extends Veiculo{
	
	public void Ligar() {
		ConferindoCambil();
		ConferindoCombustivel();
		System.out.println("Carro Ligado");
	}
	private void ConferindoCombustivel() {
		System.out.println("Conferindo Combustivel");
	}
	private void ConferindoCambil() {
		System.out.println("Conferindo Cambil em P");
	}
	
	// O que fizemos foi o metodo de emcapsulamento, usando apenas o metodo ligar como publico
}
