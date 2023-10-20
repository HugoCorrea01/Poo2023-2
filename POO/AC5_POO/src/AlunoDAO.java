import java.util.HashMap;
import java.util.Map;

class AlunoDAO {
    private Map<String, Aluno> alunos;

    public AlunoDAO() {
        alunos = new HashMap<>();
    }

    public void adicionarAluno(Aluno aluno) {
        alunos.put(aluno.getMatricula(), aluno);
    }

    public void removerAluno(String matricula) {
        alunos.remove(matricula);
    }

    public void atualizarCurso(String matricula, String novoCurso) {
        if (alunos.containsKey(matricula)) {
            Aluno aluno = alunos.get(matricula);
            aluno.setCurso(novoCurso);
        }
    }

    public Aluno obterAluno(String matricula) {
        return alunos.get(matricula);
    }

    public void listarAlunos() {
        for (Aluno aluno : alunos.values()) {
            System.out.println("Matrícula: " + aluno.getMatricula() + ", Nome: " + aluno.getNome() + ", Curso: " + aluno.getCurso());
        }
    }
}
