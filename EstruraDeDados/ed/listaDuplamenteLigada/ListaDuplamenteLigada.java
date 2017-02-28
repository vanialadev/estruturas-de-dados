package ed.listaDuplamenteLigada;

import ed.celula.Celula;

/**
 * Created by vania on 25/02/17.
 */
public class ListaDuplamenteLigada {

    private Celula primeira = null;
    private Celula ultima = null;
    private int totalDeElementos = 0;


    public void adicionaNoComeco(Object elemento) {
        if (isVazia()){
            Celula nova = new Celula(elemento);
            this.primeira = nova;
            this.ultima = nova;
        }else {
            Celula nova = new Celula(elemento, primeira);
            this.primeira.setAnterior(nova);
            this.primeira = nova;
        }
        this.totalDeElementos++;

    }

    public void adicionaNoFinal(Object elemento) {
        if (isVazia()){
            adicionaNoComeco(elemento);
        }else {
            Celula nova = new Celula(elemento);
            this.ultima.setProximo(nova);
            nova.setAnterior(ultima);
            this.ultima = nova;
            this.totalDeElementos++;
        }

    }

    public void adiciona(int posicao, Object elemento) {
        if (posicao == 0 || isVazia()){
            adicionaNoComeco(elemento);
        } else if (isCheia(posicao)){
            adicionaNoFinal(elemento);
        }else {
            Celula anterior = this.pegaCelula(posicao - 1);
            Celula proxima  = anterior.getProximo();
            Celula nova = new Celula(elemento, proxima);
            anterior.setProximo(nova);
            nova.setAnterior(anterior);
            proxima.setAnterior(nova);
            this.totalDeElementos++;
        }
    }

    private boolean posicaoOcupada(int posicao) {
        return posicao >= 0 && posicao < this.totalDeElementos;
    }

    public void removeDoComeco() {
        if (this.totalDeElementos == 0){
            throw new IllegalArgumentException("lista vazia");
        }
        this.primeira = primeira.getProximo();
        this.primeira.setAnterior(null);
        this.totalDeElementos--;
        if (this.totalDeElementos == 0){
            this.ultima = null;
        }

    }

    public void removeDoFinal() {
        if (this.totalDeElementos == 0){
            throw new IllegalArgumentException("lista vazia");
        }else if (this.totalDeElementos == 1){
            this.removeDoComeco();
        }
        this.ultima = ultima.getAnterior();
        this.ultima.setProximo(null);
        this.totalDeElementos--;
    }

    public void remove(int posicao) {
        if (isVazia() || !posicaoOcupada(posicao)){
            throw new IllegalArgumentException("Posição inexistente");
        }else if (posicao == 0){
            this.removeDoComeco();
        } else if (posicao == this.totalDeElementos - 1){
            this.removeDoFinal();
        } else {
            Celula anterior = this.pegaCelula(posicao - 1);
            Celula atual = anterior.getProximo();
            Celula proxima = atual.getProximo();
            anterior.setProximo(proxima);
            proxima.setAnterior(anterior);
            this.totalDeElementos--;
        }

    }

    public boolean contem(Object elemento) {
        Celula atual = this.primeira;
        while(atual != null){
            if (atual.getElemento().equals(elemento)){
                return true;
            }
            atual = atual.getProximo();
        }
        return false;
    }

    private Celula pegaCelula(int posicao) {
        if (!posicaoOcupada(posicao)){
            throw new IllegalArgumentException("Posição inexistente");
        }
        Celula atual = this.primeira;
        for (int i = 0; i < posicao; i++){

            atual = atual.getProximo();
        }

        return atual;
    }

    public Object pega(int posicao) {
        if (!posicaoOcupada(posicao)){
            throw new IllegalArgumentException("Posição inexistente");
        }
        return pegaCelula(posicao).getElemento();
    }

    public int tamanho() {
        return this.totalDeElementos;
    }

    public String toString() {
        if (isVazia()){
            return "[]";
        }
        StringBuilder builder = new StringBuilder("[");
        Celula atual = this.primeira;
        for (int i = 0; i < totalDeElementos; i++){
            builder.append(atual.getElemento() + ", ");
            atual = atual.getProximo();
        }
        builder.append("]");
        return builder.toString();
    }

    private boolean isVazia(){
        return this.totalDeElementos == 0;
    }

    private boolean isCheia(int posicao){
        return posicao == this.totalDeElementos;
    }

}
