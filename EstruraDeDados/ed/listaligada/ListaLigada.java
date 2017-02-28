package ed.listaligada;

import ed.celula.Celula;

/**
 * Created by vania on 23/02/17.
 */
public class ListaLigada {

    private Celula primeira = null;
    private Celula ultima = null;
    private int totalDeElementos = 0;

    public void adicionaNoComeco(Object elemento){
        Celula nova = new Celula(elemento, primeira);
        this.primeira = nova;

        if (totalDeElementos == 0){
            this.ultima = this.primeira;
        }
        this.totalDeElementos++;
    }
    public void adicionaNoFinal(Object elemento){

        if (this.totalDeElementos == 0){
            adicionaNoComeco(elemento);
        } else {
            Celula nova = new Celula(elemento, null);

            this.ultima.setProximo(nova);
            this.ultima = nova;
            this.totalDeElementos++;
        }

    }

    private boolean posicaoOcupada(int posicao){
        return posicao >= 0 && posicao < this.totalDeElementos;
    }

    private Celula pegaCelula(int posicao){
         if (! posicaoOcupada(posicao)){
             throw new IllegalArgumentException("posição inexistente");
         }

         Celula atual = primeira;

         for (int i = 0; i < posicao; i++){
             atual = atual.getProximo();
         }
         return atual;
    }

    public void adiciona(int posicao, Object elemento){

        if (this.totalDeElementos == 0){
            this.adicionaNoComeco(elemento);
        } else if (posicao == this.totalDeElementos){
            this.adicionaNoFinal(elemento);
        } else {

            Celula anterior = this.pegaCelula(posicao - 1);
            Celula nova = new Celula(elemento, anterior.getProximo());
            anterior.setProximo(nova);
            this.totalDeElementos++;
        }
    }

    public Object pega(int posicao){
        return this.pegaCelula(posicao).getElemento();
    }

    public void remove(int posicao){
        if (this.totalDeElementos == 0){
            throw new IllegalArgumentException("lista vazia");
        }
        if (posicao == 0){
            removeDoComeco();
        } else if (posicao == totalDeElementos - 1){
            removeDoFinal();
        } else {
            Celula anterior = pegaCelula(posicao - 1);
            anterior.setProximo(pegaCelula(posicao).getProximo());
            totalDeElementos--;
        }
    }

    public void removeDoComeco(){
        if (this.totalDeElementos == 0){
            throw new IllegalArgumentException("lista vazia");
        }
        this.primeira = this.primeira.getProximo();
        totalDeElementos--;
        if (totalDeElementos == 0){
            this.ultima = null;
        }
    }

    public void removeDoFinal(){
        if (this.totalDeElementos == 0){
            throw new IllegalArgumentException("lista vazia");
        }

        Celula novaUltima = this.pegaCelula(totalDeElementos - 2);
        Celula novaAntepenultima = pegaCelula(totalDeElementos - 3);
        this.ultima = novaUltima;
        this.ultima.setProximo(null);
        novaAntepenultima.setProximo(ultima);

        totalDeElementos--;
    }


    public int tamanho() {
        return this.totalDeElementos;
    }
    public boolean contem(Object elemento) {

        Celula atual = primeira;

        for (int i = 0; i< totalDeElementos; i++){
            if (atual.getElemento().equals(elemento)){
                return true;
            }
            atual = atual.getProximo();
        }
        return false;
    }

    @Override
    public String toString() {
        if (this.totalDeElementos == 0){
            return "[]";
        }
        Celula atual = primeira;
        StringBuilder builder = new StringBuilder("[");
        for (int i = 0; i < totalDeElementos; i++){
            builder.append(atual.getElemento());
            builder.append(",");

            atual = atual.getProximo();
        }
        builder.append("]");
        return builder.toString();
    }


}
