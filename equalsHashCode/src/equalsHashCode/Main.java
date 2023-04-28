package equalsHashCode;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<Carro> listaCarro = new ArrayList<>();
		
		listaCarro.add(new Carro("BMW"));
		listaCarro.add(new Carro("Audi"));
		listaCarro.add(new Carro("Ferrari"));
		
		System.out.println(listaCarro.contains(new Carro("BMW")));
		System.out.println(new Carro("BMW").hashCode());
		System.out.println(new Carro("Audi").hashCode());
		
		listaCarro.remove(0);
		
		System.out.println(listaCarro);
		
		Carro carro1 = new Carro("BMW");
		Carro carro2 = new Carro("Audi");
		
		System.out.println(carro1.equals(carro2));
		
		// Metodo equals e hashCode, nos ajudam a testar se um objeto e igual
		// ao outro.
		
		
	}
}
