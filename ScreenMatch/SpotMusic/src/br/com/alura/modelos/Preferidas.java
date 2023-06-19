package br.com.alura.modelos;

public class Preferidas {

    public void incluir(Audio audio){
        if(audio.getClassicificacao() >= 9){
            System.out.println(audio.getTitulo() + " Esta sendo um sucesso total!");
        }else {
            System.out.println(audio.getTitulo() + " esta entra as mais reproduzidas");
        }
    }

}
