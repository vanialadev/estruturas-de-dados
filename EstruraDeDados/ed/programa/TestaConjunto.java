package ed.programa;

import ed.fila.Conjunto;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by vania on 28/02/17.
 */
public class TestaConjunto {

    public static void main(String[] args) {

        Conjunto conjunto = new Conjunto();

        conjunto.adiciona("mau");
        System.out.println(conjunto);

        conjunto.adiciona("mau");
        System.out.println(conjunto);


        conjunto.adiciona("mau");
        conjunto.adiciona("gui");
        System.out.println(conjunto);

        conjunto.remove("mau");
        System.out.println(conjunto);


        Set<String> conjuntoDoJava = new HashSet<>();

        conjuntoDoJava.add("mau");
        conjuntoDoJava.add("mau");
        conjuntoDoJava.add("gui");
        conjuntoDoJava.add("paulo");
        conjuntoDoJava.remove("gui");

        System.out.println(conjuntoDoJava);

        String x = "oi";
        System.out.println(x.hashCode());
        System.out.println("oi".hashCode());
        System.out.println(conjuntoDoJava);



    }
}
