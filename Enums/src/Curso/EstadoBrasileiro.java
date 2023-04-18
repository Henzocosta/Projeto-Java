package Curso;

//Criando o enum EstadoBrasileiro para ser usado em toda a aplicação.
public enum EstadoBrasileiro {
	SAO_PAULO ("SP","São Paulo", 11),
	RIO_JANEIRO ("RJ", "Rio de Janeiro", 12),
	PIAUI ("PI", "Piauí", 13),
	MARANHAO ("MA","Maranhão", 14), 
	CEARA("CE", "Ceara", 15);
	
	private String nome;
	private String sigla;
	private int Ibge;
	
	private EstadoBrasileiro(String sigla, String nome, int Ibge) {
		this.sigla = sigla;
		this.nome = nome;
		this.Ibge = Ibge;
	}
	public int getIbge() {
		return Ibge;
	}
	public String getSigla() {
		return sigla;
	}
	public String getNome() {
		return nome;
	}
	public String getNomeMaiusculo() {
		return nome.toUpperCase();
	}
	
}
