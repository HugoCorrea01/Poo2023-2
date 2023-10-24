import java.io.*;
import java.util.HashMap;
import java.util.Map;

class AlunoDAO {
    private Map<String, Aluno> alunos;
    private String arquivoAlunos;

    public AlunoDAO(String arquivoAlunos) {
        alunos = new HashMap<>();
        this.arquivoAlunos = arquivoAlunos;
        carregarAlunos();
    }

    public void adicionarAluno(Aluno aluno) {
        alunos.put(aluno.getMatricula(), aluno);
        salvarAlunos();
    }

    public void removerAluno(String matricula) {
        alunos.remove(matricula);
        salvarAlunos();
    }

    public void atualizarCurso(String matricula, String novoCurso) {
        if (alunos.containsKey(matricula)) {
            Aluno aluno = alunos.get(matricula);
            aluno.setCurso(novoCurso);
            salvarAlunos();
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

    private void carregarAlunos() {
        try (BufferedReader reader = new BufferedReader(new FileReader(arquivoAlunos))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                String matricula = parts[0];
                String nome = parts[1];
                String curso = parts[2];
                alunos.put(matricula, new Aluno(nome, curso, matricula));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    
    private void salvarAlunos() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(arquivoAlunos))) {
            for (Aluno aluno : alunos.values()) {
                writer.write(aluno.getMatricula() + "," + aluno.getNome() + "," + aluno.getCurso() + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}