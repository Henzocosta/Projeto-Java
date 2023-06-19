import java.util.Scanner;

public class ConversorTemperatura {

    public static void main(String[] args) {

        Scanner temp = new Scanner(System.in);
        System.out.println("Bem Vindo ao Conversor de Temperatura!");

        System.out.println("--------------------");



        System.out.println("""
                Para converter para Graus Celsius, digite C
                e 
                Para converter para Graus Fahrenheit, digite F
                """);

        String temperatura = temp.next();


        if(temperatura.equals("c")){
            System.out.println("Digite a temperatura em Fahrenheit:");
            int celsius = temp.nextInt();

            double mediaTemperaturaC = (celsius - 32) / 1.8;

            System.out.println("Sua temperatura em Graus Fahrenheit para Graus Celsius é: " + (int) mediaTemperaturaC);
        } else{
            System.out.println("Digite a temperatura em Celsius: ");
            int fahrenheit = temp.nextInt();

            double mediaTemperaturaF = (fahrenheit * 1.8) / 32;

            System.out.println("Sua temperatura em Graus Celsius para Graus Fahrenheit é: " + (int) mediaTemperaturaF);
        }


    }
}
