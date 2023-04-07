package edu.henzo.primeirasemana;

public class SmartTv {

    // Exercitando os estudos.

    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }
    public void aumentarCanal(){
        canal++;
    }
    public void diminuirCanal(){
        canal--;
    }
    public void aumentarVolume(){
        System.out.println("Aumentando o volume para: " + volume);
        // volume = volume + 1 -- o volume++ significaria esse comando.
        volume++;

    }
    public void abaixarVolume(){
        System.out.println("Abaixando o volume para: " + volume);
        volume--;
    }
    public void ligar(){
        ligada =true;
    }
    public void desligar(){
        ligada = false;
    }
    

}
