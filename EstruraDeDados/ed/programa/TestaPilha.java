package ed.programa;

import ed.pilha.Pilha;

/**
 * Created by vania on 28/02/17.
 */
public class TestaPilha {

    public static void main(String[] args) {
        Pilha pilha = new Pilha();

        pilha.push("mauricioa");
        pilha.push("marcelo");
        pilha.pop();

        System.out.println(pilha);

        pilha.push("guilherme");
        pilha.push("paulo");

        System.out.println(pilha);

        pilha.pop();
        pilha.push("joaoa");

        System.out.println(pilha);

    }
}
