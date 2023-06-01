package OrdenacaoDeElementosEmUmaColecaoList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ExemploOrdenacaoList {
	
	public static void main(String[] args) {
		
		ExemploOrdenacaoList exemplo = new ExemploOrdenacaoList();
		exemplo.executar();
		
		
		
	}
		public void executar() {
			
			List<Gato> meusGatos = new ArrayList<>() {{
				
				add(new Gato("Jon", 18, "preto"));
				add(new Gato("Simba", 6, "tigrado"));
				add(new Gato("Jon", 12, "amarelo"));
			}};
			
			System.out.println("--\tOrdem de Insercao\t--");
			System.out.println(meusGatos);
			
			System.out.println("--\tOrdem Aleatoria \t--");
			// Metodo para que consiga baguncar a lista.
			Collections.shuffle(meusGatos);
			System.out.println(meusGatos);
			
			System.out.println("--\tOrdem Natural (Nome)\t--");
			Collections.sort(meusGatos);
			System.out.println(meusGatos);
			
			System.out.println("--\tOrdem Idade\t--");
			
			//Ambos os metodos tem a mesma funcao.
			
			Collections.sort(meusGatos, new ComparatorIdade());
			//meusGatos.sort(new ComparatorIdade());
			System.out.println(meusGatos);
			
			System.out.println("--\tOrdem Cor\t--");
			
			// Metodo para comparacao. OBS: atentar para os tipos se for String ou Integer
			// Ordem natural nome fizemos uma class chamada compareTo(). atentar para todos os detalhes
			//Collections.sort(meusGatos, new ComparatorCor());
			meusGatos.sort(new ComparatorCor());
			// Aqui eu usei a segunda forma de aplicar a interface comparator
			System.out.println(meusGatos);
			
			System.out.println("--\tOrdem Nome/Cor/Idade\t--");
			meusGatos.sort(new ComparatorNomeCorIdade());
			System.out.println(meusGatos);
			
		}
		
		


public class Gato implements Comparable<Gato>{
	
	private String nome;
	private Integer idade;
	private String cor;
	
	public Gato(String nome, Integer idade, String cor) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.cor = cor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	@Override
	public String toString() {
		return "Gato [nome=" + nome + ", idade=" + idade + ", cor=" + cor + "]";
	}

	@Override
	public int compareTo(Gato o) {
		return this.getNome().compareToIgnoreCase(getNome());
	}
	
	
	}
class ComparatorIdade implements Comparator<Gato>{
	@Override
	public int compare(Gato g1, Gato g2) {
		return Integer.compare(g1.getIdade(), g2.getIdade()); 
		}
	
	}

class ComparatorCor implements Comparator<Gato>{
	public int compare(Gato g1, Gato g2) {
		return g1.getCor().compareToIgnoreCase(g2.getCor());
	}
}

class ComparatorNomeCorIdade implements Comparator<Gato>{
	@Override
	public int compare(Gato g1, Gato g2) {
		int nome = g1.getNome().compareToIgnoreCase(g2.getNome());
		if(nome != 0) return nome;
		
		int cor =g1.getCor().compareToIgnoreCase(g2.getCor());
		if(cor != 0) return cor;
		
		return Integer.compare(g1.getIdade(), g2.getIdade());
	}
}

}


