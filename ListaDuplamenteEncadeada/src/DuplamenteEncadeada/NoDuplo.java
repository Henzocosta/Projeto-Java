package DuplamenteEncadeada;

public class NoDuplo<T> {

    private T conteudo;
    private NoDuplo<T> noProximo;
    private NoDuplo<T> noPrevio;

    public NoDuplo(T conteundo){
        this.conteudo = conteudo;
    }

    public T getConteudo() {
        return conteudo;
    }

    public NoDuplo<T> getNoPrevio() {
        return noPrevio;
    }

    public void setNoProximo(NoDuplo<T> noProximo) {
        this.noProximo = noProximo;
    }

    public void setNoPrevio(NoDuplo<T> noPrevio) {
        this.noPrevio = noPrevio;
    }

    @Override
    public String toString() {
        return "No Duplo: " +
                "Conteudo = " + conteudo;
    }
}
