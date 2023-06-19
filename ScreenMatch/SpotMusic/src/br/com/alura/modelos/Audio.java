package br.com.alura.modelos;

public class Audio {

    private String titulo;
    private int totalReproducoes;
    private  int totalCurtidas;
    private int Classicificacao;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getTotalReproducoes() {
        return totalReproducoes;
    }

    public int getTotalCurtidas() {
        return totalCurtidas;
    }

    public int getClassicificacao() {
        return Classicificacao;
    }

    public void curte(){
        this.totalCurtidas++;
    }
    public void reproduz(){
        this.totalReproducoes++;
    }


}
