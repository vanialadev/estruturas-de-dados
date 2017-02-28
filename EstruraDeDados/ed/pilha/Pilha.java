package ed.pilha;


import java.util.LinkedList;
import java.util.List;

/**
 * Created by vania on 28/02/17.
 */
public class Pilha {

    private List<String> nomes = new LinkedList();

    public void push(String nome){

        nomes.add(nome);

    }

    public String pop(){
        return nomes.remove(nomes.size() - 1);
    }

    public boolean isVazia(){
        return nomes.isEmpty();
    }

    @Override
    public String toString() {
        return nomes.toString();
    }
}
