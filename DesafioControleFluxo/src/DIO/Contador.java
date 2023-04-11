package DIO;

import java.util.Scanner;

public class Contador {

    public static void main(String[] args) throws ParamentrosInvalidosException {
        Scanner terminal = new Scanner(System.in);

        System.out.println("Digite o primeiro paramentro: ");
        int paramentroUm = terminal.nextInt();
        System.out.println("Digite o Segundo paramentro: ");
        int paramentroDois = terminal.nextInt();

       try{
            contar(paramentroUm, paramentroDois);
            
       }catch(ParamentrosInvalidosException e){
        System.out.println(e.getMessage());
       }
    }
       static void contar(int paramentroUm, int paramentroDois) throws ParamentrosInvalidosException{
        if(paramentroUm > paramentroDois){
            System.out.println("O segundo paramento deve ser maior que o primeiro");
        }
        int contagem = paramentroUm - paramentroDois;
        for(int i=1; i <= contagem; i++){
            System.out.println("Imprima o numero " + i);
        }
       }
    }   

