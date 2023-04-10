import java.util.Random;

public class EstruturaDeRepeticaoDoWhile {
    
    public static void main(String[] args) {
        System.out.println("Chamando... ");

            do{ 
                System.out.println("Celular Tocando...");
            }while(tocando());

            System.out.println("Alo?...");
    }
    private static boolean tocando(){
        boolean atendeu = new Random().nextInt(3)==1;
        System.out.println("Atendeu? " + atendeu);
        //negando o ato de continuar tocando
        // ! Operador unário lógico de negação – nega o valor de uma expressão booleana.
        return ! atendeu;
    }
}
