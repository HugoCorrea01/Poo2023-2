public class App {
    public static void main(String[] args) {
        AlunoDAO alunoManager = new AlunoDAO();

        alunoManager.adicionarAluno(new Aluno("Guilherme", "ADS", "202301146399"));
        alunoManager.adicionarAluno(new Aluno("Hugo", "ADS", "202301134391"));

        System.out.println("Lista de alunos:");
        alunoManager.listarAlunos();

        alunoManager.atualizarCurso("202301146399", "Ciência da Computação");

        // Listar informações de um aluno
        Aluno aluno = alunoManager.obterAluno("202301146399");
        if (aluno != null) {
            System.out.println("Informações do aluno com matrícula 202301146399:");
            System.out.println("Matrícula: " + aluno.getMatricula() + ", Nome: " + aluno.getNome() + ", Curso: " + aluno.getCurso());
        } else {
            System.out.println("Aluno não encontrado.");
        }

        // Remover um aluno
        alunoManager.removerAluno("202301146399");

        // Listar todos os alunos novamente
        System.out.println("Lista de alunos após remoção:");
        alunoManager.listarAlunos();

    }
}