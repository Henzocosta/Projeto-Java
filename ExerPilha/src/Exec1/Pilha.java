package Exec1;

public class Pilha {

	private No refEntradaPilha;
	
	public Pilha() {
		this.refEntradaPilha = null;
	}
	
	public void push(No novoNo){
		
		No noAuxiliar = refEntradaPilha;
		refEntradaPilha = novoNo;
		refEntradaPilha.setRefEntradaPilha(noAuxiliar);	
	}
	public No pop() {
		if(!this.isEmpty()) {
			No poped = refEntradaPilha;
			refEntradaPilha = refEntradaPilha.getRefEntradaPilha();
			return poped;	
		}
		return null;
	}
	public No top() {
		return refEntradaPilha;
	}
	
	
	
	
	public boolean isEmpty() {
		return refEntradaPilha == null ? true : false;
	}
}
