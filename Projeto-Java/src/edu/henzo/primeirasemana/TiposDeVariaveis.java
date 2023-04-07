package edu.henzo.primeirasemana;


public class TiposDeVariaveis {

    public static void main(String[] args) {
        
        // Existe as variaves: 

        byte numeroCurto;
        short numeroMedio;
        int numeroInteiro; 
        long numeroLongo; //Sempre identificar o long com um L ao final do numero

        // Porem o tipo de variavel mais usada dentre elas é o int, mesmo que as outras ocupem menos
        // espaco na memoria. 

        // Variaveis com ponto flutuante 

        float numeroComPontoFlutuante; // O identificador do float é um F ao final do numero
        double numeroComPontoFlutuante2;

        // Porem a mais usada é o double.

        // Caso queira que sua variavel nao mude de valor, voce pode usar uma constante.
        // mas lembre-se de colocar o nome da variavel em CAIXA ALTA
        // com a palavra final voce consegue garantir que a variavel nao seja alterada
        // Ex abaixo

        final int NUNCA_VAI_SER_ALTERADO = 22;

        //NUNCA_VAI_SER_ALTERADO = 23; // Essa linha vai dar erro pois voce ja declarou que a variavel
        // NUNCA_VAI_SER_ALTERADO com a constante final nao recebera alteracoes.

    }
    
}
