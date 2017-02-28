package ed.programa;

import ed.fila.Fila;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by vania on 28/02/17.
 */
public class TesteFila {

    public static void main(String[] args) {

        Fila fila = new Fila();

        fila.adiciona("mauricio");
        fila.adiciona("guilherme");
        fila.remove();
        System.out.println(fila);


        Queue<String> filaDoJava = new LinkedList<>();

        filaDoJava.add("mau");
        filaDoJava.add("pau");
        filaDoJava.add("gui");
        filaDoJava.poll();
        filaDoJava.add("joao");
        filaDoJava.poll();
        System.out.println(filaDoJava.peek());
        System.out.println(filaDoJava);

    }
}
