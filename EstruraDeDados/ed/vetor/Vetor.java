package ed.vetor;

import ed.vetor.Aluno;

import java.util.Arrays;

/**
 * Created by vania on 22/02/17.
 */
public class Vetor {

    private Aluno [] alunos = new Aluno[5];
    private int totalDeAlunos = 0;

    public void adiciona(Aluno aluno){
        this.garanteEspaco();
        this.alunos[totalDeAlunos] = aluno;
        totalDeAlunos++;
    }

    private boolean ehValida(int posicao){
        return posicao <= totalDeAlunos && posicao >= 0;
    }

    public void adiciona(int posicao, Aluno aluno){
        this.garanteEspaco();
        if (!ehValida(posicao)){
            throw new IllegalArgumentException("posição inválida");
        }
        for (int i = totalDeAlunos - 1; i >= posicao; i--){
            alunos[i+1] = alunos[i];
        }
        alunos[posicao] = aluno;
        totalDeAlunos++;
        //pior caso, posicao 0 é o O(n)
    }
    private void garanteEspaco(){
        if (totalDeAlunos == alunos.length){
            Aluno[] novoArray = new Aluno[this.alunos.length * 2];
            for (int i = 0; i < alunos.length; i++){
                novoArray[i] = alunos[i];
            }
            this.alunos = novoArray;
        }
    }

    private boolean posicaoOcupada(int posicao){
        return posicao > 0 && posicao <totalDeAlunos;
    }

    public Aluno pega(int posicao){
        if (! posicaoOcupada(posicao)){
            throw new IllegalArgumentException("posição inválida");
        }
        return alunos[posicao];
    }

    public void remove(int posicao){
        for (int i  = posicao; i < totalDeAlunos; i++){
            alunos[i] = alunos[i+1];
        }
        totalDeAlunos--;
        //pior caso, posicao 0 é o O(n)
    }

    public boolean contem(Aluno aluno){

        for (int i  = 0; i < totalDeAlunos; i++){
            if (aluno.equals(alunos[i])){
                return true;
            }
        }
        return false;
        //O(N)
    }

    public int tamanho(){
        return totalDeAlunos;
    }

    @Override
    public String toString() {
        return Arrays.toString(alunos);
    }
}
