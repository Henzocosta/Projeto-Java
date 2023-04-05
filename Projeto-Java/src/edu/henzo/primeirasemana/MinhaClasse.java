package edu.henzo.primeirasemana;

public class MinhaClasse {
    public static void main(String[] args) {
    
        String primeiroNome = "Henzo Costa ";

        String segundoNome = "De Jesus";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.println(nomeCompleto);

        int anoFabricacao = 2000;

        boolean verdadeira = true; //or false 
        // Valores logicos sao representados pela expressao boolean

        anoFabricacao = 2018;

        //-------------------------------------------

        // Metodos da linguagem java tendem a ser no infinitivo


    }

    public static String nomeCompleto (String primeiroNome, String segundoNome){
            return "Resultado do metoto = " + primeiroNome.concat("").concat(segundoNome);
    }

}
