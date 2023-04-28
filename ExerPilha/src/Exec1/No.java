package Exec1;

public class No {
	
	private int dado;
	private No refEntradaPilha;
	
	public No() {
	}
	public No(int dado) {
		this.refEntradaPilha = null;
	}
	
	public int getDado() {
		return dado;
	}
	public void setDado(int dado) {
		this.dado = dado;
	}
	public No getRefEntradaPilha() {
		return refEntradaPilha;
	}
	public void setRefEntradaPilha(No refEntradaPilha) {
		this.refEntradaPilha = refEntradaPilha;
	}

}
