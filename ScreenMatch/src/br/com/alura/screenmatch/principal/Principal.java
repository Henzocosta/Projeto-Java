package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Series;
import br.com.alura.screenmatch.calculos.calculadoraDeTempo;

import java.util.ArrayList;
import java.util.Objects;

public class Principal{
    public static void main(String[] args) {
        Filme meufilme = new Filme("Poderoso Chefão", 1970);

//        meufilme.setNome("Poderoso Chefão");
//        meufilme.setAnoDeLancamento(1970);
        meufilme.setDuracaoEmMinutos(180);
        meufilme.setIncluidoNoPlano(true);

        meufilme.exibirFichaTecnica();

        meufilme.avalia(8);
        meufilme.avalia(5 );
        meufilme.avalia(10);
        //System.out.println(meufilme.somaDasAvaliacoes);
        //System.out.println(meufilme.totalDeAvaliacoes);
        System.out.println(meufilme.getTotalDeAvaliacoes());
        System.out.println( meufilme.pegaMedia());
        // Para fazer uma auto-ident use control+option+i

        System.out.println("--------------------");

        meufilme.exibirFichaTecnica();

        // Metodo Acessor = Get(Obter Valor) e Set(Atribuir Valor)

        System.out.println("--------------------");


        Filme favorito = new Filme("The Matrix", 1999);
//        favorito.setNome("The Matrix");
//        favorito.setAnoDeLancamento(1999);
        favorito.setDuracaoEmMinutos(135);
        favorito.setIncluidoNoPlano(true);

        Filme outro = new Filme("Avatar", 2023);
//        outro.setNome("Avatar");
//        outro.setAnoDeLancamento(2023);
        outro.setDuracaoEmMinutos(101);
        outro.setIncluidoNoPlano(true);

        Series serie = new Series("Lost", 2000);
//        serie.setNome("Lost");
//        serie.setAnoDeLancamento(2000);
        serie.setIncluidoNoPlano(true);
        serie.setAtiva(true);
        serie.setTemporadas(5);
        serie.setEpisodiosPorTemporada(10);
        serie.setMinutosPorEpisodio(45);

        calculadoraDeTempo calculadora = new calculadoraDeTempo();
        calculadora.inclui(favorito);
        calculadora.inclui(outro);
        calculadora.inclui(serie);

        System.out.println("Tempo Total: " + calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(favorito);

        Episodio ep = new Episodio();
        ep.setNumero(1);
        ep.setSerie(serie);
        ep.setTotalVisualizacoes(300);
        filtro.filtra(ep);

        System.out.println("--------------------");

        // A variavel var realiza uma inferencia do tipo declarado
        // Inferencia: a inferência é o processo de tirar conclusões ou fazer
        // deduções com base em evidências e raciocínio lógico.
        var filmeDoPaulo = new Filme("DogVille", 2003);
//        filmeDoPaulo.setNome("DogVille");
        filmeDoPaulo.setDuracaoEmMinutos(200);
//        filmeDoPaulo.setAnoDeLancamento(2003);
        filmeDoPaulo.avalia(10);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();

        // Lembrando que o metodo ".add" é usado para adicionar objetos dentro
        // da ArrayList.
        listaDeFilmes.add(filmeDoPaulo);
        listaDeFilmes.add(meufilme);
        listaDeFilmes.add(outro);

        // O metodo ".size" é usado para verificar o tamanho da lista.
        System.out.println("Tamanho da Lista: " + listaDeFilmes.size());
        // O metodo ".get()" ele é usado para pegar a posicao do objeto dentro
        // do ArrayLista, lembrando que a lista sempre ira comecar no ponto 0

        // Usei tambem o ".getNome()" que ira pegar o nome que vc atribuiu ao objeto que foi adicionado na lista.
        System.out.println("Primeiro Filme da lista: " + listaDeFilmes.get(0).getNome());

        // Como eu sobrescrevir o metodo toString, percebesse que a linha 104 nos devolveu as documentacoes
        // dos objetos.
        System.out.println(listaDeFilmes);

        System.out.println("toString do filme: " + listaDeFilmes.get(0).toString());


        // Construtor: método que tem como funcao a criacao de um objeto em memoria




    }
}