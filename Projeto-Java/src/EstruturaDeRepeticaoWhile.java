import java.util.concurrent.ThreadLocalRandom;


public class EstruturaDeRepeticaoWhile {
    public static void main(String[] args) {
        double mesada = 50.0;
        while( mesada > 0){
            Double valorDoce = valorAleatorio();
            
            // Esse If funciona apenas para regra de negocio. 
            // Caso ele saia do codigo nao dara nenhum erro, pois nao esta fazendo nada alem de regra de negocio
            if(valorDoce > mesada){
                valorDoce = mesada;
            }
                System.out.println("Doce Valor: " + valorDoce + " Adicionado no carrinho");
                mesada = mesada - valorDoce;
        }    
            System.out.println("Mesada: " + mesada);
            System.out.println("Joaozinho gastou toda sua mesada!");
    }
    // Aqui eu aplico os valores dos doces. estou dizendo que na loja tem valores aleatorios de 2 a 15 reais.
    private static double valorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(2, 15);
      }

      //Diferenca entra WHile e do/while.

      // O do/while ele testa a condicao depois de executar o codigo.
}
