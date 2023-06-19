package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Series;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

// A classe Object é considerada a classe que é de todas, mas lembre-se de usa-la com cautela.
public class PrincipalComListas {
    public static void main(String[] args) {

        Filme meufilme = new Filme("O Poderoso Chefão", 1970);
        meufilme.avalia(9);
        Filme outro = new Filme("Avatar", 2023);
        outro.avalia(8);
        var filmeDoPaulo = new Filme("DogVille", 2003);
        filmeDoPaulo.avalia(10);
        Series serie = new Series("Lost", 2000);

        ArrayList<Titulo> lista = new ArrayList<>();

        lista.add(meufilme);
        lista.add(outro);
        lista.add(filmeDoPaulo);
        lista.add(serie);

        for (Titulo item : lista  ) {
            System.out.println("Nome: " + item.getNome());
            if (item instanceof Filme filme && filme.getClassificacao() > 2) {
                System.out.println("Classificaçāo: " + ((Filme) item).getClassificacao());
            }
        }

        ArrayList<String> buscarPorNome = new ArrayList<>();
            buscarPorNome.add("Adam Sendler");
            buscarPorNome.add("Henzo");
            buscarPorNome.add("Esmeralda");

            System.out.println(buscarPorNome);

            // o metodo sort serve para organizarmos a lista de forma ordenada e ele se encontra dentro da classe
            // Collections
            Collections.sort(buscarPorNome); // Pedi que ordenace minha lista por ordem alfabetica.
            System.out.println(buscarPorNome);

            System.out.println("Ordenando Titulos:  ");
            Collections.sort(lista);
            System.out.println(lista);
            lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento)); // A uma diferenca entre o comparator e o
            // comparable. Leia a documentacao de ambos que ira entender.

            System.out.println("Ordernando por Ano: ");
            System.out.println(lista);


    }
}
