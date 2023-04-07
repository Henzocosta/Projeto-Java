package edu.henzo.primeirasemana;

public class Usuario {
    public static void main(String[] args) {
        
        SmartTv smartTv = new SmartTv();

        smartTv.abaixarVolume();
        smartTv.abaixarVolume();
        smartTv.abaixarVolume();
        smartTv.aumentarVolume();
        System.out.println("Volume Atual: " + smartTv.volume);

        System.out.println("Tv Ligada? " + smartTv.ligada);

        smartTv.mudarCanal(13);
        System.out.println("Canal Atual: " + smartTv.canal);
       
       
        System.out.println("Volume Atual: " + smartTv.volume);

        smartTv.ligar();

        System.out.println("Novo Status -> Tv Ligada? " + smartTv.ligada);

        smartTv.desligar();

        System.out.println("Novo Status -> Tv Ligada? " + smartTv.ligada);
    }
}
