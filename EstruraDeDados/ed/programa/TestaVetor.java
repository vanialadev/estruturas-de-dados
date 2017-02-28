package ed.programa;

import ed.vetor.Aluno;
import ed.vetor.Vetor;

/**
 * Created by vania on 22/02/17.
 */
public class TestaVetor {

    public static void main(String[] args) {


        Aluno aluno1 = new Aluno("João");
        Aluno aluno2 = new Aluno("José");

        Vetor lista =  new Vetor();

        lista.adiciona(aluno1);
        lista.adiciona(aluno2);
        System.out.println(lista.tamanho());

        System.out.println(lista);

        System.out.println(lista.contem(aluno1));

        Aluno aluno3 = new Aluno("Danilo");
        System.out.println(lista.contem(aluno3));

//        ed.vetor.Aluno x = lista.pega(133);
//        System.out.println(x);

        lista.adiciona(1, aluno3);

        System.out.println(lista);
        System.out.println(lista.contem(aluno2));

        lista.remove(0);
        System.out.println(lista);


        for (int i = 0; i < 5; i++){
            Aluno aluno = new Aluno("João " + i);
            lista.adiciona(aluno);
        }
        System.out.println(lista);

        System.out.println(lista.tamanho());
    }
}
