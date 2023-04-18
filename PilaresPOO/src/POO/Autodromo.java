package POO;

public class Autodromo {
	public static void main(String[] args) {
		Carro jeep = new Carro();
		jeep.setChassi("10102020");
		jeep.Ligar();
		//System.out.println(jeep.getChassi());
		
		Moto z400 = new Moto();
		z400.setChassi("10103030");
		z400.Ligar();
		//System.out.println(z400.getChassi());
	}
}
