package ed.programa;

import ed.listaDuplamenteLigada.ListaDuplamenteLigada;

/**
 * Created by vania on 27/02/17.
 */
public class TestaListaDuplamenteLigada {

    public static void main(String[] args) {
        ListaDuplamenteLigada lista = new ListaDuplamenteLigada();

        System.out.println(lista);

        lista.adicionaNoComeco("mauricio");
        System.out.println(lista);
        lista.adicionaNoFinal("paulo");
        System.out.println(lista);
        lista.adicionaNoComeco("guilherme");
        System.out.println(lista);

        System.out.println(lista.pega(1));
        System.out.println(lista);
        lista.adiciona(1, "joao");

        System.out.println(lista);
        lista.adiciona(0, "za");
        System.out.println(lista);
        lista.adiciona(5, "za");
        System.out.println(lista);
        lista.removeDoComeco();
        System.out.println(lista);
        lista.removeDoFinal();
        System.out.println(lista);
        lista.remove(2);
        System.out.println(lista);
        System.out.println(        lista.contem("za")
        );
        System.out.println(        lista.contem("paulo")
        );
        System.out.println(lista);


        System.out.println(lista.tamanho());
    }
}
