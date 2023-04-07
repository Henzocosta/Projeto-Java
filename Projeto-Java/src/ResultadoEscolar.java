import java.util.Scanner;

public class ResultadoEscolar{
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        System.out.println("Sua nota: ");
        int nota = in.nextInt();

        if(nota >= 7 ){
            System.out.println("Aprovado");
        } else{
            System.out.println("Reprovado");
        }
    }
}