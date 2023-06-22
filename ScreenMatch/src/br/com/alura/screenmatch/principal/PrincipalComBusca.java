package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.excecao.ErroDeConversaoDeAnoException;
import br.com.alura.screenmatch.modelos.Titulo;
import br.com.alura.screenmatch.modelos.TituloOmdb;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrincipalComBusca {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner leitura = new Scanner(System.in);
        String busca = " ";
        List<Titulo> titulos = new ArrayList<>();
        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting()
                .create();
        while(!busca.equalsIgnoreCase("sair")) {
            System.out.println("Digite o Filme que deseja buscar: ");
            busca = leitura.nextLine();

            if(busca.equalsIgnoreCase("sair")){
                break;
            }


            String endereco = "http://www.omdbapi.com/?t=" + busca.replace(" ", "+") + "&apikey=3e6f0813";

            try {
                HttpClient client = HttpClient.newHttpClient();
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(endereco))
                        .build();

                HttpResponse<String> response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());

                String json = response.body();
                System.out.println(json);

//        Gson gson = new Gson();


                TituloOmdb meuTituloOmdb = gson.fromJson(json, TituloOmdb.class);
                System.out.println("so pra teste");
                System.out.println(meuTituloOmdb);

//        try{
                Titulo meuTitulo = new Titulo(meuTituloOmdb);
                System.out.println("Titulo Convertido!");
                System.out.println(meuTitulo);
                titulos.add(meuTitulo);

                FileWriter escrita = new FileWriter("filmes.txt");
                escrita.write(meuTitulo.toString());
                escrita.close();

            } catch (NumberFormatException e) {
                System.out.println("Aconteceu um erro!");
                System.out.println(e.getMessage());
            } catch (IllegalArgumentException e) {
                System.out.println("Aconteceu algum erro de argumento na busca, verifique o endereço");
            } catch (ErroDeConversaoDeAnoException e) {
                System.out.println(e.getMensagem());
            }
        }
        FileWriter file = new FileWriter("Filmes.Json");
        file.write(gson.toJson(titulos));
        file.close();
        System.out.println("Programa Finalizou");


//        finally {
//            System.out.println("Programa Finalizou");
//        } // Finally ele te da a resposta em ambas as situacoes. tanto se der certo, quanto se der erro.

    }
}
