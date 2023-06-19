package br.com.alura.SpotMusic;

import br.com.alura.modelos.Musica;
import br.com.alura.modelos.PodCast;
import br.com.alura.modelos.Preferidas;

public class Principal {

    public static void main(String[] args) {

        Musica musica = new Musica();

        musica.setTitulo("Forever");
        musica.setCantor("Kiss");

        for(int i = 0; i < 1000; i++){
            musica.reproduz();
        }

        for (int i = 0; i < 50; i++) {
            musica.curte();
        }

        PodCast pod = new PodCast();

        pod.setTitulo("PodDev");
        pod.setApresentador("Henzo");
        pod.setDescricao("Coisas de Dev");

        for (int i = 0; i < 5000; i++) {
            pod.reproduz();
        }
        for (int i = 0; i < 1000; i++) {
            pod.curte();
        }

        Preferidas preferidas = new Preferidas();
        preferidas.incluir(pod);
        preferidas.incluir(musica);
    }
}
