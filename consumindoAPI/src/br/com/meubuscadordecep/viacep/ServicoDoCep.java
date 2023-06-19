package br.com.meubuscadordecep.viacep;

import br.com.meubuscadordecep.Util;
import br.com.meubuscadordecep.dominio.Endereco;
import com.google.gson.Gson;



import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class ServicoDoCep {

    static String webService = "https://viacep.com.br/ws/";
    static int codigoSucesso = 200;

    public static Endereco buscaEnderecoPelo(String cep) throws Exception{
        String urlParaChamada = webService + cep + "/Json";

        try{

            URL url = new URL(urlParaChamada);
            HttpURLConnection conexao = (HttpURLConnection) url.openConnection();

            if(conexao.getResponseCode() != codigoSucesso)
                throw new RuntimeException("HTTP ERRO: " + conexao.getResponseCode());

                BufferedReader resposta = new BufferedReader(new InputStreamReader(conexao.getInputStream()));
                String jsonEmString =  Util.converteJsonEmString(resposta);

                Gson gson = new Gson();
                Endereco endereco = gson.fromJson(jsonEmString, Endereco.class);

                return endereco;

        }catch (Exception e ){
            throw new Exception("ERRO: " + e);
        }
    }
}
