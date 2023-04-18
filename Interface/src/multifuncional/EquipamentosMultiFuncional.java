package multifuncional;

import Equipamentos.Copiadora.Copiadora;
import Equipamentos.Digitalizadora.Digitalizadora;
import Equipamentos.Impressora.Impressora;

public class EquipamentosMultiFuncional implements Copiadora, Digitalizadora, Impressora {

	@Override // Serve para avisar que esta tento um sobreiscrita, que estou herdando esse metodo de alguem
	public void copiar() {
		System.out.println("Copiando via Equipamento Multifuncional");
	}
	@Override 
	public void digitalizar() {
		System.out.println("Digitalizando via Equipamento Multifuncional");
	}
	@Override 
	public void imprimir() {
		System.out.println("Imprimindo via Equipamento Multifuncional");
	}
}
