import java.util.Random;
import java.util.Scanner;

public class miniGame {

    public static void main(String[] args) {

        Scanner number = new Scanner(System.in);

        int numeroGerado = new Random().nextInt(100); // Nessa Linha peco que gere 100 numeros aleatorios
        int tentativa = 0;
        System.out.println("Bem Vindo ao Advinhe o número!");
        System.out.println("--------------------");

        while(tentativa <= 5){
            System.out.println("Digite um numero entre 0 a 100!");
            int numeroDigitado = number.nextInt();
            tentativa++;

            if(numeroGerado == numeroDigitado){
                System.out.println("Parabens Voce acertou!");
                break; // Vou forcar o stop do loop
            } else if(numeroGerado < numeroDigitado){
                System.out.println("Menor");
            }else if(numeroGerado > numeroDigitado){
                System.out.println("Maior");
            }
            if(tentativa == 5){
                System.out.println("Voce Falhou! O numero era: " + numeroGerado);
                break;
            }
        }

        }


    }

