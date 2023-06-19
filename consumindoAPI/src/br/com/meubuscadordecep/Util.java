package br.com.meubuscadordecep;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.Buffer;

public class Util {

    public static String converteJsonEmString (BufferedReader bufferedReader) throws IOException {

        String resposta, jsonEmString = "";

        while((resposta = bufferedReader.readLine()) != null){
            jsonEmString += resposta;
        }
        return jsonEmString;
    }
}
