package ed.fila;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by vania on 28/02/17.
 */
public class Fila {

    List<String> fila = new LinkedList<>();

    public void adiciona(String nome){
        fila.add(nome);
    }


    public void remove(){
        fila.remove(0);
    }

    @Override
    public String toString() {
        return fila.toString();
    }

    public boolean isVazia(){
       return fila.isEmpty();
    }

}
