package Escola;

public class Escola {
	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		
		aluno.setNome("Henzo");
		aluno.setIdade(22);
		
		System.out.println("Aluno: " + aluno.getNome() + ", Idade: " + aluno.getIdade());
	}
}
