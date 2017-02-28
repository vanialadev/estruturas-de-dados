package ed.programa;

import ed.listaligada.ListaLigada;

/**
 * Created by vania on 23/02/17.
 */
public class TestaListaLigada {

    public static void main(String[] args) {

        ListaLigada lista = new ListaLigada();

        System.out.println(lista);

        lista.adicionaNoComeco("mauricio");
        System.out.println(lista);
        lista.adicionaNoComeco("paulo");
        System.out.println(lista);
        lista.adicionaNoComeco("guilherme");
        System.out.println(lista);
        lista.adicionaNoFinal("marcelo");
        lista.adicionaNoFinal("marcelo1");
        lista.adicionaNoFinal("marcelo2");
        lista.adicionaNoFinal("marcelo3");
        lista.adicionaNoFinal("marcelo4");
        lista.adicionaNoFinal("marcelo5");
        lista.adicionaNoFinal("marcelo6");
        lista.adicionaNoFinal("marcelo7");
        lista.adicionaNoFinal("marcelo8");
        lista.adicionaNoFinal("marcelo9");
        System.out.println(lista);
        lista.adiciona(2, "gabriel");
        System.out.println(lista);
        lista.removeDoComeco();
        System.out.println(lista);
        lista.removeDoFinal();
        System.out.println(lista);
        System.out.println(lista.tamanho());
        System.out.println(lista.contem("paulo"));
        System.out.println(lista.contem("mauricio"));
        System.out.println(lista.contem("gabriel"));
        System.out.println(lista.contem("marcelo"));
        System.out.println(lista.contem("mar"));

        lista.remove(11);
        System.out.println(lista);
        lista.remove(0);
        System.out.println(lista);
        System.out.println(lista.tamanho());
        lista.remove(3);
        System.out.println(lista);
        System.out.println(lista.tamanho());


    }

}
