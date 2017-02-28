package ed.programa;

import java.util.Stack;

/**
 * Created by vania on 28/02/17.
 */
public class TesteStack {

    public static void main(String[] args) {

        Stack<String> pilha = new Stack<>();

        pilha.push("mau");
        pilha.push("marcelo");
        pilha.pop();
        pilha.push("gui");
        pilha.push("paulo");
        pilha.pop();
        pilha.push("joao");

        System.out.println(pilha);
    }
}
