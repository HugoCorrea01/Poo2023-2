
public class Aluno {
    private String nome, curso, matricula;

    public Aluno(String nome, String curso, String matricula){
        this.nome = nome;
        this.curso = curso;
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public String getCurso() {
        return curso;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setNome(String novoNome) {
        this.nome = novoNome;
    }

    public void setCurso(String novoCurso) {
        this.curso = novoCurso;
    }

    public void setMatricula(String novaMatricula){
        this.matricula = novaMatricula;
    }
}
