public class Main {
    public static void main(String[] args) {
        System.out.println("Bem Vindo ao Screen Match");
        System.out.println("Filme: Top Gun: Maverick");

        int anoDeLancamento = 2022;

        System.out.println("Ano de Lancemento: " + anoDeLancamento);
        boolean incluiodoNoPlano = true;
        double notaDoFilme = 8.1;

        // Caso eu queira resolver a soma primeiro para logo depois fazer a divisao, necessario colocar entre ()
        double media = (9.8 + 6.3 + 8.0) / 3;
        System.out.println(media);
        String sinopse;
        sinopse = """
                Filme: Top Gun
                Filme de ação do galã dos anos 80
                Ano de lancamento: 
                """ + anoDeLancamento;

        System.out.println(sinopse);

        int classificacao;

        //casting

        classificacao = (int) (media /2);

        System.out.println(classificacao);

    }
}