import java.io.IOException;
import java.util.Scanner;

public class ProxAnterior {
    public static void main(String[] args) throws IOException{
        
        Scanner sc = new Scanner(System.in);

        int Number = sc.nextInt();

        int proximo, anterior=0, atual=1;

        System.out.print(anterior + " " + atual);

        for(int i=2; i<Number; i++){
            proximo = atual + anterior;
            System.out.print(" " + proximo);
            anterior = atual;
            atual = proximo;
        }
    
    }
}
