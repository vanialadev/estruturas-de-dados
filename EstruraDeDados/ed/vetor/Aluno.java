package ed.vetor;

/**
 * Created by vania on 22/02/17.
 */
public class Aluno {

    private String nome;

    public Aluno(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this == obj) return true;
        if (!(obj instanceof Aluno)) return false;

        Aluno aluno = (Aluno) obj;

        return getNome().equals(aluno.getNome());
    }

    @Override
    public int hashCode() {
        return getNome().hashCode();
    }

    public boolean equalsMeu(Object object){
        if (object == null) return false;
        if (!(object instanceof Aluno)){
            return false;
        }

        Aluno aluno = (Aluno) object;
        return this.getNome().equals(aluno.getNome());
    }

    @Override
    public String toString() {
        return this.getNome();
    }
}
