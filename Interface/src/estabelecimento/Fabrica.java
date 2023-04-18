package estabelecimento;



import Equipamentos.Copiadora.Copiadora;
import Equipamentos.Digitalizadora.Digitalizadora;
import Equipamentos.Digitalizadora.Scanner;
import Equipamentos.Impressora.DeskJet;
import Equipamentos.Impressora.Impressora;
import multifuncional.EquipamentosMultiFuncional;

public class Fabrica {
	
	public static void main(String[] args) {
		EquipamentosMultiFuncional em = new EquipamentosMultiFuncional();
		
		Scanner scanner = new Scanner();
		
		Impressora impressora = em;
		Digitalizadora digitalizadora = scanner;
		Copiadora copiadora = em;
		
		impressora.imprimir();
		digitalizadora.digitalizar();
		copiadora.copiar();
	}
}
