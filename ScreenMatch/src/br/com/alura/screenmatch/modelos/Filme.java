package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.calculos.Classificavel;

public class Filme extends Titulo implements Classificavel  {

    private String diretor;

    public Filme(String nome, int anoDeLancamento) {
        super(nome, anoDeLancamento);

        // Nesse caso, eu criei um construtor na classe Mae e a classe filha herda da mae, entao dentro
        // do construtor eu so preciso chamar a classe mae com "super"

        // O construtor é mais um recurso para encapsular objetos
    }

    public String getDiretor() {

        return this.diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getClassificacao() {

        return (int) pegaMedia() / 2;
    }

    @Override
    public String toString() {
        return "Filme: " + this.getNome() +
                " (" + this.getAnoDeLancamento() + ")";
    }



}


