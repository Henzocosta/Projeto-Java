import java.util.Locale;
import java.util.Scanner;
public class InAndOut {

    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Digite seu Nome: ");
        String nome = sc.nextLine();
        System.out.println("Digite seu Sobrenome: ");
        String sobrenome = sc.nextLine();
        System.out.println("Digite sua idade: ");
        int idade = sc.nextInt();
        System.out.println("Digite sua Altura: ");
        double altura = sc.nextDouble();

         System.out.println("");
         System.out.println("Ola, meu nome é " + nome + " " + sobrenome);
         System.out.println("Eu tenho " + idade + "anos");
         System.out.println("e " + altura + "cm de altura");
    }
}

