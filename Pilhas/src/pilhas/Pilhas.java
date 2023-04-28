package pilhas;

public class Pilhas {

	private No refNoEntradaPilha;
	
	public Pilhas() {
		this.refNoEntradaPilha = null;
	}
	
	public void push(No novoNo) {
		// O metodo push ele acrescenta algo a mais na nossa pilha
		
		No refAuxiliar = refNoEntradaPilha;	// Estou guardando minha referencia de topo
		refNoEntradaPilha = novoNo; // Estou dizendo que minha referencia de topo sera o novoNo
		refNoEntradaPilha.setRefNo(refAuxiliar); //
		
	}
	
	public No pop() {
		if(!this.isEmpty()) {
			No noPoped = refNoEntradaPilha;
			refNoEntradaPilha = refNoEntradaPilha.getRefNo();
			return noPoped;
		}
		return null;
	}
	
	public No top() {
		
		// O metodo Top ele retorna a referencia, nao apaga, nao adicionar
		// apenas retorna a referencia independente de qualquer coisa.
		
		return refNoEntradaPilha;
	}
	
	public boolean isEmpty() {
		/*if(refNoEntradaPilha == null) {
			return true;
		}
		return false;*/
		
		return refNoEntradaPilha == null ? true : false;
		
		// Posso declarar desta duas formas, ambas estao agindo da mesma forma
	}
	
	public String toString() {
		
		String stringRetorno = "----------\n";
		
		stringRetorno += "   Pilha\n";
		stringRetorno += "----------\n";
		
		No noAuxiliar = refNoEntradaPilha;
		
		while(true) {
			if(noAuxiliar != null) {
				stringRetorno += "[No{dado = " + noAuxiliar.getDado() + "}]\n";
				noAuxiliar= noAuxiliar.getRefNo();
			} else {
				break;
			}
		}
		stringRetorno += "==========\n";
		return stringRetorno;
	}
}
