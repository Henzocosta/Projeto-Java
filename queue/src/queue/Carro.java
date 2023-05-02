package queue;

public class Carro {

	String marca;
	
	public Carro() {
		
	}
	
	public Carro(String marca) {
		this.marca = marca;
	}
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	@Override
	public String toString() {
		return "Carro de Marca: " + marca;
	}
}
